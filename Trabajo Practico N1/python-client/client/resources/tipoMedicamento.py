'''from flask_restful import Resource
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

        return jsonify({
            'msg': 'Todos los Tipos de Medicamentos.',
            'tipoMedicamentos': [
                {
                    'id': '1',
                    'nombre': 'tipoMedicamento1'
                },
                {
                    'id': '2',
                    'nombre': 'tipoMedicamento2'
                },
                {
                    'id': '3',
                    'nombre': 'tipoMedicamento3'
                },
                {
                'id': '4',
                    'nombre': 'tipoMedicamento4'
                },
            ]
        })

    def post(self):

        data = request.get_json()    

        return jsonify({
            'msg': 'Tipo de Medicamento creado satisfactoriamente.'
        })'''