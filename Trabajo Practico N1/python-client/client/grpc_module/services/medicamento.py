from flask.globals import request
import grpc
import grpc_module.messages.medicamento_pb2_grpc as pb2_grpc
import grpc_module.messages.medicamento_pb2 as pb2

class MedicamentoClient(object):
    def __init__(self):
        self.host = 'localhost'
        self.server_port = 9091
        self.channel = grpc.insecure_channel(
            '{}:{}'.format(self.host, self.server_port))
        self.stub = pb2_grpc.MedicamentoServiceStub(self.channel)

    def alta(self, medicamento): 
        response = self.stub.altaMedicamento({   
            "id": 444,
            "codigo": "codigo1",
            "nombreComercial": "nombreComercial1",
            "nombreDroga": "nombreDroga1",
            "tipo": "tipo1"
        })
        
        return self.stub.GetServerResponse(response)

    def verificarCodigo(self, codigo):
        response = pb2.CodigoParaVerificar(codigo=codigo)
        return self.stub.verificarCodigo(response)

    def esPrioritario(self, codigo):
        response = pb2.CodigoParaVerificar(codigo=codigo)
        return self.stub.esPrioritario(response)

    def listarPorTipo(self, tipo):
        response = pb2.ListaPorTipoRequest(tipo=tipo)
        return self.stub.buscarPorTipoDeMedicamento(response)
    
    def listarNombreComercialA(self, letra):
        response = pb2.ListaPorPrimeraLetraDeNombreComercial(letra=letra)
        return self.stub.buscarPorPrimeraLetraDeNombreComercial(response)

    def traer_todos(self):
        response = pb2.TraerTodosRequest(todos="string_cualquiera")
        return self.stub.traerTodos(response)