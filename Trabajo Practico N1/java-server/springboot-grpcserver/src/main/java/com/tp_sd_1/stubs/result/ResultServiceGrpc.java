package com.tp_sd_1.stubs.result;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Now let's define our service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: result.proto")
public final class ResultServiceGrpc {

  private ResultServiceGrpc() {}

  public static final String SERVICE_NAME = "com.tp_sd_1.stubs.result.ResultService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tp_sd_1.stubs.result.ResultRequest,
      com.tp_sd_1.stubs.result.ResultResponse> getGetResultForMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getResultForMedicamento",
      requestType = com.tp_sd_1.stubs.result.ResultRequest.class,
      responseType = com.tp_sd_1.stubs.result.ResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tp_sd_1.stubs.result.ResultRequest,
      com.tp_sd_1.stubs.result.ResultResponse> getGetResultForMedicamentoMethod() {
    io.grpc.MethodDescriptor<com.tp_sd_1.stubs.result.ResultRequest, com.tp_sd_1.stubs.result.ResultResponse> getGetResultForMedicamentoMethod;
    if ((getGetResultForMedicamentoMethod = ResultServiceGrpc.getGetResultForMedicamentoMethod) == null) {
      synchronized (ResultServiceGrpc.class) {
        if ((getGetResultForMedicamentoMethod = ResultServiceGrpc.getGetResultForMedicamentoMethod) == null) {
          ResultServiceGrpc.getGetResultForMedicamentoMethod = getGetResultForMedicamentoMethod = 
              io.grpc.MethodDescriptor.<com.tp_sd_1.stubs.result.ResultRequest, com.tp_sd_1.stubs.result.ResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tp_sd_1.stubs.result.ResultService", "getResultForMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tp_sd_1.stubs.result.ResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tp_sd_1.stubs.result.ResultResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ResultServiceMethodDescriptorSupplier("getResultForMedicamento"))
                  .build();
          }
        }
     }
     return getGetResultForMedicamentoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResultServiceStub newStub(io.grpc.Channel channel) {
    return new ResultServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResultServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ResultServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResultServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ResultServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Now let's define our service
   * </pre>
   */
  public static abstract class ResultServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getResultForMedicamento(com.tp_sd_1.stubs.result.ResultRequest request,
        io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.result.ResultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetResultForMedicamentoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetResultForMedicamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tp_sd_1.stubs.result.ResultRequest,
                com.tp_sd_1.stubs.result.ResultResponse>(
                  this, METHODID_GET_RESULT_FOR_MEDICAMENTO)))
          .build();
    }
  }

  /**
   * <pre>
   * Now let's define our service
   * </pre>
   */
  public static final class ResultServiceStub extends io.grpc.stub.AbstractStub<ResultServiceStub> {
    private ResultServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResultServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResultServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResultServiceStub(channel, callOptions);
    }

    /**
     */
    public void getResultForMedicamento(com.tp_sd_1.stubs.result.ResultRequest request,
        io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.result.ResultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetResultForMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Now let's define our service
   * </pre>
   */
  public static final class ResultServiceBlockingStub extends io.grpc.stub.AbstractStub<ResultServiceBlockingStub> {
    private ResultServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResultServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResultServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResultServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tp_sd_1.stubs.result.ResultResponse getResultForMedicamento(com.tp_sd_1.stubs.result.ResultRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetResultForMedicamentoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Now let's define our service
   * </pre>
   */
  public static final class ResultServiceFutureStub extends io.grpc.stub.AbstractStub<ResultServiceFutureStub> {
    private ResultServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResultServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResultServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResultServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tp_sd_1.stubs.result.ResultResponse> getResultForMedicamento(
        com.tp_sd_1.stubs.result.ResultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetResultForMedicamentoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RESULT_FOR_MEDICAMENTO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResultServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResultServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RESULT_FOR_MEDICAMENTO:
          serviceImpl.getResultForMedicamento((com.tp_sd_1.stubs.result.ResultRequest) request,
              (io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.result.ResultResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ResultServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResultServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tp_sd_1.stubs.result.Result.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResultService");
    }
  }

  private static final class ResultServiceFileDescriptorSupplier
      extends ResultServiceBaseDescriptorSupplier {
    ResultServiceFileDescriptorSupplier() {}
  }

  private static final class ResultServiceMethodDescriptorSupplier
      extends ResultServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResultServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ResultServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResultServiceFileDescriptorSupplier())
              .addMethod(getGetResultForMedicamentoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
