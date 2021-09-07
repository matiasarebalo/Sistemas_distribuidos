from flask import Flask, render_template, request, redirect, url_for

from grpc_module.services.medicamento import MedicamentoClient
from grpc_module.services.tipoMedicamento import TipoMedicamentoClient

medicamento_client = MedicamentoClient()
tipo_medicamento_client = TipoMedicamentoClient()


app = Flask(__name__)

# Home
@app.route('/')
def home():
    return render_template('home/home.html')


# TipoMedicamento
@app.route('/tipoMedicamento/')
def homeTipoMedicamento():
    return render_template('tipoMedicamento/homeTipoMedicamento.html')

@app.route('/tipoMedicamento/alta', methods=["POST"])
def altaTipoMedicamento():
    if request.method == "POST":
        tipo_medicamento_form = request.form.to_dict()
        
        #Le mandamos la data al server y el nos deberia devolver un string o lo que sea.
        server_msg = tipo_medicamento_client.alta(tipo_medicamento_form)
        print(server_msg)

        return redirect(url_for('homeTipoMedicamento'))

@app.route('/tipoMedicamento/<int:idTipoMedicamento>/baja', methods=['GET'])
def bajaTipoMedicamento(idTipoMedicamento):
    # aca hacemos la baja logica
    # despues de la baja logica volvemos al home.
    return render_template('tipoMedicamento/homeTipoMedicamento.html')


# Medicamento
@app.route('/medicamento/')
def homeMedicamento():
    return render_template('medicamento/homeMedicamento.html')

@app.route('/medicamento/alta', methods=["GET", "POST"])
def altaMedicamento():
    if request.method == "GET":
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