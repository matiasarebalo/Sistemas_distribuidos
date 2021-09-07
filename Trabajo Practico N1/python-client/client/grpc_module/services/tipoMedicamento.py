import grpc
import grpc_module.messages.medicamento_pb2_grpc as pb2_grpc
import grpc_module.messages.medicamento_pb2 as pb2


class TipoMedicamentoClient(object):
    def __init__(self):
        self.host = 'localhost'
        self.server_port = 5020

        # instantiate a channel
        self.channel = grpc.insecure_channel(
            '{}:{}'.format(self.host, self.server_port))

        # bind the client and the server
        self.stub = pb2_grpc.TipoMedicamentoServiceStub(self.channel)

    def alta(self, tipo_medicamento):
        response = self.stub.altaTipoMedicamento(tipo_medicamento)
        return self.stub.GetServerResponse(response)

    def baja(self, id_tipo_medicamento):
        response = self.stub.bajaTipoMedicamento(id_tipo_medicamento)
        return self.stub.GetServerResponse(response)