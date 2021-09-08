package service;

import cliente.ResultClient;
//import com.medicamentos_management.stubs.medicamento.*;

//import com.medicamentos_management.stubs.medicamento.*;
import com.google.protobuf.Empty;
import com.medicamentos_management.stubs.tipoMedicamento.*;

import domain.TipoMedicamento;
import dao.TipoMedicamentoDao;
import domain.TipoMedicamento;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

//import com.medicamentos_management.stubs.medicamento.*;
//import com.medicamentos_management.stubs.medicamento.*;

public class TipoMedicamentoServiceImpl extends TipoMedicamentoServiceGrpc.TipoMedicamentoServiceImplBase {

    private TipoMedicamentoDao tipoMedicamentoDao = new TipoMedicamentoDao();

    private static final Logger logger = Logger.getLogger(TipoMedicamentoServiceImpl.class.getName());

    @Override
    public void altaTipoMedicamento(AltaTipoMedicamentoRequest request, StreamObserver<AltaTipoMedicamentoResponse> responseObserver) {
        String nombre = request.getNombre();

        try{
            TipoMedicamento tipoMedicamento = tipoMedicamentoDao.guardarTipo(nombre, true);

            AltaTipoMedicamentoResponse tipoMedicamentoResponse = AltaTipoMedicamentoResponse.newBuilder()
                    .setId(tipoMedicamento.getId())
                    .setNombre(nombre)
                    .setActivo(tipoMedicamento.isActivo())
                    .build();

            responseObserver.onNext(tipoMedicamentoResponse);
            responseObserver.onCompleted();
        }catch (NoSuchElementException e){

            logger.log(Level.SEVERE, "NO TIPO MEDICAMENTO FOUND WITH THE TIPO MEDICAMENTO ID :- "+nombre);
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
    }

    @Override
    public void bajaTipoMedicamento(IdBajaRequest request, StreamObserver<IdBajaResponse> responseObserver) {
        int id = request.getId();

        try{
            int baja = tipoMedicamentoDao.bajaTipo(id);

            IdBajaResponse idBaja = IdBajaResponse.newBuilder()
                    .setBaja("Se ha dado de baja el tipo de medicamento")
                    .build();

            responseObserver.onNext(idBaja);
            responseObserver.onCompleted();

        }catch (NoSuchElementException e){
            logger.log(Level.SEVERE, "NO TIPO MEDICAMENTO FOUND WITH THE TIPO MEDICAMENTO ID :- ");
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
    }
    
    @Override
    public void traerTodos(TraerTodosRequest request, StreamObserver<TraerTodosResponse> responseObserver) {
        try {
            List<TipoMedicamento> listaTipos = tipoMedicamentoDao.traerTodos();
            TipoMedicamentoResponse tipoMedicamentoResponse;
            List<TipoMedicamentoResponse> tipos = new ArrayList<>();

            for (TipoMedicamento t: listaTipos) {
                tipoMedicamentoResponse = TipoMedicamentoResponse.newBuilder()
                        .setId(t.getId())
                        .setNombre(t.getNombre())
                        .build();

                tipos.add(tipoMedicamentoResponse);
            }

            TraerTodosResponse todosResponse = TraerTodosResponse.newBuilder()
                    .addAllTodos(tipos)
                    .build();

            responseObserver.onNext(todosResponse);
            responseObserver.onCompleted();
        } catch (NoSuchElementException e) {
            logger.log(Level.SEVERE, "NO HUBO RESULTADOS PARA LA CONSULTA");
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
    }

}