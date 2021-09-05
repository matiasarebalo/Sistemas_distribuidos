
package com.tp_sd_1.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import com.tp_sd_1.service.ResultServiceImpl;
import com.tp_sd_1.services.implementation.*;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ResultServer {
    // Let's use a logger to log everything that we want
    private static final Logger logger = Logger.getLogger(ResultServer.class.getName());

    // The good old main method is defined here :)
    public static void main(String[] args) {
        
        /*
            All you have to do here is to create an instance of the Server class,
            To create the instance we use the ServerBuilder,
            with the ServerBuilder we have to provide the port that our ResultService will listen to
            and then the handler which is the ResultServiceImpl class to handle the requests.
        */
        Server server = ServerBuilder.forPort(9090)
                .addService(new ResultServiceImpl())
                .build();

        try {
            server.start();
            logger.log(Level.INFO, "RESULT SERVER STARTED ON PORT 9090");
            
            // This awaitTermination method will help to remain the server, otherwise the server will shutdown quickly
            server.awaitTermination();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "RESULT SERVER DID NOT START");
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, "SERVER SHUT DOWN ON INTERRUPTED");
        }

    }
}