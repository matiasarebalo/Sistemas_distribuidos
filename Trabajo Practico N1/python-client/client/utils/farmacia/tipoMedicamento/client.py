import grpc
import tipoMedicamento_pb2
import tipoMedicamento_pb2_grpc

print("TipoMedicamento...")

channel = grpc.insecure_channel("localhost:9091")
stub = tipoMedicamento_pb2_grpc.TipoMedicamentoServiceStub(channel)
'''
# Delete TipoMedicamento
idBaja = tipoMedicamento_pb2.IdBajaRequest(
    id=10
)

response = stub.bajaTipoMedicamento(idBaja)

if response:
    print( "ID: {}".format(response))
'''

# Add TipoMedicamento
tipoMedicamento = tipoMedicamento_pb2.TipoMedicamentoRequest(
    id=12,
    nombre="tipoMedicamento1"
)

response = stub.altaTipoMedicamento(tipoMedicamento)

if response:
    print( "ID: {}".format(response))
