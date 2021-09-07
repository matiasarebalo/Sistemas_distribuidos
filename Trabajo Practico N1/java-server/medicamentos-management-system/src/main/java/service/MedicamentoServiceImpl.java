package service;

import cliente.ResultClient;
import com.medicamentos_management.stubs.medicamento.MedicamentoServiceGrpc;
import com.medicamentos_management.stubs.medicamento.TipoMedicamento;
import com.medicamentos_management.stubs.medicamento.MedicamentoRequest;
import com.medicamentos_management.stubs.medicamento.MedicamentoResponse;
import com.medicamentos_management.stubs.medicamento.ListaPorPrimeraLetraDeNombreComercial;
import com.medicamentos_management.stubs.medicamento.ListaPorTipos;
import com.medicamentos_management.stubs.medicamento.MedicamentoAltaRequest;
import com.medicamentos_management.stubs.medicamento.MedicamentoAltaResponse;

import com.medicamentos_management.stubs.tipoMedicamento.TipoMedicamentoResponse;
import com.medicamentos_management.stubs.tipoMedicamento.TipoMedicamentoRequest;
import dao.MedicamentoDao;
import domain.Medicamento;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MedicamentoServiceImpl extends MedicamentoServiceGrpc.MedicamentoServiceImplBase {
	
    private MedicamentoDao medicamentoDao = new MedicamentoDao();
    private static final Logger logger = Logger.getLogger(MedicamentoServiceImpl.class.getName());

    @Override
    public void getMedicamentoInfo(MedicamentoRequest request, StreamObserver<MedicamentoResponse> responseObserver) {
        int id = request.getId();

        try{
            Medicamento medicamento = medicamentoDao.findById(id);

           // List<String> resultResponse = getResults(id);
            
            MedicamentoResponse medicamentoResponse = MedicamentoResponse.newBuilder()
                    .setId(id)
                    .setCodigo(medicamento.getCodigo())
                    .setNombreComercial(medicamento.getNombreComercial())
                    .setNombreDroga(medicamento.getNombreDroga())
                    .setTipo(medicamento.getTipo().toString())
                    .build();

            responseObserver.onNext(medicamentoResponse);
            responseObserver.onCompleted();
            
        }catch (NoSuchElementException e){
            logger.log(Level.SEVERE, "NO STUDENT FOUND WITH THE MEDICAMENTO ID :- "+id);

            // If some error occurs we sent an error with the following status which is not_found
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
    }

    public List<String> getResults(int id){

        // To connect with the ResultClient we need something called a channel
        // This is how you create a channel,
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:9090")
                .usePlaintext()
                .build();

        ResultClient resultClient = new ResultClient(channel);

        return resultClient.getResults(id);
    }


    @Override
    public void altaMedicamento(MedicamentoAltaRequest request, StreamObserver<MedicamentoAltaResponse> responseObserver) {
        int id = request.getId();
        String codigo = request.getCodigo();
        String nombreComercial = request.getNombreComercial();
        String nombreDroga = request.getNombreDroga();
        String tipo = request.getTipo();

        try{
            Medicamento medicamento = medicamentoDao.guardarMedicamento(id, codigo, nombreComercial, nombreDroga, tipo); // Let's find the student information from the student table

            MedicamentoAltaResponse medicamentoResponse = MedicamentoAltaResponse.newBuilder()
                    .setId(id)
                    .setCodigo(medicamento.getCodigo())
                    .setNombreComercial(medicamento.getNombreComercial())
                    .setNombreDroga(medicamento.getNombreDroga())
                    .setTipo(medicamento.getTipo())
                    .build();

            responseObserver.onNext(medicamentoResponse);
            responseObserver.onCompleted();
            
        }catch (NoSuchElementException e){
            logger.log(Level.SEVERE, "NO MEDICAMENTO FOUND WITH THE MEDICAMENTO ID :- "+id);

            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
    }
    
    @Override
    public void buscarPorTipo(TipoMedicamento request, StreamObserver<ListaPorTipos> responseObserver) {
        String tipo = request.getNombre();

        try {
            List<Medicamento> medicamentos = medicamentoDao.buscarPorTipo(tipo);
            List<MedicamentoResponse> medicamentoResponses = new ArrayList<>();
            MedicamentoResponse medicamentoResponse;

            for (Medicamento medicamento: medicamentos) {
                medicamentoResponse = MedicamentoResponse.newBuilder()
                        .setId(medicamento.getId())
                        .setCodigo(medicamento.getCodigo())
                        .setNombreComercial(medicamento.getNombreComercial())
                        .setNombreDroga(medicamento.getNombreDroga())
                        .setTipo(medicamento.getTipo())
                        .build();

                medicamentoResponses.add(medicamentoResponse);
            }

            ListaPorTipos listaPorTipos = ListaPorTipos.newBuilder()
                    .addAllMedicamentos(medicamentoResponses)
                    .build();

            responseObserver.onNext(listaPorTipos);
            responseObserver.onCompleted();
        } catch (NoSuchElementException e) {
            logger.log(Level.SEVERE, "NO HUBO RESULTADOS CON EL TIPO: " + tipo);
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
    }

    @Override
    public void buscarPorPrimeraLetraDeNombreComercial(ListaPorPrimeraLetraDeNombreComercial request, StreamObserver<ListaPorTipos> responseObserver) {
        String letra = request.getLetra();

        try {
            List<Medicamento> medicamentos = medicamentoDao.buscarPorLetraNombreComercial(letra);
            List<MedicamentoResponse> medicamentoResponses = new ArrayList<>();
            MedicamentoResponse medicamentoResponse;

            for (Medicamento medicamento: medicamentos) {
                medicamentoResponse = MedicamentoResponse.newBuilder()
                        .setId(medicamento.getId())
                        .setCodigo(medicamento.getCodigo())
                        .setNombreComercial(medicamento.getNombreComercial())
                        .setNombreDroga(medicamento.getNombreDroga())
                        .setTipo(medicamento.getTipo())
                        .build();

                medicamentoResponses.add(medicamentoResponse);
            }

            ListaPorTipos listaPorTipos = ListaPorTipos.newBuilder()
                    .addAllMedicamentos(medicamentoResponses)
                    .build();

            responseObserver.onNext(listaPorTipos);
            responseObserver.onCompleted();
        } catch (NoSuchElementException e) {
            logger.log(Level.SEVERE, "NO HUBO RESULTADOS PARA MEDICAMENTO CON NOMBRE COMERCIAL EMPEZADO EN: " + letra);
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
    }

}