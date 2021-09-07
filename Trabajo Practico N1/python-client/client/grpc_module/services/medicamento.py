import grpc
import grpc_module.messages.medicamento_pb2_grpc as pb2_grpc
import grpc_module.messages.medicamento_pb2 as pb2


class MedicamentoClient(object):
    def __init__(self):
        self.host = 'localhost'
        self.server_port = 5010

        # instantiate a channel
        self.channel = grpc.insecure_channel(
            '{}:{}'.format(self.host, self.server_port))

        # bind the client and the server
        self.stub = pb2_grpc.MedicamentoServiceStub(self.channel)

    def alta(self, medicamento):
        response = self.stub.altaMedicamento(request=medicamento)
        return self.stub.GetServerResponse(response)

    def verificarCodigo(self, idMedicamento):
        pass
        #response = self.stub.altaMedicamento(request=medicamento)
        #return self.stub.GetServerResponse(response)

    def esPrioritario(self, idMedicamento):
        pass
        #response = self.stub.altaMedicamento(request=idMedicamento)
        #return self.stub.GetServerResponse(response)

    def listarAerosol(self, medicamento):
        #La request no deberia ser nada no? Habria que modificar el proto.
        pass
        #response = self.stub.listarMedicamentosAerosol(request=medicamento)
        #return self.stub.GetServerResponse(response)
    
    def listarNombreComercialA(self, medicamento):
        #La request no deberia ser nada no? Habria que modificar el proto.
        pass
        #response = self.stub.listarMedicamentosAerosol(request=medicamento)
        #return self.stub.GetServerResponse(response)