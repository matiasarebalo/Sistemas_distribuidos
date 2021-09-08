from flask import Flask, render_template, request, flash, redirect, url_for, g

from grpc_module.services.medicamento import MedicamentoClient
from grpc_module.services.tipoMedicamento import TipoMedicamentoClient
from google.protobuf.json_format import MessageToJson, MessageToDict

import json

medicamento_client = MedicamentoClient()
tipo_medicamento_client = TipoMedicamentoClient()


app = Flask(__name__)
app.secret_key = b'_5#y2L"F4Q8z\n\xec]/'

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

################################ TipoMedicamento ################################

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
        flash('Tipo de Medicamento agregado correctamente.')
        return redirect(url_for('homeTipoMedicamento'))

@app.route('/tipoMedicamento/<int:idTipoMedicamento>/baja', methods=['GET'])
def bajaTipoMedicamento(idTipoMedicamento):
    tipo_medicamento_client.baja(id_tipo_medicamento=idTipoMedicamento)
    flash('Tipo de Medicamento dado de baja correctamente.')
    return redirect(url_for('homeTipoMedicamento'))


################################ Medicamento ################################

@app.route('/medicamento/')
def homeMedicamento():
    medicamentos = medicamento_client.traer_todos()

    try:
        g.medicamentos = parsear_todos(lista=medicamentos, response_name="todos")
    except Exception as e:
        g.medicamentos = []

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
        data = request.form.to_dict()

        server_msg = medicamento_client.alta(
            data['codigo_numerico'], 
            data['nombre_comercial'], 
            data['nombre_droga'],
            data['tipo']
        ) 
        print(server_msg)
        flash('Medicamento agregado correctamente.')
        return redirect(url_for('homeMedicamento'))

@app.route('/medicamento/listarPorTipo', methods=["GET", "POST"])
def listarMedicamentosAerosol():

    try:
        tipo_medicamentos = tipo_medicamento_client.traer_todos()
        g.tipo_medicamentos = parsear_todos(lista=tipo_medicamentos, response_name="todos")
    except Exception as e:
        g.tipo_medicamentos = []

    if request.method == "GET":
        return render_template('medicamento/listarPorTipo.html')
    elif request.method == "POST":
        try:

            data = request.form.to_dict()
            medicamentos = medicamento_client.listarPorTipo(data['tipo'])
            g.medicamentos = parsear_todos(lista=medicamentos, response_name="medicamentos")
            
        except Exception as e:
            g.medicamentos = []

    return render_template('medicamento/listarPorTipo.html')

@app.route('/medicamento/listarNombreComercial', methods=["GET", "POST"])
def listarMedicamentosNombreComercial():

    if request.method == "GET":
        return render_template('medicamento/listarNombreComercial.html')
    elif request.method == "POST":
        try:
            
            data = request.form.to_dict()

            medicamentos = medicamento_client.listarNombreComercialA(data['letra'])

            g.medicamentos = parsear_todos(lista=medicamentos, response_name="medicamentos")
            
        except Exception as e:
            g.medicamentos = []

    return render_template('medicamento/listarNombreComercial.html')

@app.route('/medicamento/<string:codigo>/esPrioritario', methods=['GET'])
def esPrioritario(codigo):
    response = medicamento_client.esPrioritario(codigo)
    response = MessageToDict(response)
    if response:
        g.verificado = True
    else:
        g.verificado = False
    return render_template('medicamento/esPrioritario.html')

@app.route('/medicamento/<string:codigo>/verificarCodigo', methods=['GET'])
def verificarCodigo(codigo):
    print(codigo)
    response = medicamento_client.verificarCodigo(codigo)
    response = MessageToDict(response)
    if response:
        g.verificado = True
    else:
        g.verificado = False
    return render_template('medicamento/verificarCodigo.html')


if __name__ == '__main__':
    app.run(port=4000, debug=True)