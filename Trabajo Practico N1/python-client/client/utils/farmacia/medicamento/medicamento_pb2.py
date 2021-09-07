# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: medicamento.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='medicamento.proto',
  package='com.medicamentos_management.stubs.medicamento',
  syntax='proto3',
  serialized_options=b'P\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x11medicamento.proto\x12-com.medicamentos_management.stubs.medicamento\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x19google/protobuf/any.proto\"\x93\x01\n\x0fMedicamentoList\x12N\n\nresultList\x18\x01 \x03(\x0b\x32:.com.medicamentos_management.stubs.medicamento.Medicamento\x12\x30\n\x0bresultCount\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.Int32Value\"-\n\x0fTipoMedicamento\x12\n\n\x02id\x18\x01 \x01(\x05\x12\x0e\n\x06nombre\x18\x02 \x01(\t\"e\n\x0bMedicamento\x12\n\n\x02id\x18\x01 \x01(\x05\x12\x0e\n\x06\x63odigo\x18\x02 \x01(\t\x12\x17\n\x0fnombreComercial\x18\x03 \x01(\t\x12\x13\n\x0bnombreDroga\x18\x04 \x01(\t\x12\x0c\n\x04tipo\x18\x05 \x01(\t\" \n\x12MedicamentoRequest\x12\n\n\x02id\x18\x01 \x01(\x05\"p\n\x16MedicamentoAltaRequest\x12\n\n\x02id\x18\x01 \x01(\x05\x12\x0e\n\x06\x63odigo\x18\x02 \x01(\t\x12\x17\n\x0fnombreComercial\x18\x03 \x01(\t\x12\x13\n\x0bnombreDroga\x18\x04 \x01(\t\x12\x0c\n\x04tipo\x18\x05 \x01(\t\"m\n\x13MedicamentoResponse\x12\n\n\x02id\x18\x01 \x01(\x05\x12\x0e\n\x06\x63odigo\x18\x02 \x01(\t\x12\x17\n\x0fnombreComercial\x18\x03 \x01(\t\x12\x13\n\x0bnombreDroga\x18\x04 \x01(\t\x12\x0c\n\x04tipo\x18\x05 \x01(\t\"q\n\x17MedicamentoAltaResponse\x12\n\n\x02id\x18\x01 \x01(\x05\x12\x0e\n\x06\x63odigo\x18\x02 \x01(\t\x12\x17\n\x0fnombreComercial\x18\x03 \x01(\t\x12\x13\n\x0bnombreDroga\x18\x04 \x01(\t\x12\x0c\n\x04tipo\x18\x05 \x01(\t\"s\n\nPagination\x12\x0c\n\x04page\x18\x01 \x01(\x05\x12\x10\n\x08pageSize\x18\x02 \x01(\x05\x12\x45\n\x06search\x18\x03 \x01(\x0b\x32\x35.com.medicamentos_management.stubs.medicamento.Search\"B\n\x06Search\x12$\n\x06\x66ilter\x18\x01 \x01(\x0b\x32\x14.google.protobuf.Any\x12\x12\n\njsonFilter\x18\x02 \x01(\t2\x96\x05\n\x12MedicamentoService\x12\xa2\x01\n\x0f\x61ltaMedicamento\x12\x45.com.medicamentos_management.stubs.medicamento.MedicamentoAltaRequest\x1a\x46.com.medicamentos_management.stubs.medicamento.MedicamentoAltaResponse\"\x00\x12\x98\x01\n\x19listarMedicamentosAerosol\x12\x39.com.medicamentos_management.stubs.medicamento.Pagination\x1a>.com.medicamentos_management.stubs.medicamento.MedicamentoList\"\x00\x12\xa1\x01\n\"listarMedicamentosNombreComercialA\x12\x39.com.medicamentos_management.stubs.medicamento.Pagination\x1a>.com.medicamentos_management.stubs.medicamento.MedicamentoList\"\x00\x12\x9b\x01\n\x12getMedicamentoInfo\x12\x41.com.medicamentos_management.stubs.medicamento.MedicamentoRequest\x1a\x42.com.medicamentos_management.stubs.medicamento.MedicamentoResponseB\x02P\x01\x62\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_protobuf_dot_any__pb2.DESCRIPTOR,])




_MEDICAMENTOLIST = _descriptor.Descriptor(
  name='MedicamentoList',
  full_name='com.medicamentos_management.stubs.medicamento.MedicamentoList',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resultList', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoList.resultList', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='resultCount', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoList.resultCount', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=157,
  serialized_end=304,
)


_TIPOMEDICAMENTO = _descriptor.Descriptor(
  name='TipoMedicamento',
  full_name='com.medicamentos_management.stubs.medicamento.TipoMedicamento',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='com.medicamentos_management.stubs.medicamento.TipoMedicamento.id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='nombre', full_name='com.medicamentos_management.stubs.medicamento.TipoMedicamento.nombre', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=306,
  serialized_end=351,
)


