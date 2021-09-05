from flask import Flask, render_template, request, redirect, url_for

#from resources.medicamento import Medicamento, MedicamentoList
#from resources.tipoMedicamento import TipoMedicamento, TipoMedicamentoList

app = Flask(__name__)

# Home
@app.route('/')
def home():
    return render_template('home/home.html')


# TipoMedicamento
@app.route('/tipoMedicamento/')
def homeTipoMedicamento():
    return render_template('tipoMedicamento/homeTipoMedicamento.html')

@app.route('/tipoMedicamento/alta')
def altaTipoMedicamento():
    if request.method == "GET":
        return render_template('tipoMedicamento/altaTipoMedicamento.html')
    elif request.method == "POST":
        tipo_medicamento_form = request.form.to_dict()
        #Llamamos al proceso que hace el alta
        #...
        #Volvemos al home
        return redirect(url_for('homeTipoMedicamento'))

@app.route('/tipoMedicamento/baja/<int:idMedicamento>')
def bajaTipoMedicamento(idMedicamento):
    # aca hacemos la baja logica
    # despues de la baja logica volvemos al home.
    return render_template('tipoMedicamento/homeTipoMedicamento.html')


# Medicamento
@app.route('/medicamento/')
def homeMedicamento():
    return render_template('medicamento/homeMedicamento.html')

@app.route('/medicamento/alta')
def altaMedicamento():
    if request.method == "GET":
        return render_template('medicamento/altaMedicamento.html')
    elif request.method == "POST":
        medicamento_form = request.form.to_dict()
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


if __name__ == '__main__':
    app.run(port=4000, debug=True)