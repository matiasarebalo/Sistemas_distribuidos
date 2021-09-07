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

    def get_url(self, message):
        message = pb2.Message(message=message)
        print(f'{message}')
        return self.stub.GetServerResponse(message)