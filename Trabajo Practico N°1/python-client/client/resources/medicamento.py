from flask_restful import Resource
from flask import jsonify, request

class Medicamento(Resource):
    """Medicamento' endpoint."""

    def get(self, id):

        return jsonify({'msg': id})

    def put(self, id):

        data = request.get_json()

        return jsonify({
            'msg': 'Medicamento actualizado satisfactoriamente.',
        })


    def delete(self, id):

        return jsonify({'msg': 'Medicamento eliminado satisfactoriamente.'})


class MedicamentoList(Resource):
    """Medicamento' list endpoint."""

    def get(cls):

        return jsonify({'msg': 'Todos los Medicamentos.'})

    def post(self):

        data = request.get_json()    

        return jsonify({
            'msg': 'Medicamento creado satisfactoriamente.',
        })