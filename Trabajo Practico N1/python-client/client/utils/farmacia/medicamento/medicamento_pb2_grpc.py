# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import medicamento_pb2 as medicamento__pb2


class MedicamentoServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.altaMedicamento = channel.unary_unary(
                '/com.medicamentos_management.stubs.medicamento.MedicamentoService/altaMedicamento',
                request_serializer=medicamento__pb2.MedicamentoAltaRequest.SerializeToString,
                response_deserializer=medicamento__pb2.MedicamentoAltaResponse.FromString,
                )
        self.listarMedicamentosAerosol = channel.unary_unary(
                '/com.medicamentos_management.stubs.medicamento.MedicamentoService/listarMedicamentosAerosol',
                request_serializer=medicamento__pb2.Pagination.SerializeToString,
                response_deserializer=medicamento__pb2.MedicamentoList.FromString,
                )
        self.listarMedicamentosNombreComercialA = channel.unary_unary(
                '/com.medicamentos_management.stubs.medicamento.MedicamentoService/listarMedicamentosNombreComercialA',
                request_serializer=medicamento__pb2.Pagination.SerializeToString,
                response_deserializer=medicamento__pb2.MedicamentoList.FromString,
                )
        self.getMedicamentoInfo = channel.unary_unary(
                '/com.medicamentos_management.stubs.medicamento.MedicamentoService/getMedicamentoInfo',
                request_serializer=medicamento__pb2.MedicamentoRequest.SerializeToString,
                response_deserializer=medicamento__pb2.MedicamentoResponse.FromString,
                )


class MedicamentoServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def altaMedicamento(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def listarMedicamentosAerosol(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def listarMedicamentosNombreComercialA(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def getMedicamentoInfo(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MedicamentoServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'altaMedicamento': grpc.unary_unary_rpc_method_handler(
                    servicer.altaMedicamento,
                    request_deserializer=medicamento__pb2.MedicamentoAltaRequest.FromString,
                    response_serializer=medicamento__pb2.MedicamentoAltaResponse.SerializeToString,
            ),
            'listarMedicamentosAerosol': grpc.unary_unary_rpc_method_handler(
                    servicer.listarMedicamentosAerosol,
                    request_deserializer=medicamento__pb2.Pagination.FromString,
                    response_serializer=medicamento__pb2.MedicamentoList.SerializeToString,
            ),
            'listarMedicamentosNombreComercialA': grpc.unary_unary_rpc_method_handler(
                    servicer.listarMedicamentosNombreComercialA,
                    request_deserializer=medicamento__pb2.Pagination.FromString,
                    response_serializer=medicamento__pb2.MedicamentoList.SerializeToString,
            ),
            'getMedicamentoInfo': grpc.unary_unary_rpc_method_handler(
                    servicer.getMedicamentoInfo,
                    request_deserializer=medicamento__pb2.MedicamentoRequest.FromString,
                    response_serializer=medicamento__pb2.MedicamentoResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'com.medicamentos_management.stubs.medicamento.MedicamentoService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class MedicamentoService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def altaMedicamento(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/com.medicamentos_management.stubs.medicamento.MedicamentoService/altaMedicamento',
            medicamento__pb2.MedicamentoAltaRequest.SerializeToString,
            medicamento__pb2.MedicamentoAltaResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def listarMedicamentosAerosol(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/com.medicamentos_management.stubs.medicamento.MedicamentoService/listarMedicamentosAerosol',
            medicamento__pb2.Pagination.SerializeToString,
            medicamento__pb2.MedicamentoList.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def listarMedicamentosNombreComercialA(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/com.medicamentos_management.stubs.medicamento.MedicamentoService/listarMedicamentosNombreComercialA',
            medicamento__pb2.Pagination.SerializeToString,
            medicamento__pb2.MedicamentoList.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def getMedicamentoInfo(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/com.medicamentos_management.stubs.medicamento.MedicamentoService/getMedicamentoInfo',
            medicamento__pb2.MedicamentoRequest.SerializeToString,
            medicamento__pb2.MedicamentoResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
