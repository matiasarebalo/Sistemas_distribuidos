from flask import Flask
from flask_restful import Api

from flask import Flask,request,jsonify,url_for,g
from flask_httpauth import HTTPBasicAuth
from flask_cors import CORS, cross_origin
from werkzeug.security import safe_str_cmp
from datetime import timedelta
from bson.objectid import ObjectId
import datetime

from resources.medicamento import Medicamento, MedicamentoList
from resources.tipoMedicamento import TipoMedicamento, TipoMedicamentoList

'''This is section 4 app.py file.'''

app = Flask(__name__)
CORS(app)

api = Api(app)

#end points:

api.add_resource(Medicamento, '/api/v1/medicamentos/<string:id>')
api.add_resource(MedicamentoList, '/api/v1/medicamentos')

api.add_resource(TipoMedicamento, '/api/v1/tipoMedicamento/<string:id>')
api.add_resource(TipoMedicamentoList, '/api/v1/tipoMedicamentos')

if __name__ == '__main__':
    app.run(port=4000, debug=True)