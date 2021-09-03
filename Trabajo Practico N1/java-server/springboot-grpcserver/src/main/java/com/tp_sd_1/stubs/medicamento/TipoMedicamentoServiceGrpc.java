package com.tp_sd_1.stubs.medicamento;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: medicamento.proto")
public final class TipoMedicamentoServiceGrpc {

  private TipoMedicamentoServiceGrpc() {}

  public static final String SERVICE_NAME = "com.tp_sd_1.stubs.medicamento.TipoMedicamentoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tp_sd_1.stubs.medicamento.TipoMedicamento,
      com.tp_sd_1.stubs.medicamento.TipoMedicamento> getAltaTipoMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "altaTipoMedicamento",
      requestType = com.tp_sd_1.stubs.medicamento.TipoMedicamento.class,
      responseType = com.tp_sd_1.stubs.medicamento.TipoMedicamento.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tp_sd_1.stubs.medicamento.TipoMedicamento,
      com.tp_sd_1.stubs.medicamento.TipoMedicamento> getAltaTipoMedicamentoMethod() {
    io.grpc.MethodDescriptor<com.tp_sd_1.stubs.medicamento.TipoMedicamento, com.tp_sd_1.stubs.medicamento.TipoMedicamento> getAltaTipoMedicamentoMethod;
    if ((getAltaTipoMedicamentoMethod = TipoMedicamentoServiceGrpc.getAltaTipoMedicamentoMethod) == null) {
      synchronized (TipoMedicamentoServiceGrpc.class) {
        if ((getAltaTipoMedicamentoMethod = TipoMedicamentoServiceGrpc.getAltaTipoMedicamentoMethod) == null) {
          TipoMedicamentoServiceGrpc.getAltaTipoMedicamentoMethod = getAltaTipoMedicamentoMethod = 
              io.grpc.MethodDescriptor.<com.tp_sd_1.stubs.medicamento.TipoMedicamento, com.tp_sd_1.stubs.medicamento.TipoMedicamento>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tp_sd_1.stubs.medicamento.TipoMedicamentoService", "altaTipoMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tp_sd_1.stubs.medicamento.TipoMedicamento.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tp_sd_1.stubs.medicamento.TipoMedicamento.getDefaultInstance()))
                  .setSchemaDescriptor(new TipoMedicamentoServiceMethodDescriptorSupplier("altaTipoMedicamento"))
                  .build();
          }
        }
     }
     return getAltaTipoMedicamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      com.google.protobuf.Empty> getBajaTipoMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bajaTipoMedicamento",
      requestType = com.google.protobuf.Int32Value.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      com.google.protobuf.Empty> getBajaTipoMedicamentoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int32Value, com.google.protobuf.Empty> getBajaTipoMedicamentoMethod;
    if ((getBajaTipoMedicamentoMethod = TipoMedicamentoServiceGrpc.getBajaTipoMedicamentoMethod) == null) {
      synchronized (TipoMedicamentoServiceGrpc.class) {
        if ((getBajaTipoMedicamentoMethod = TipoMedicamentoServiceGrpc.getBajaTipoMedicamentoMethod) == null) {
          TipoMedicamentoServiceGrpc.getBajaTipoMedicamentoMethod = getBajaTipoMedicamentoMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Int32Value, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tp_sd_1.stubs.medicamento.TipoMedicamentoService", "bajaTipoMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TipoMedicamentoServiceMethodDescriptorSupplier("bajaTipoMedicamento"))
                  .build();
          }
        }
     }
     return getBajaTipoMedicamentoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TipoMedicamentoServiceStub newStub(io.grpc.Channel channel) {
    return new TipoMedicamentoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TipoMedicamentoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TipoMedicamentoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TipoMedicamentoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TipoMedicamentoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TipoMedicamentoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void altaTipoMedicamento(com.tp_sd_1.stubs.medicamento.TipoMedicamento request,
        io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.medicamento.TipoMedicamento> responseObserver) {
      asyncUnimplementedUnaryCall(getAltaTipoMedicamentoMethod(), responseObserver);
    }

    /**
     */
    public void bajaTipoMedicamento(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getBajaTipoMedicamentoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAltaTipoMedicamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tp_sd_1.stubs.medicamento.TipoMedicamento,
                com.tp_sd_1.stubs.medicamento.TipoMedicamento>(
                  this, METHODID_ALTA_TIPO_MEDICAMENTO)))
          .addMethod(
            getBajaTipoMedicamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int32Value,
                com.google.protobuf.Empty>(
                  this, METHODID_BAJA_TIPO_MEDICAMENTO)))
          .build();
    }
  }

  /**
   */
  public static final class TipoMedicamentoServiceStub extends io.grpc.stub.AbstractStub<TipoMedicamentoServiceStub> {
    private TipoMedicamentoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TipoMedicamentoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TipoMedicamentoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TipoMedicamentoServiceStub(channel, callOptions);
    }

    /**
     */
    public void altaTipoMedicamento(com.tp_sd_1.stubs.medicamento.TipoMedicamento request,
        io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.medicamento.TipoMedicamento> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAltaTipoMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bajaTipoMedicamento(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBajaTipoMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TipoMedicamentoServiceBlockingStub extends io.grpc.stub.AbstractStub<TipoMedicamentoServiceBlockingStub> {
    private TipoMedicamentoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TipoMedicamentoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TipoMedicamentoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TipoMedicamentoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tp_sd_1.stubs.medicamento.TipoMedicamento altaTipoMedicamento(com.tp_sd_1.stubs.medicamento.TipoMedicamento request) {
      return blockingUnaryCall(
          getChannel(), getAltaTipoMedicamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty bajaTipoMedicamento(com.google.protobuf.Int32Value request) {
      return blockingUnaryCall(
          getChannel(), getBajaTipoMedicamentoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TipoMedicamentoServiceFutureStub extends io.grpc.stub.AbstractStub<TipoMedicamentoServiceFutureStub> {
    private TipoMedicamentoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TipoMedicamentoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TipoMedicamentoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TipoMedicamentoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tp_sd_1.stubs.medicamento.TipoMedicamento> altaTipoMedicamento(
        com.tp_sd_1.stubs.medicamento.TipoMedicamento request) {
      return futureUnaryCall(
          getChannel().newCall(getAltaTipoMedicamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> bajaTipoMedicamento(
        com.google.protobuf.Int32Value request) {
      return futureUnaryCall(
          getChannel().newCall(getBajaTipoMedicamentoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALTA_TIPO_MEDICAMENTO = 0;
  private static final int METHODID_BAJA_TIPO_MEDICAMENTO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TipoMedicamentoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TipoMedicamentoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALTA_TIPO_MEDICAMENTO:
          serviceImpl.altaTipoMedicamento((com.tp_sd_1.stubs.medicamento.TipoMedicamento) request,
              (io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.medicamento.TipoMedicamento>) responseObserver);
          break;
        case METHODID_BAJA_TIPO_MEDICAMENTO:
          serviceImpl.bajaTipoMedicamento((com.google.protobuf.Int32Value) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class TipoMedicamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TipoMedicamentoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tp_sd_1.stubs.medicamento.MedicamentoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TipoMedicamentoService");
    }
  }

  private static final class TipoMedicamentoServiceFileDescriptorSupplier
      extends TipoMedicamentoServiceBaseDescriptorSupplier {
    TipoMedicamentoServiceFileDescriptorSupplier() {}
  }

  private static final class TipoMedicamentoServiceMethodDescriptorSupplier
      extends TipoMedicamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TipoMedicamentoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TipoMedicamentoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TipoMedicamentoServiceFileDescriptorSupplier())
              .addMethod(getAltaTipoMedicamentoMethod())
              .addMethod(getBajaTipoMedicamentoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
