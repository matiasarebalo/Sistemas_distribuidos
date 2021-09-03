// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: medicamento.proto

package com.tp_sd_1.stubs.medicamento;

/**
 * Protobuf type {@code com.tp_sd_1.stubs.medicamento.Search}
 */
public  final class Search extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.tp_sd_1.stubs.medicamento.Search)
    SearchOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Search.newBuilder() to construct.
  private Search(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Search() {
    jsonFilter_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Search(
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
          case 10: {
            com.google.protobuf.Any.Builder subBuilder = null;
            if (filter_ != null) {
              subBuilder = filter_.toBuilder();
            }
            filter_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(filter_);
              filter_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            jsonFilter_ = s;
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
    return com.tp_sd_1.stubs.medicamento.MedicamentoOuterClass.internal_static_com_tp_sd_1_stubs_medicamento_Search_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tp_sd_1.stubs.medicamento.MedicamentoOuterClass.internal_static_com_tp_sd_1_stubs_medicamento_Search_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tp_sd_1.stubs.medicamento.Search.class, com.tp_sd_1.stubs.medicamento.Search.Builder.class);
  }

  public static final int FILTER_FIELD_NUMBER = 1;
  private com.google.protobuf.Any filter_;
  /**
   * <code>.google.protobuf.Any filter = 1;</code>
   */
  public boolean hasFilter() {
    return filter_ != null;
  }
  /**
   * <code>.google.protobuf.Any filter = 1;</code>
   */
  public com.google.protobuf.Any getFilter() {
    return filter_ == null ? com.google.protobuf.Any.getDefaultInstance() : filter_;
  }
  /**
   * <code>.google.protobuf.Any filter = 1;</code>
   */
  public com.google.protobuf.AnyOrBuilder getFilterOrBuilder() {
    return getFilter();
  }

  public static final int JSONFILTER_FIELD_NUMBER = 2;
  private volatile java.lang.Object jsonFilter_;
  /**
   * <code>string jsonFilter = 2;</code>
   */
  public java.lang.String getJsonFilter() {
    java.lang.Object ref = jsonFilter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jsonFilter_ = s;
      return s;
    }
  }
  /**
   * <code>string jsonFilter = 2;</code>
   */
  public com.google.protobuf.ByteString
      getJsonFilterBytes() {
    java.lang.Object ref = jsonFilter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jsonFilter_ = b;
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
    if (filter_ != null) {
      output.writeMessage(1, getFilter());
    }
    if (!getJsonFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, jsonFilter_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (filter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFilter());
    }
    if (!getJsonFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, jsonFilter_);
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
    if (!(obj instanceof com.tp_sd_1.stubs.medicamento.Search)) {
      return super.equals(obj);
    }
    com.tp_sd_1.stubs.medicamento.Search other = (com.tp_sd_1.stubs.medicamento.Search) obj;

    boolean result = true;
    result = result && (hasFilter() == other.hasFilter());
    if (hasFilter()) {
      result = result && getFilter()
          .equals(other.getFilter());
    }
    result = result && getJsonFilter()
        .equals(other.getJsonFilter());
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
    if (hasFilter()) {
      hash = (37 * hash) + FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getFilter().hashCode();
    }
    hash = (37 * hash) + JSONFILTER_FIELD_NUMBER;
    hash = (53 * hash) + getJsonFilter().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tp_sd_1.stubs.medicamento.Search parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tp_sd_1.stubs.medicamento.Search parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tp_sd_1.stubs.medicamento.Search parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tp_sd_1.stubs.medicamento.Search parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tp_sd_1.stubs.medicamento.Search parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tp_sd_1.stubs.medicamento.Search parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tp_sd_1.stubs.medicamento.Search parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tp_sd_1.stubs.medicamento.Search parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tp_sd_1.stubs.medicamento.Search parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tp_sd_1.stubs.medicamento.Search parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tp_sd_1.stubs.medicamento.Search parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tp_sd_1.stubs.medicamento.Search parseFrom(
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
  public static Builder newBuilder(com.tp_sd_1.stubs.medicamento.Search prototype) {
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
   * Protobuf type {@code com.tp_sd_1.stubs.medicamento.Search}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.tp_sd_1.stubs.medicamento.Search)
      com.tp_sd_1.stubs.medicamento.SearchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tp_sd_1.stubs.medicamento.MedicamentoOuterClass.internal_static_com_tp_sd_1_stubs_medicamento_Search_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tp_sd_1.stubs.medicamento.MedicamentoOuterClass.internal_static_com_tp_sd_1_stubs_medicamento_Search_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tp_sd_1.stubs.medicamento.Search.class, com.tp_sd_1.stubs.medicamento.Search.Builder.class);
    }

    // Construct using com.tp_sd_1.stubs.medicamento.Search.newBuilder()
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
      if (filterBuilder_ == null) {
        filter_ = null;
      } else {
        filter_ = null;
        filterBuilder_ = null;
      }
      jsonFilter_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tp_sd_1.stubs.medicamento.MedicamentoOuterClass.internal_static_com_tp_sd_1_stubs_medicamento_Search_descriptor;
    }

    @java.lang.Override
    public com.tp_sd_1.stubs.medicamento.Search getDefaultInstanceForType() {
      return com.tp_sd_1.stubs.medicamento.Search.getDefaultInstance();
    }

    @java.lang.Override
    public com.tp_sd_1.stubs.medicamento.Search build() {
      com.tp_sd_1.stubs.medicamento.Search result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tp_sd_1.stubs.medicamento.Search buildPartial() {
      com.tp_sd_1.stubs.medicamento.Search result = new com.tp_sd_1.stubs.medicamento.Search(this);
      if (filterBuilder_ == null) {
        result.filter_ = filter_;
      } else {
        result.filter_ = filterBuilder_.build();
      }
      result.jsonFilter_ = jsonFilter_;
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
      if (other instanceof com.tp_sd_1.stubs.medicamento.Search) {
        return mergeFrom((com.tp_sd_1.stubs.medicamento.Search)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tp_sd_1.stubs.medicamento.Search other) {
      if (other == com.tp_sd_1.stubs.medicamento.Search.getDefaultInstance()) return this;
      if (other.hasFilter()) {
        mergeFilter(other.getFilter());
      }
      if (!other.getJsonFilter().isEmpty()) {
        jsonFilter_ = other.jsonFilter_;
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
      com.tp_sd_1.stubs.medicamento.Search parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tp_sd_1.stubs.medicamento.Search) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Any filter_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> filterBuilder_;
    /**
     * <code>.google.protobuf.Any filter = 1;</code>
     */
    public boolean hasFilter() {
      return filterBuilder_ != null || filter_ != null;
    }
    /**
     * <code>.google.protobuf.Any filter = 1;</code>
     */
    public com.google.protobuf.Any getFilter() {
      if (filterBuilder_ == null) {
        return filter_ == null ? com.google.protobuf.Any.getDefaultInstance() : filter_;
      } else {
        return filterBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Any filter = 1;</code>
     */
    public Builder setFilter(com.google.protobuf.Any value) {
      if (filterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filter_ = value;
        onChanged();
      } else {
        filterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Any filter = 1;</code>
     */
    public Builder setFilter(
        com.google.protobuf.Any.Builder builderForValue) {
      if (filterBuilder_ == null) {
        filter_ = builderForValue.build();
        onChanged();
      } else {
        filterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Any filter = 1;</code>
     */
    public Builder mergeFilter(com.google.protobuf.Any value) {
      if (filterBuilder_ == null) {
        if (filter_ != null) {
          filter_ =
            com.google.protobuf.Any.newBuilder(filter_).mergeFrom(value).buildPartial();
        } else {
          filter_ = value;
        }
        onChanged();
      } else {
        filterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Any filter = 1;</code>
     */
    public Builder clearFilter() {
      if (filterBuilder_ == null) {
        filter_ = null;
        onChanged();
      } else {
        filter_ = null;
        filterBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Any filter = 1;</code>
     */
    public com.google.protobuf.Any.Builder getFilterBuilder() {
      
      onChanged();
      return getFilterFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any filter = 1;</code>
     */
    public com.google.protobuf.AnyOrBuilder getFilterOrBuilder() {
      if (filterBuilder_ != null) {
        return filterBuilder_.getMessageOrBuilder();
      } else {
        return filter_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : filter_;
      }
    }
    /**
     * <code>.google.protobuf.Any filter = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getFilterFieldBuilder() {
      if (filterBuilder_ == null) {
        filterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getFilter(),
                getParentForChildren(),
                isClean());
        filter_ = null;
      }
      return filterBuilder_;
    }

    private java.lang.Object jsonFilter_ = "";
    /**
     * <code>string jsonFilter = 2;</code>
     */
    public java.lang.String getJsonFilter() {
      java.lang.Object ref = jsonFilter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jsonFilter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string jsonFilter = 2;</code>
     */
    public com.google.protobuf.ByteString
        getJsonFilterBytes() {
      java.lang.Object ref = jsonFilter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jsonFilter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string jsonFilter = 2;</code>
     */
    public Builder setJsonFilter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jsonFilter_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string jsonFilter = 2;</code>
     */
    public Builder clearJsonFilter() {
      
      jsonFilter_ = getDefaultInstance().getJsonFilter();
      onChanged();
      return this;
    }
    /**
     * <code>string jsonFilter = 2;</code>
     */
    public Builder setJsonFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jsonFilter_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.tp_sd_1.stubs.medicamento.Search)
  }

  // @@protoc_insertion_point(class_scope:com.tp_sd_1.stubs.medicamento.Search)
  private static final com.tp_sd_1.stubs.medicamento.Search DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tp_sd_1.stubs.medicamento.Search();
  }

  public static com.tp_sd_1.stubs.medicamento.Search getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Search>
      PARSER = new com.google.protobuf.AbstractParser<Search>() {
    @java.lang.Override
    public Search parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Search(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Search> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Search> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tp_sd_1.stubs.medicamento.Search getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
