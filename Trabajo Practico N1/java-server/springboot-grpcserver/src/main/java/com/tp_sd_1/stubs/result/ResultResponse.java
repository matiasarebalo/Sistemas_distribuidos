// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: result.proto

package com.tp_sd_1.stubs.result;

/**
 * <pre>
 * This is the response message
 * </pre>
 *
 * Protobuf type {@code com.tp_sd_1.stubs.result.ResultResponse}
 */
public  final class ResultResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.tp_sd_1.stubs.result.ResultResponse)
    ResultResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResultResponse.newBuilder() to construct.
  private ResultResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResultResponse() {
    id_ = 0;
    codigo_ = "";
    nombreComercial_ = "";
    nombreDroga_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResultResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            codigo_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nombreComercial_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            nombreDroga_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tp_sd_1.stubs.result.Result.internal_static_com_tp_sd_1_stubs_result_ResultResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tp_sd_1.stubs.result.Result.internal_static_com_tp_sd_1_stubs_result_ResultResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tp_sd_1.stubs.result.ResultResponse.class, com.tp_sd_1.stubs.result.ResultResponse.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int CODIGO_FIELD_NUMBER = 2;
  private volatile java.lang.Object codigo_;
  /**
   * <code>string codigo = 2;</code>
   */
  public java.lang.String getCodigo() {
    java.lang.Object ref = codigo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      codigo_ = s;
      return s;
    }
  }
  /**
   * <code>string codigo = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCodigoBytes() {
    java.lang.Object ref = codigo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      codigo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOMBRECOMERCIAL_FIELD_NUMBER = 3;
  private volatile java.lang.Object nombreComercial_;
  /**
   * <code>string nombreComercial = 3;</code>
   */
  public java.lang.String getNombreComercial() {
    java.lang.Object ref = nombreComercial_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nombreComercial_ = s;
      return s;
    }
  }
  /**
   * <code>string nombreComercial = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNombreComercialBytes() {
    java.lang.Object ref = nombreComercial_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nombreComercial_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOMBREDROGA_FIELD_NUMBER = 4;
  private volatile java.lang.Object nombreDroga_;
  /**
   * <code>string nombreDroga = 4;</code>
   */
  public java.lang.String getNombreDroga() {
    java.lang.Object ref = nombreDroga_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nombreDroga_ = s;
      return s;
    }
  }
  /**
   * <code>string nombreDroga = 4;</code>
   */
  public com.google.protobuf.ByteString
      getNombreDrogaBytes() {
    java.lang.Object ref = nombreDroga_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nombreDroga_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getCodigoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, codigo_);
    }
    if (!getNombreComercialBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nombreComercial_);
    }
    if (!getNombreDrogaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, nombreDroga_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getCodigoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, codigo_);
    }
    if (!getNombreComercialBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nombreComercial_);
    }
    if (!getNombreDrogaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, nombreDroga_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tp_sd_1.stubs.result.ResultResponse)) {
      return super.equals(obj);
    }
    com.tp_sd_1.stubs.result.ResultResponse other = (com.tp_sd_1.stubs.result.ResultResponse) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getCodigo()
        .equals(other.getCodigo());
    result = result && getNombreComercial()
        .equals(other.getNombreComercial());
    result = result && getNombreDroga()
        .equals(other.getNombreDroga());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + CODIGO_FIELD_NUMBER;
    hash = (53 * hash) + getCodigo().hashCode();
    hash = (37 * hash) + NOMBRECOMERCIAL_FIELD_NUMBER;
    hash = (53 * hash) + getNombreComercial().hashCode();
    hash = (37 * hash) + NOMBREDROGA_FIELD_NUMBER;
    hash = (53 * hash) + getNombreDroga().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tp_sd_1.stubs.result.ResultResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tp_sd_1.stubs.result.ResultResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tp_sd_1.stubs.result.ResultResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tp_sd_1.stubs.result.ResultResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tp_sd_1.stubs.result.ResultResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tp_sd_1.stubs.result.ResultResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tp_sd_1.stubs.result.ResultResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tp_sd_1.stubs.result.ResultResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tp_sd_1.stubs.result.ResultResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tp_sd_1.stubs.result.ResultResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tp_sd_1.stubs.result.ResultResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tp_sd_1.stubs.result.ResultResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tp_sd_1.stubs.result.ResultResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * This is the response message
   * </pre>
   *
   * Protobuf type {@code com.tp_sd_1.stubs.result.ResultResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.tp_sd_1.stubs.result.ResultResponse)
      com.tp_sd_1.stubs.result.ResultResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tp_sd_1.stubs.result.Result.internal_static_com_tp_sd_1_stubs_result_ResultResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tp_sd_1.stubs.result.Result.internal_static_com_tp_sd_1_stubs_result_ResultResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tp_sd_1.stubs.result.ResultResponse.class, com.tp_sd_1.stubs.result.ResultResponse.Builder.class);
    }

    // Construct using com.tp_sd_1.stubs.result.ResultResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      codigo_ = "";

      nombreComercial_ = "";

      nombreDroga_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tp_sd_1.stubs.result.Result.internal_static_com_tp_sd_1_stubs_result_ResultResponse_descriptor;
    }

    @java.lang.Override
    public com.tp_sd_1.stubs.result.ResultResponse getDefaultInstanceForType() {
      return com.tp_sd_1.stubs.result.ResultResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tp_sd_1.stubs.result.ResultResponse build() {
      com.tp_sd_1.stubs.result.ResultResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tp_sd_1.stubs.result.ResultResponse buildPartial() {
      com.tp_sd_1.stubs.result.ResultResponse result = new com.tp_sd_1.stubs.result.ResultResponse(this);
      result.id_ = id_;
      result.codigo_ = codigo_;
      result.nombreComercial_ = nombreComercial_;
      result.nombreDroga_ = nombreDroga_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tp_sd_1.stubs.result.ResultResponse) {
        return mergeFrom((com.tp_sd_1.stubs.result.ResultResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tp_sd_1.stubs.result.ResultResponse other) {
      if (other == com.tp_sd_1.stubs.result.ResultResponse.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getCodigo().isEmpty()) {
        codigo_ = other.codigo_;
        onChanged();
      }
      if (!other.getNombreComercial().isEmpty()) {
        nombreComercial_ = other.nombreComercial_;
        onChanged();
      }
      if (!other.getNombreDroga().isEmpty()) {
        nombreDroga_ = other.nombreDroga_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.tp_sd_1.stubs.result.ResultResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tp_sd_1.stubs.result.ResultResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object codigo_ = "";
    /**
     * <code>string codigo = 2;</code>
     */
    public java.lang.String getCodigo() {
      java.lang.Object ref = codigo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codigo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string codigo = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCodigoBytes() {
      java.lang.Object ref = codigo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codigo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string codigo = 2;</code>
     */
    public Builder setCodigo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      codigo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string codigo = 2;</code>
     */
    public Builder clearCodigo() {
      
      codigo_ = getDefaultInstance().getCodigo();
      onChanged();
      return this;
    }
    /**
     * <code>string codigo = 2;</code>
     */
    public Builder setCodigoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      codigo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object nombreComercial_ = "";
    /**
     * <code>string nombreComercial = 3;</code>
     */
    public java.lang.String getNombreComercial() {
      java.lang.Object ref = nombreComercial_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nombreComercial_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nombreComercial = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNombreComercialBytes() {
      java.lang.Object ref = nombreComercial_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nombreComercial_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nombreComercial = 3;</code>
     */
    public Builder setNombreComercial(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nombreComercial_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nombreComercial = 3;</code>
     */
    public Builder clearNombreComercial() {
      
      nombreComercial_ = getDefaultInstance().getNombreComercial();
      onChanged();
      return this;
    }
    /**
     * <code>string nombreComercial = 3;</code>
     */
    public Builder setNombreComercialBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nombreComercial_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object nombreDroga_ = "";
    /**
     * <code>string nombreDroga = 4;</code>
     */
    public java.lang.String getNombreDroga() {
      java.lang.Object ref = nombreDroga_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nombreDroga_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nombreDroga = 4;</code>
     */
    public com.google.protobuf.ByteString
        getNombreDrogaBytes() {
      java.lang.Object ref = nombreDroga_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nombreDroga_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nombreDroga = 4;</code>
     */
    public Builder setNombreDroga(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nombreDroga_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nombreDroga = 4;</code>
     */
    public Builder clearNombreDroga() {
      
      nombreDroga_ = getDefaultInstance().getNombreDroga();
      onChanged();
      return this;
    }
    /**
     * <code>string nombreDroga = 4;</code>
     */
    public Builder setNombreDrogaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nombreDroga_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.tp_sd_1.stubs.result.ResultResponse)
  }

  // @@protoc_insertion_point(class_scope:com.tp_sd_1.stubs.result.ResultResponse)
  private static final com.tp_sd_1.stubs.result.ResultResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tp_sd_1.stubs.result.ResultResponse();
  }

  public static com.tp_sd_1.stubs.result.ResultResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResultResponse>
      PARSER = new com.google.protobuf.AbstractParser<ResultResponse>() {
    @java.lang.Override
    public ResultResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResultResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResultResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResultResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tp_sd_1.stubs.result.ResultResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
