// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: result.proto

package com.tp_sd_1.stubs.result;

public final class Result {
  private Result() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tp_sd_1_stubs_result_ResultRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tp_sd_1_stubs_result_ResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tp_sd_1_stubs_result_ResultResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tp_sd_1_stubs_result_ResultResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014result.proto\022\030com.tp_sd_1.stubs.result" +
      "\"\033\n\rResultRequest\022\n\n\002id\030\001 \001(\t\"Z\n\016ResultR" +
      "esponse\022\n\n\002id\030\001 \001(\005\022\016\n\006codigo\030\002 \001(\t\022\027\n\017n" +
      "ombreComercial\030\003 \001(\t\022\023\n\013nombreDroga\030\004 \001(" +
      "\t2}\n\rResultService\022l\n\027getResultForMedica" +
      "mento\022\'.com.tp_sd_1.stubs.result.ResultR" +
      "equest\032(.com.tp_sd_1.stubs.result.Result" +
      "ResponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_tp_sd_1_stubs_result_ResultRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_tp_sd_1_stubs_result_ResultRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tp_sd_1_stubs_result_ResultRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_tp_sd_1_stubs_result_ResultResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_tp_sd_1_stubs_result_ResultResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tp_sd_1_stubs_result_ResultResponse_descriptor,
        new java.lang.String[] { "Id", "Codigo", "NombreComercial", "NombreDroga", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}