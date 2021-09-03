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
public final class MedicamentoServiceGrpc {

  private MedicamentoServiceGrpc() {}

  public static final String SERVICE_NAME = "com.tp_sd_1.stubs.medicamento.MedicamentoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tp_sd_1.stubs.medicamento.Medicamento,
      com.tp_sd_1.stubs.medicamento.Medicamento> getAltaMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "altaMedicamento",
      requestType = com.tp_sd_1.stubs.medicamento.Medicamento.class,
      responseType = com.tp_sd_1.stubs.medicamento.Medicamento.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tp_sd_1.stubs.medicamento.Medicamento,
      com.tp_sd_1.stubs.medicamento.Medicamento> getAltaMedicamentoMethod() {
    io.grpc.MethodDescriptor<com.tp_sd_1.stubs.medicamento.Medicamento, com.tp_sd_1.stubs.medicamento.Medicamento> getAltaMedicamentoMethod;
    if ((getAltaMedicamentoMethod = MedicamentoServiceGrpc.getAltaMedicamentoMethod) == null) {
      synchronized (MedicamentoServiceGrpc.class) {
        if ((getAltaMedicamentoMethod = MedicamentoServiceGrpc.getAltaMedicamentoMethod) == null) {
          MedicamentoServiceGrpc.getAltaMedicamentoMethod = getAltaMedicamentoMethod = 
              io.grpc.MethodDescriptor.<com.tp_sd_1.stubs.medicamento.Medicamento, com.tp_sd_1.stubs.medicamento.Medicamento>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tp_sd_1.stubs.medicamento.MedicamentoService", "altaMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tp_sd_1.stubs.medicamento.Medicamento.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tp_sd_1.stubs.medicamento.Medicamento.getDefaultInstance()))
                  .setSchemaDescriptor(new MedicamentoServiceMethodDescriptorSupplier("altaMedicamento"))
                  .build();
          }
        }
     }
     return getAltaMedicamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tp_sd_1.stubs.medicamento.Pagination,
      com.tp_sd_1.stubs.medicamento.MedicamentoList> getListarMedicamentosAerosolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listarMedicamentosAerosol",
      requestType = com.tp_sd_1.stubs.medicamento.Pagination.class,
      responseType = com.tp_sd_1.stubs.medicamento.MedicamentoList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tp_sd_1.stubs.medicamento.Pagination,
      com.tp_sd_1.stubs.medicamento.MedicamentoList> getListarMedicamentosAerosolMethod() {
    io.grpc.MethodDescriptor<com.tp_sd_1.stubs.medicamento.Pagination, com.tp_sd_1.stubs.medicamento.MedicamentoList> getListarMedicamentosAerosolMethod;
    if ((getListarMedicamentosAerosolMethod = MedicamentoServiceGrpc.getListarMedicamentosAerosolMethod) == null) {
      synchronized (MedicamentoServiceGrpc.class) {
        if ((getListarMedicamentosAerosolMethod = MedicamentoServiceGrpc.getListarMedicamentosAerosolMethod) == null) {
          MedicamentoServiceGrpc.getListarMedicamentosAerosolMethod = getListarMedicamentosAerosolMethod = 
              io.grpc.MethodDescriptor.<com.tp_sd_1.stubs.medicamento.Pagination, com.tp_sd_1.stubs.medicamento.MedicamentoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tp_sd_1.stubs.medicamento.MedicamentoService", "listarMedicamentosAerosol"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tp_sd_1.stubs.medicamento.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tp_sd_1.stubs.medicamento.MedicamentoList.getDefaultInstance()))
                  .setSchemaDescriptor(new MedicamentoServiceMethodDescriptorSupplier("listarMedicamentosAerosol"))
                  .build();
          }
        }
     }
     return getListarMedicamentosAerosolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tp_sd_1.stubs.medicamento.Pagination,
      com.tp_sd_1.stubs.medicamento.MedicamentoList> getListarMedicamentosNombreComercialAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listarMedicamentosNombreComercialA",
      requestType = com.tp_sd_1.stubs.medicamento.Pagination.class,
      responseType = com.tp_sd_1.stubs.medicamento.MedicamentoList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tp_sd_1.stubs.medicamento.Pagination,
      com.tp_sd_1.stubs.medicamento.MedicamentoList> getListarMedicamentosNombreComercialAMethod() {
    io.grpc.MethodDescriptor<com.tp_sd_1.stubs.medicamento.Pagination, com.tp_sd_1.stubs.medicamento.MedicamentoList> getListarMedicamentosNombreComercialAMethod;
    if ((getListarMedicamentosNombreComercialAMethod = MedicamentoServiceGrpc.getListarMedicamentosNombreComercialAMethod) == null) {
      synchronized (MedicamentoServiceGrpc.class) {
        if ((getListarMedicamentosNombreComercialAMethod = MedicamentoServiceGrpc.getListarMedicamentosNombreComercialAMethod) == null) {
          MedicamentoServiceGrpc.getListarMedicamentosNombreComercialAMethod = getListarMedicamentosNombreComercialAMethod = 
              io.grpc.MethodDescriptor.<com.tp_sd_1.stubs.medicamento.Pagination, com.tp_sd_1.stubs.medicamento.MedicamentoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tp_sd_1.stubs.medicamento.MedicamentoService", "listarMedicamentosNombreComercialA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tp_sd_1.stubs.medicamento.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tp_sd_1.stubs.medicamento.MedicamentoList.getDefaultInstance()))
                  .setSchemaDescriptor(new MedicamentoServiceMethodDescriptorSupplier("listarMedicamentosNombreComercialA"))
                  .build();
          }
        }
     }
     return getListarMedicamentosNombreComercialAMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MedicamentoServiceStub newStub(io.grpc.Channel channel) {
    return new MedicamentoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MedicamentoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MedicamentoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MedicamentoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MedicamentoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MedicamentoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void altaMedicamento(com.tp_sd_1.stubs.medicamento.Medicamento request,
        io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.medicamento.Medicamento> responseObserver) {
      asyncUnimplementedUnaryCall(getAltaMedicamentoMethod(), responseObserver);
    }

    /**
     */
    public void listarMedicamentosAerosol(com.tp_sd_1.stubs.medicamento.Pagination request,
        io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.medicamento.MedicamentoList> responseObserver) {
      asyncUnimplementedUnaryCall(getListarMedicamentosAerosolMethod(), responseObserver);
    }

    /**
     */
    public void listarMedicamentosNombreComercialA(com.tp_sd_1.stubs.medicamento.Pagination request,
        io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.medicamento.MedicamentoList> responseObserver) {
      asyncUnimplementedUnaryCall(getListarMedicamentosNombreComercialAMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAltaMedicamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tp_sd_1.stubs.medicamento.Medicamento,
                com.tp_sd_1.stubs.medicamento.Medicamento>(
                  this, METHODID_ALTA_MEDICAMENTO)))
          .addMethod(
            getListarMedicamentosAerosolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tp_sd_1.stubs.medicamento.Pagination,
                com.tp_sd_1.stubs.medicamento.MedicamentoList>(
                  this, METHODID_LISTAR_MEDICAMENTOS_AEROSOL)))
          .addMethod(
            getListarMedicamentosNombreComercialAMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tp_sd_1.stubs.medicamento.Pagination,
                com.tp_sd_1.stubs.medicamento.MedicamentoList>(
                  this, METHODID_LISTAR_MEDICAMENTOS_NOMBRE_COMERCIAL_A)))
          .build();
    }
  }

  /**
   */
  public static final class MedicamentoServiceStub extends io.grpc.stub.AbstractStub<MedicamentoServiceStub> {
    private MedicamentoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MedicamentoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MedicamentoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MedicamentoServiceStub(channel, callOptions);
    }

    /**
     */
    public void altaMedicamento(com.tp_sd_1.stubs.medicamento.Medicamento request,
        io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.medicamento.Medicamento> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAltaMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listarMedicamentosAerosol(com.tp_sd_1.stubs.medicamento.Pagination request,
        io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.medicamento.MedicamentoList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListarMedicamentosAerosolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listarMedicamentosNombreComercialA(com.tp_sd_1.stubs.medicamento.Pagination request,
        io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.medicamento.MedicamentoList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListarMedicamentosNombreComercialAMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MedicamentoServiceBlockingStub extends io.grpc.stub.AbstractStub<MedicamentoServiceBlockingStub> {
    private MedicamentoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MedicamentoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MedicamentoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MedicamentoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tp_sd_1.stubs.medicamento.Medicamento altaMedicamento(com.tp_sd_1.stubs.medicamento.Medicamento request) {
      return blockingUnaryCall(
          getChannel(), getAltaMedicamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tp_sd_1.stubs.medicamento.MedicamentoList listarMedicamentosAerosol(com.tp_sd_1.stubs.medicamento.Pagination request) {
      return blockingUnaryCall(
          getChannel(), getListarMedicamentosAerosolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tp_sd_1.stubs.medicamento.MedicamentoList listarMedicamentosNombreComercialA(com.tp_sd_1.stubs.medicamento.Pagination request) {
      return blockingUnaryCall(
          getChannel(), getListarMedicamentosNombreComercialAMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MedicamentoServiceFutureStub extends io.grpc.stub.AbstractStub<MedicamentoServiceFutureStub> {
    private MedicamentoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MedicamentoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MedicamentoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MedicamentoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tp_sd_1.stubs.medicamento.Medicamento> altaMedicamento(
        com.tp_sd_1.stubs.medicamento.Medicamento request) {
      return futureUnaryCall(
          getChannel().newCall(getAltaMedicamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tp_sd_1.stubs.medicamento.MedicamentoList> listarMedicamentosAerosol(
        com.tp_sd_1.stubs.medicamento.Pagination request) {
      return futureUnaryCall(
          getChannel().newCall(getListarMedicamentosAerosolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tp_sd_1.stubs.medicamento.MedicamentoList> listarMedicamentosNombreComercialA(
        com.tp_sd_1.stubs.medicamento.Pagination request) {
      return futureUnaryCall(
          getChannel().newCall(getListarMedicamentosNombreComercialAMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALTA_MEDICAMENTO = 0;
  private static final int METHODID_LISTAR_MEDICAMENTOS_AEROSOL = 1;
  private static final int METHODID_LISTAR_MEDICAMENTOS_NOMBRE_COMERCIAL_A = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MedicamentoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MedicamentoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALTA_MEDICAMENTO:
          serviceImpl.altaMedicamento((com.tp_sd_1.stubs.medicamento.Medicamento) request,
              (io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.medicamento.Medicamento>) responseObserver);
          break;
        case METHODID_LISTAR_MEDICAMENTOS_AEROSOL:
          serviceImpl.listarMedicamentosAerosol((com.tp_sd_1.stubs.medicamento.Pagination) request,
              (io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.medicamento.MedicamentoList>) responseObserver);
          break;
        case METHODID_LISTAR_MEDICAMENTOS_NOMBRE_COMERCIAL_A:
          serviceImpl.listarMedicamentosNombreComercialA((com.tp_sd_1.stubs.medicamento.Pagination) request,
              (io.grpc.stub.StreamObserver<com.tp_sd_1.stubs.medicamento.MedicamentoList>) responseObserver);
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

  private static abstract class MedicamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MedicamentoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tp_sd_1.stubs.medicamento.MedicamentoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MedicamentoService");
    }
  }

  private static final class MedicamentoServiceFileDescriptorSupplier
      extends MedicamentoServiceBaseDescriptorSupplier {
    MedicamentoServiceFileDescriptorSupplier() {}
  }

  private static final class MedicamentoServiceMethodDescriptorSupplier
      extends MedicamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MedicamentoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MedicamentoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MedicamentoServiceFileDescriptorSupplier())
              .addMethod(getAltaMedicamentoMethod())
              .addMethod(getListarMedicamentosAerosolMethod())
              .addMethod(getListarMedicamentosNombreComercialAMethod())
              .build();
        }
      }
    }
    return result;
  }
}
