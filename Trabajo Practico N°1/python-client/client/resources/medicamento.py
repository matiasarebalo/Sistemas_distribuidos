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

        return jsonify({
            'msg': 'Todos los Medicamentos.',
            'medicamentos': [
                {
                    'id': '1',
                    'codigo': 'XX',
                    'nombreComercial': 'nombreComercial1',
                    'nombreDroga': 'nombreDroga1',
                    'tipo': 
                        {
                            'id': '1',
                            'nombre': 'tipoMedicamento1'
                        }
                },
                {
                    'id': '2',
                    'codigo': 'XX',
                    'nombreComercial': 'nombreComercial2',
                    'nombreDroga': 'nombreDroga2',
                    'tipo': 
                        {
                            'id': '2',
                            'nombre': 'tipoMedicamento2'
                        }
                },
                {
                    'id': '3',
                    'codigo': 'XX',
                    'nombreComercial': 'nombreComercial3',
                    'nombreDroga': 'nombreDroga3',
                    'tipo': 
                        {
                            'id': '3',
                            'nombre': 'tipoMedicamento3'
                        }
                },

            ]
        })

    def post(self):

        data = request.get_json()    

        return jsonify({
            'msg': 'Medicamento creado satisfactoriamente.',
        })