from flask_restful import Resource
from flask import jsonify, request

class TipoMedicamento(Resource):
    """TipoMedicamento' endpoint."""

    def get(self, id):

        return jsonify({'msg': id})

    def put(self, id):

        data = request.get_json()

        return jsonify({
            'msg': 'Tipo de Medicamento actualizado satisfactoriamente.',
        })


    def delete(self, id):

        return jsonify({'msg': 'Tipo de Medicamento eliminado satisfactoriamente.'})


class TipoMedicamentoList(Resource):
    """TipoMedicamento' list endpoint."""

    def get(cls):

        return jsonify({'msg': 'Todos los Tipo de Medicamentos.'})

    def post(self):

        data = request.get_json()    

        return jsonify({
            'msg': 'Tipo de Medicamento creado satisfactoriamente.',
        })