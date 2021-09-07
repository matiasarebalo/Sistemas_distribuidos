import grpc
import grpc_module.messages.tipoMedicamento_pb2_grpc as pb2_grpc
import grpc_module.messages.tipoMedicamento_pb2 as pb2

class TipoMedicamentoClient():
    def __init__(self):
        self.host = 'localhost'
        self.server_port = 9091
        self.channel = grpc.insecure_channel(
            '{}:{}'.format(self.host, self.server_port))
        self.stub = pb2_grpc.TipoMedicamentoServiceStub(self.channel)

    def alta(self, tipo_medicamento):
        #Esto donde va?
        #a = pb2.TipoMedicamento()
        #Que recibe esto? no recibe un json? esta bien asi?
        response = self.stub.altaTipoMedicamento(request=tipo_medicamento)
        return self.stub.GetServerResponse(response)

    def baja(self, id_tipo_medicamento):
        response = self.stub.bajaTipoMedicamento(request=id_tipo_medicamento)
        return self.stub.GetServerResponse(response)