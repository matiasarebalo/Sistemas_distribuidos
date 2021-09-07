package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.MedicamentoServiceImpl;
import service.TipoMedicamentoServiceImpl;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MedicamentoServer {

	private static final Logger logger = Logger.getLogger(ResultServer.class.getName());

    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(9091)
                .addService(new  MedicamentoServiceImpl())
                .addService(new TipoMedicamentoServiceImpl())
                .build();
        
        try {
            server.start();
            logger.log(Level.INFO, "MEDICAMENTO SERVER STARTED ON PORT 9091");
            server.awaitTermination();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "MEDICAMENTO SERVER DID NOT START");
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, "SERVER SHUT DOWN ON INTERRUPTED");
        }

    }
}