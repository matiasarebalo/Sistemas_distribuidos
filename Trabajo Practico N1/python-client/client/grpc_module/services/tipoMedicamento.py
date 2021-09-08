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

    def alta(self, nombre):
        response = pb2.AltaTipoMedicamentoRequest(nombre=nombre)
        return self.stub.altaTipoMedicamento(response)

    def baja(self, id_tipo_medicamento):
        response = pb2.IdBajaRequest(id=id_tipo_medicamento)
        return self.stub.bajaTipoMedicamento(response)

    def traer_todos(self):
        response = pb2.TraerTodosRequest(todos="string_cualquiera")
        return self.stub.traerTodos(response)