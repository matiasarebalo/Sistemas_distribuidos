# Python client

## Generar codigo a partir de proto:
python -m grpc_tools.protoc --proto_path=. ./medicamento.proto --python_out=. --grpc_python_out=.