_MEDICAMENTO = _descriptor.Descriptor(
  name='Medicamento',
  full_name='com.medicamentos_management.stubs.medicamento.Medicamento',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='com.medicamentos_management.stubs.medicamento.Medicamento.id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='codigo', full_name='com.medicamentos_management.stubs.medicamento.Medicamento.codigo', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='nombreComercial', full_name='com.medicamentos_management.stubs.medicamento.Medicamento.nombreComercial', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='nombreDroga', full_name='com.medicamentos_management.stubs.medicamento.Medicamento.nombreDroga', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tipo', full_name='com.medicamentos_management.stubs.medicamento.Medicamento.tipo', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=353,
  serialized_end=454,
)


_MEDICAMENTOREQUEST = _descriptor.Descriptor(
  name='MedicamentoRequest',
  full_name='com.medicamentos_management.stubs.medicamento.MedicamentoRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoRequest.id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=456,
  serialized_end=488,
)


_MEDICAMENTOALTAREQUEST = _descriptor.Descriptor(
  name='MedicamentoAltaRequest',
  full_name='com.medicamentos_management.stubs.medicamento.MedicamentoAltaRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoAltaRequest.id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='codigo', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoAltaRequest.codigo', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='nombreComercial', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoAltaRequest.nombreComercial', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='nombreDroga', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoAltaRequest.nombreDroga', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tipo', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoAltaRequest.tipo', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=490,
  serialized_end=602,
)


_MEDICAMENTORESPONSE = _descriptor.Descriptor(
  name='MedicamentoResponse',
  full_name='com.medicamentos_management.stubs.medicamento.MedicamentoResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoResponse.id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='codigo', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoResponse.codigo', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='nombreComercial', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoResponse.nombreComercial', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='nombreDroga', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoResponse.nombreDroga', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tipo', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoResponse.tipo', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=604,
  serialized_end=713,
)


_MEDICAMENTOALTARESPONSE = _descriptor.Descriptor(
  name='MedicamentoAltaResponse',
  full_name='com.medicamentos_management.stubs.medicamento.MedicamentoAltaResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoAltaResponse.id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='codigo', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoAltaResponse.codigo', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='nombreComercial', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoAltaResponse.nombreComercial', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='nombreDroga', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoAltaResponse.nombreDroga', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tipo', full_name='com.medicamentos_management.stubs.medicamento.MedicamentoAltaResponse.tipo', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=715,
  serialized_end=828,
)


_PAGINATION = _descriptor.Descriptor(
  name='Pagination',
  full_name='com.medicamentos_management.stubs.medicamento.Pagination',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='page', full_name='com.medicamentos_management.stubs.medicamento.Pagination.page', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='pageSize', full_name='com.medicamentos_management.stubs.medicamento.Pagination.pageSize', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='search', full_name='com.medicamentos_management.stubs.medicamento.Pagination.search', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=830,
  serialized_end=945,
)


_SEARCH = _descriptor.Descriptor(
  name='Search',
  full_name='com.medicamentos_management.stubs.medicamento.Search',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='filter', full_name='com.medicamentos_management.stubs.medicamento.Search.filter', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='jsonFilter', full_name='com.medicamentos_management.stubs.medicamento.Search.jsonFilter', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=947,
  serialized_end=1013,
)

