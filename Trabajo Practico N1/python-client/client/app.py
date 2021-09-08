from flask import Flask, render_template, request, redirect, url_for, g

from grpc_module.services.medicamento import MedicamentoClient
from grpc_module.services.tipoMedicamento import TipoMedicamentoClient
from google.protobuf.json_format import MessageToJson, MessageToDict

import json

medicamento_client = MedicamentoClient()
tipo_medicamento_client = TipoMedicamentoClient()


app = Flask(__name__)

# Home
@app.route('/')
def home():
    return render_template('home/home.html')


def parsear_todos(lista, response_name="todos"):
    lista = MessageToDict(lista)[response_name]
    for l in lista:
        if 'id' not in l:
            l['id'] = 0
    return lista

# TipoMedicamento
@app.route('/tipoMedicamento/', methods=['GET'])
def homeTipoMedicamento():
    tipo_medicamentos = tipo_medicamento_client.traer_todos()

    try:
        g.tipo_medicamentos = parsear_todos(lista=tipo_medicamentos, response_name="todos")
    except Exception as e:
        g.tipo_medicamentos = []

    return render_template('tipoMedicamento/homeTipoMedicamento.html')

@app.route('/tipoMedicamento/alta', methods=["POST"])
def altaTipoMedicamento():
    if request.method == "POST":
        data = request.form.to_dict()

        server_msg = tipo_medicamento_client.alta(nombre=data['nombre'])
        print(server_msg)

        return redirect(url_for('homeTipoMedicamento'))

@app.route('/tipoMedicamento/<int:idTipoMedicamento>/baja', methods=['GET'])
def bajaTipoMedicamento(idTipoMedicamento):
    tipo_medicamento_client.baja(id_tipo_medicamento=idTipoMedicamento)
    return redirect(url_for('homeTipoMedicamento'))


# Medicamento
@app.route('/medicamento/')
def homeMedicamento():
    return render_template('medicamento/homeMedicamento.html')

@app.route('/medicamento/alta', methods=["GET", "POST"])
def altaMedicamento():
    if request.method == "GET":
        try:
            tipo_medicamentos = tipo_medicamento_client.traer_todos()
            g.tipo_medicamentos = parsear_todos(lista=tipo_medicamentos, response_name="todos")
        except Exception as e:
            g.tipo_medicamentos = []
        return render_template('medicamento/altaMedicamento.html')
    elif request.method == "POST":
        medicamento_form = request.form.to_dict()
        print(medicamento_form)

        #Llamamos al proceso que hace el alta
        #...
        #Volvemos al home
        return redirect(url_for('homeMedicamento'))

@app.route('/medicamento/listarAerosol')
def listarMedicamentosAerosol():
    return render_template('medicamento/listarAerosol.html')

@app.route('/medicamento/listarNombreComercialA')
def listarMedicamentosNombreComercialA():
    return render_template('medicamento/listarNombreComercialA.html')

@app.route('/medicamento/<int:idMedicamento>/esPrioritario', methods=['GET'])
def esPrioritario(idMedicamento):
    return render_template('medicamento/esPrioritario.html')

@app.route('/medicamento/<int:idMedicamento>/verificarCodigo', methods=['GET'])
def verificarCodigo(idMedicamento):
    return render_template('medicamento/verificarCodigo.html')


if __name__ == '__main__':
    app.run(port=4000, debug=True)