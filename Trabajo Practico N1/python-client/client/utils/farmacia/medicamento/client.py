import grpc
import medicamento_pb2
import medicamento_pb2_grpc

print("Medicamento...")

channel = grpc.insecure_channel("localhost:9091")
stub = medicamento_pb2_grpc.MedicamentoServiceStub(channel)

# Get Medicamento
id = medicamento_pb2.MedicamentoRequest (
    id=23
)

response = stub.getMedicamentoInfo(id)

if response:
    print( "ID: {}".format(response))

# Add Medicamento

medicamento = medicamento_pb2.MedicamentoAltaRequest(
    id= 1,
    codigo= "codigo1",
    nombreComercial= "nombreComercial1",
    nombreDroga= "nombreDroga1",
    tipo= "tipo1"
)

response = stub.altaMedicamento(medicamento)

if response:
    print( "ID: {}".format(response))