_MEDICAMENTOLIST.fields_by_name['resultList'].message_type = _MEDICAMENTO
_MEDICAMENTOLIST.fields_by_name['resultCount'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT32VALUE
_PAGINATION.fields_by_name['search'].message_type = _SEARCH
_SEARCH.fields_by_name['filter'].message_type = google_dot_protobuf_dot_any__pb2._ANY
DESCRIPTOR.message_types_by_name['MedicamentoList'] = _MEDICAMENTOLIST
DESCRIPTOR.message_types_by_name['TipoMedicamento'] = _TIPOMEDICAMENTO
DESCRIPTOR.message_types_by_name['Medicamento'] = _MEDICAMENTO
DESCRIPTOR.message_types_by_name['MedicamentoRequest'] = _MEDICAMENTOREQUEST
DESCRIPTOR.message_types_by_name['MedicamentoAltaRequest'] = _MEDICAMENTOALTAREQUEST
DESCRIPTOR.message_types_by_name['MedicamentoResponse'] = _MEDICAMENTORESPONSE
DESCRIPTOR.message_types_by_name['MedicamentoAltaResponse'] = _MEDICAMENTOALTARESPONSE
DESCRIPTOR.message_types_by_name['Pagination'] = _PAGINATION
DESCRIPTOR.message_types_by_name['Search'] = _SEARCH
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

MedicamentoList = _reflection.GeneratedProtocolMessageType('MedicamentoList', (_message.Message,), {
  'DESCRIPTOR' : _MEDICAMENTOLIST,
  '__module__' : 'medicamento_pb2'
  # @@protoc_insertion_point(class_scope:com.medicamentos_management.stubs.medicamento.MedicamentoList)
  })
_sym_db.RegisterMessage(MedicamentoList)

TipoMedicamento = _reflection.GeneratedProtocolMessageType('TipoMedicamento', (_message.Message,), {
  'DESCRIPTOR' : _TIPOMEDICAMENTO,
  '__module__' : 'medicamento_pb2'
  # @@protoc_insertion_point(class_scope:com.medicamentos_management.stubs.medicamento.TipoMedicamento)
  })
_sym_db.RegisterMessage(TipoMedicamento)

Medicamento = _reflection.GeneratedProtocolMessageType('Medicamento', (_message.Message,), {
  'DESCRIPTOR' : _MEDICAMENTO,
  '__module__' : 'medicamento_pb2'
  # @@protoc_insertion_point(class_scope:com.medicamentos_management.stubs.medicamento.Medicamento)
  })
_sym_db.RegisterMessage(Medicamento)

MedicamentoRequest = _reflection.GeneratedProtocolMessageType('MedicamentoRequest', (_message.Message,), {
  'DESCRIPTOR' : _MEDICAMENTOREQUEST,
  '__module__' : 'medicamento_pb2'
  # @@protoc_insertion_point(class_scope:com.medicamentos_management.stubs.medicamento.MedicamentoRequest)
  })
_sym_db.RegisterMessage(MedicamentoRequest)

MedicamentoAltaRequest = _reflection.GeneratedProtocolMessageType('MedicamentoAltaRequest', (_message.Message,), {
  'DESCRIPTOR' : _MEDICAMENTOALTAREQUEST,
  '__module__' : 'medicamento_pb2'
  # @@protoc_insertion_point(class_scope:com.medicamentos_management.stubs.medicamento.MedicamentoAltaRequest)
  })
_sym_db.RegisterMessage(MedicamentoAltaRequest)

MedicamentoResponse = _reflection.GeneratedProtocolMessageType('MedicamentoResponse', (_message.Message,), {
  'DESCRIPTOR' : _MEDICAMENTORESPONSE,
  '__module__' : 'medicamento_pb2'
  # @@protoc_insertion_point(class_scope:com.medicamentos_management.stubs.medicamento.MedicamentoResponse)
  })
_sym_db.RegisterMessage(MedicamentoResponse)

MedicamentoAltaResponse = _reflection.GeneratedProtocolMessageType('MedicamentoAltaResponse', (_message.Message,), {
  'DESCRIPTOR' : _MEDICAMENTOALTARESPONSE,
  '__module__' : 'medicamento_pb2'
  # @@protoc_insertion_point(class_scope:com.medicamentos_management.stubs.medicamento.MedicamentoAltaResponse)
  })
_sym_db.RegisterMessage(MedicamentoAltaResponse)

Pagination = _reflection.GeneratedProtocolMessageType('Pagination', (_message.Message,), {
  'DESCRIPTOR' : _PAGINATION,
  '__module__' : 'medicamento_pb2'
  # @@protoc_insertion_point(class_scope:com.medicamentos_management.stubs.medicamento.Pagination)
  })
_sym_db.RegisterMessage(Pagination)

Search = _reflection.GeneratedProtocolMessageType('Search', (_message.Message,), {
  'DESCRIPTOR' : _SEARCH,
  '__module__' : 'medicamento_pb2'
  # @@protoc_insertion_point(class_scope:com.medicamentos_management.stubs.medicamento.Search)
  })
_sym_db.RegisterMessage(Search)


DESCRIPTOR._options = None

_MEDICAMENTOSERVICE = _descriptor.ServiceDescriptor(
  name='MedicamentoService',
  full_name='com.medicamentos_management.stubs.medicamento.MedicamentoService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=1016,
  serialized_end=1678,
  methods=[
  _descriptor.MethodDescriptor(
    name='altaMedicamento',
    full_name='com.medicamentos_management.stubs.medicamento.MedicamentoService.altaMedicamento',
    index=0,
    containing_service=None,
    input_type=_MEDICAMENTOALTAREQUEST,
    output_type=_MEDICAMENTOALTARESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='listarMedicamentosAerosol',
    full_name='com.medicamentos_management.stubs.medicamento.MedicamentoService.listarMedicamentosAerosol',
    index=1,
    containing_service=None,
    input_type=_PAGINATION,
    output_type=_MEDICAMENTOLIST,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='listarMedicamentosNombreComercialA',
    full_name='com.medicamentos_management.stubs.medicamento.MedicamentoService.listarMedicamentosNombreComercialA',
    index=2,
    containing_service=None,
    input_type=_PAGINATION,
    output_type=_MEDICAMENTOLIST,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='getMedicamentoInfo',
    full_name='com.medicamentos_management.stubs.medicamento.MedicamentoService.getMedicamentoInfo',
    index=3,
    containing_service=None,
    input_type=_MEDICAMENTOREQUEST,
    output_type=_MEDICAMENTORESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_MEDICAMENTOSERVICE)

DESCRIPTOR.services_by_name['MedicamentoService'] = _MEDICAMENTOSERVICE

# @@protoc_insertion_point(module_scope)