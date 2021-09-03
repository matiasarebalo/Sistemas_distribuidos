package com.tp_sd_1;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class GrpcServerApplication {

    public static void main(String[] args) throws Exception  {
        SpringApplication.run(GrpcServerApplication.class, args);
        Server server = ServerBuilder.forPort(9090).build();
        server.start();
        System.out.println("Server Started at " + server.getPort());    
        
        server.awaitTermination();
    }

}
