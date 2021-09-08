# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from . import tipoMedicamento_pb2 as tipoMedicamento__pb2


class TipoMedicamentoServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.altaTipoMedicamento = channel.unary_unary(
                '/com.medicamentos_management.stubs.tipoMedicamento.TipoMedicamentoService/altaTipoMedicamento',
                request_serializer=tipoMedicamento__pb2.AltaTipoMedicamentoRequest.SerializeToString,
                response_deserializer=tipoMedicamento__pb2.AltaTipoMedicamentoResponse.FromString,
                )
        self.bajaTipoMedicamento = channel.unary_unary(
                '/com.medicamentos_management.stubs.tipoMedicamento.TipoMedicamentoService/bajaTipoMedicamento',
                request_serializer=tipoMedicamento__pb2.IdBajaRequest.SerializeToString,
                response_deserializer=tipoMedicamento__pb2.IdBajaResponse.FromString,
                )
        self.getTipoMedicamentoInfo = channel.unary_unary(
                '/com.medicamentos_management.stubs.tipoMedicamento.TipoMedicamentoService/getTipoMedicamentoInfo',
                request_serializer=tipoMedicamento__pb2.TipoMedicamentoRequest.SerializeToString,
                response_deserializer=tipoMedicamento__pb2.TipoMedicamentoResponse.FromString,
                )
        self.traerTodos = channel.unary_unary(
                '/com.medicamentos_management.stubs.tipoMedicamento.TipoMedicamentoService/traerTodos',
                request_serializer=tipoMedicamento__pb2.TraerTodosRequest.SerializeToString,
                response_deserializer=tipoMedicamento__pb2.TraerTodosResponse.FromString,
                )


class TipoMedicamentoServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def altaTipoMedicamento(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def bajaTipoMedicamento(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def getTipoMedicamentoInfo(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def traerTodos(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_TipoMedicamentoServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'altaTipoMedicamento': grpc.unary_unary_rpc_method_handler(
                    servicer.altaTipoMedicamento,
                    request_deserializer=tipoMedicamento__pb2.AltaTipoMedicamentoRequest.FromString,
                    response_serializer=tipoMedicamento__pb2.AltaTipoMedicamentoResponse.SerializeToString,
            ),
            'bajaTipoMedicamento': grpc.unary_unary_rpc_method_handler(
                    servicer.bajaTipoMedicamento,
                    request_deserializer=tipoMedicamento__pb2.IdBajaRequest.FromString,
                    response_serializer=tipoMedicamento__pb2.IdBajaResponse.SerializeToString,
            ),
            'getTipoMedicamentoInfo': grpc.unary_unary_rpc_method_handler(
                    servicer.getTipoMedicamentoInfo,
                    request_deserializer=tipoMedicamento__pb2.TipoMedicamentoRequest.FromString,
                    response_serializer=tipoMedicamento__pb2.TipoMedicamentoResponse.SerializeToString,
            ),
            'traerTodos': grpc.unary_unary_rpc_method_handler(
                    servicer.traerTodos,
                    request_deserializer=tipoMedicamento__pb2.TraerTodosRequest.FromString,
                    response_serializer=tipoMedicamento__pb2.TraerTodosResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'com.medicamentos_management.stubs.tipoMedicamento.TipoMedicamentoService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class TipoMedicamentoService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def altaTipoMedicamento(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/com.medicamentos_management.stubs.tipoMedicamento.TipoMedicamentoService/altaTipoMedicamento',
            tipoMedicamento__pb2.AltaTipoMedicamentoRequest.SerializeToString,
            tipoMedicamento__pb2.AltaTipoMedicamentoResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def bajaTipoMedicamento(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/com.medicamentos_management.stubs.tipoMedicamento.TipoMedicamentoService/bajaTipoMedicamento',
            tipoMedicamento__pb2.IdBajaRequest.SerializeToString,
            tipoMedicamento__pb2.IdBajaResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def getTipoMedicamentoInfo(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/com.medicamentos_management.stubs.tipoMedicamento.TipoMedicamentoService/getTipoMedicamentoInfo',
            tipoMedicamento__pb2.TipoMedicamentoRequest.SerializeToString,
            tipoMedicamento__pb2.TipoMedicamentoResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def traerTodos(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/com.medicamentos_management.stubs.tipoMedicamento.TipoMedicamentoService/traerTodos',
            tipoMedicamento__pb2.TraerTodosRequest.SerializeToString,
            tipoMedicamento__pb2.TraerTodosResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
