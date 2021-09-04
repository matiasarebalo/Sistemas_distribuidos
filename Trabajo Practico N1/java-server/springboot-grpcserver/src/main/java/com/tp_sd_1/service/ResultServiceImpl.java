
package com.tp_sd_1.service;

//import com.tp_sd_1.stubs.result.Result;
import com.tp_sd_1.stubs.result.ResultRequest;
import com.tp_sd_1.stubs.result.ResultResponse;
import com.tp_sd_1.stubs.result.ResultServiceGrpc;
import com.tp_sd_1.dao.ResultDao;
import com.tp_sd_1.entities.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ResultServiceImpl extends ResultServiceGrpc.ResultServiceImplBase {
    // We need to have an instance of the dao class to work with the database
    private ResultDao resultDao = new ResultDao();
    // Let's use a logger to log everything that we want
    private static final Logger logger = Logger.getLogger(ResultServiceImpl.class.getName()); 
    
    
    // We have to override the getResultForStudent that was defined in the ResultService class
    // The ResultService class is an autogenerated class by the proto file
    // So, let's override the getResultForStudent method here.
    @Override
    public void getResultForMedicamento(ResultRequest request, StreamObserver<ResultResponse> responseObserver) {
        int id = request.getId(); // the student ID should be passed with the request message

        try {
            Result result = resultDao.findById(id); // Use the dao class to retrieve data
            
            /*
                In gRPC everything we create according to the builder pattern,
                here we have to generate the response message,
                in order to create that response message we use the response builder
                and then set the values for that, 
            */
            ResultResponse resultResponse = ResultResponse.newBuilder()
                    .setId(id)
                    .build();
            
            /*
                gRPC works in an asynchronous manner, so if you have ever worked with asynchronous programming
                you would know what will happen with following two methods.
                with the onNext method we send the response, once the response is sent we use onCompleted()
            */
            responseObserver.onNext(resultResponse);
            responseObserver.onCompleted();
            
        } catch (NoSuchElementException e) {
            logger.log(Level.SEVERE, "NO RESULT FOUND WITH THE STUDENT ID :- " + id);
            
            // If some error occurs we sent an error with the following status which is not_found
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());

        }


    }
}