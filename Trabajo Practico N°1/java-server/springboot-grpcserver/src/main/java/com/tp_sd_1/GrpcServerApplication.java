package com.tp_sd_1;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tp_sd_1.server.user.*;

@SpringBootApplication(scanBasePackages = {"com.tp_sd_1"})
public class GrpcServerApplication {

    public static void main(String[] args) throws Exception  {
        SpringApplication.run(GrpcServerApplication.class, args);
        Server server = ServerBuilder.forPort(9090).addService(new UserService()).build();
        server.start();
        System.out.println("Server Started at " + server.getPort());
        server.awaitTermination();
    }

}
