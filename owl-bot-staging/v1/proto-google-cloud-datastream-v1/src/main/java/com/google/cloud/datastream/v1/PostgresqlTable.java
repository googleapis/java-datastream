// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

/**
 * <pre>
 * PostgreSQL table.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1.PostgresqlTable}
 */
public final class PostgresqlTable extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1.PostgresqlTable)
    PostgresqlTableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostgresqlTable.newBuilder() to construct.
  private PostgresqlTable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostgresqlTable() {
    table_ = "";
    postgresqlColumns_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostgresqlTable();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostgresqlTable(
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
            java.lang.String s = input.readStringRequireUtf8();

            table_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              postgresqlColumns_ = new java.util.ArrayList<com.google.cloud.datastream.v1.PostgresqlColumn>();
              mutable_bitField0_ |= 0x00000001;
            }
            postgresqlColumns_.add(
                input.readMessage(com.google.cloud.datastream.v1.PostgresqlColumn.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        postgresqlColumns_ = java.util.Collections.unmodifiableList(postgresqlColumns_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_PostgresqlTable_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_PostgresqlTable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1.PostgresqlTable.class, com.google.cloud.datastream.v1.PostgresqlTable.Builder.class);
  }

  public static final int TABLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object table_;
  /**
   * <pre>
   * Table name.
   * </pre>
   *
   * <code>string table = 1;</code>
   * @return The table.
   */
  @java.lang.Override
  public java.lang.String getTable() {
    java.lang.Object ref = table_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      table_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Table name.
   * </pre>
   *
   * <code>string table = 1;</code>
   * @return The bytes for table.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTableBytes() {
    java.lang.Object ref = table_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      table_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POSTGRESQL_COLUMNS_FIELD_NUMBER = 2;
  private java.util.List<com.google.cloud.datastream.v1.PostgresqlColumn> postgresqlColumns_;
  /**
   * <pre>
   * PostgreSQL columns in the schema.
   * When unspecified as part of include/exclude objects,
   * includes/excludes everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datastream.v1.PostgresqlColumn> getPostgresqlColumnsList() {
    return postgresqlColumns_;
  }
  /**
   * <pre>
   * PostgreSQL columns in the schema.
   * When unspecified as part of include/exclude objects,
   * includes/excludes everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datastream.v1.PostgresqlColumnOrBuilder> 
      getPostgresqlColumnsOrBuilderList() {
    return postgresqlColumns_;
  }
  /**
   * <pre>
   * PostgreSQL columns in the schema.
   * When unspecified as part of include/exclude objects,
   * includes/excludes everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
   */
  @java.lang.Override
  public int getPostgresqlColumnsCount() {
    return postgresqlColumns_.size();
  }
  /**
   * <pre>
   * PostgreSQL columns in the schema.
   * When unspecified as part of include/exclude objects,
   * includes/excludes everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.PostgresqlColumn getPostgresqlColumns(int index) {
    return postgresqlColumns_.get(index);
  }
  /**
   * <pre>
   * PostgreSQL columns in the schema.
   * When unspecified as part of include/exclude objects,
   * includes/excludes everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.PostgresqlColumnOrBuilder getPostgresqlColumnsOrBuilder(
      int index) {
    return postgresqlColumns_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(table_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, table_);
    }
    for (int i = 0; i < postgresqlColumns_.size(); i++) {
      output.writeMessage(2, postgresqlColumns_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(table_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, table_);
    }
    for (int i = 0; i < postgresqlColumns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, postgresqlColumns_.get(i));
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
    if (!(obj instanceof com.google.cloud.datastream.v1.PostgresqlTable)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1.PostgresqlTable other = (com.google.cloud.datastream.v1.PostgresqlTable) obj;

    if (!getTable()
        .equals(other.getTable())) return false;
    if (!getPostgresqlColumnsList()
        .equals(other.getPostgresqlColumnsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TABLE_FIELD_NUMBER;
    hash = (53 * hash) + getTable().hashCode();
    if (getPostgresqlColumnsCount() > 0) {
      hash = (37 * hash) + POSTGRESQL_COLUMNS_FIELD_NUMBER;
      hash = (53 * hash) + getPostgresqlColumnsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1.PostgresqlTable parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.PostgresqlTable parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.PostgresqlTable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.PostgresqlTable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.PostgresqlTable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datastream.v1.PostgresqlTable parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.PostgresqlTable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.PostgresqlTable parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.PostgresqlTable parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.PostgresqlTable parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datastream.v1.PostgresqlTable parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datastream.v1.PostgresqlTable parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datastream.v1.PostgresqlTable prototype) {
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
   * PostgreSQL table.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1.PostgresqlTable}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1.PostgresqlTable)
      com.google.cloud.datastream.v1.PostgresqlTableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_PostgresqlTable_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_PostgresqlTable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1.PostgresqlTable.class, com.google.cloud.datastream.v1.PostgresqlTable.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1.PostgresqlTable.newBuilder()
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
        getPostgresqlColumnsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      table_ = "";

      if (postgresqlColumnsBuilder_ == null) {
        postgresqlColumns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        postgresqlColumnsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto.internal_static_google_cloud_datastream_v1_PostgresqlTable_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.PostgresqlTable getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1.PostgresqlTable.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.PostgresqlTable build() {
      com.google.cloud.datastream.v1.PostgresqlTable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.PostgresqlTable buildPartial() {
      com.google.cloud.datastream.v1.PostgresqlTable result = new com.google.cloud.datastream.v1.PostgresqlTable(this);
      int from_bitField0_ = bitField0_;
      result.table_ = table_;
      if (postgresqlColumnsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          postgresqlColumns_ = java.util.Collections.unmodifiableList(postgresqlColumns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.postgresqlColumns_ = postgresqlColumns_;
      } else {
        result.postgresqlColumns_ = postgresqlColumnsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datastream.v1.PostgresqlTable) {
        return mergeFrom((com.google.cloud.datastream.v1.PostgresqlTable)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1.PostgresqlTable other) {
      if (other == com.google.cloud.datastream.v1.PostgresqlTable.getDefaultInstance()) return this;
      if (!other.getTable().isEmpty()) {
        table_ = other.table_;
        onChanged();
      }
      if (postgresqlColumnsBuilder_ == null) {
        if (!other.postgresqlColumns_.isEmpty()) {
          if (postgresqlColumns_.isEmpty()) {
            postgresqlColumns_ = other.postgresqlColumns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePostgresqlColumnsIsMutable();
            postgresqlColumns_.addAll(other.postgresqlColumns_);
          }
          onChanged();
        }
      } else {
        if (!other.postgresqlColumns_.isEmpty()) {
          if (postgresqlColumnsBuilder_.isEmpty()) {
            postgresqlColumnsBuilder_.dispose();
            postgresqlColumnsBuilder_ = null;
            postgresqlColumns_ = other.postgresqlColumns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            postgresqlColumnsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPostgresqlColumnsFieldBuilder() : null;
          } else {
            postgresqlColumnsBuilder_.addAllMessages(other.postgresqlColumns_);
          }
        }
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
      com.google.cloud.datastream.v1.PostgresqlTable parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datastream.v1.PostgresqlTable) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object table_ = "";
    /**
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table = 1;</code>
     * @return The table.
     */
    public java.lang.String getTable() {
      java.lang.Object ref = table_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        table_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table = 1;</code>
     * @return The bytes for table.
     */
    public com.google.protobuf.ByteString
        getTableBytes() {
      java.lang.Object ref = table_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        table_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table = 1;</code>
     * @param value The table to set.
     * @return This builder for chaining.
     */
    public Builder setTable(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      table_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTable() {
      
      table_ = getDefaultInstance().getTable();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table = 1;</code>
     * @param value The bytes for table to set.
     * @return This builder for chaining.
     */
    public Builder setTableBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      table_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.datastream.v1.PostgresqlColumn> postgresqlColumns_ =
      java.util.Collections.emptyList();
    private void ensurePostgresqlColumnsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        postgresqlColumns_ = new java.util.ArrayList<com.google.cloud.datastream.v1.PostgresqlColumn>(postgresqlColumns_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.datastream.v1.PostgresqlColumn, com.google.cloud.datastream.v1.PostgresqlColumn.Builder, com.google.cloud.datastream.v1.PostgresqlColumnOrBuilder> postgresqlColumnsBuilder_;

    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1.PostgresqlColumn> getPostgresqlColumnsList() {
      if (postgresqlColumnsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(postgresqlColumns_);
      } else {
        return postgresqlColumnsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public int getPostgresqlColumnsCount() {
      if (postgresqlColumnsBuilder_ == null) {
        return postgresqlColumns_.size();
      } else {
        return postgresqlColumnsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1.PostgresqlColumn getPostgresqlColumns(int index) {
      if (postgresqlColumnsBuilder_ == null) {
        return postgresqlColumns_.get(index);
      } else {
        return postgresqlColumnsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public Builder setPostgresqlColumns(
        int index, com.google.cloud.datastream.v1.PostgresqlColumn value) {
      if (postgresqlColumnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostgresqlColumnsIsMutable();
        postgresqlColumns_.set(index, value);
        onChanged();
      } else {
        postgresqlColumnsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public Builder setPostgresqlColumns(
        int index, com.google.cloud.datastream.v1.PostgresqlColumn.Builder builderForValue) {
      if (postgresqlColumnsBuilder_ == null) {
        ensurePostgresqlColumnsIsMutable();
        postgresqlColumns_.set(index, builderForValue.build());
        onChanged();
      } else {
        postgresqlColumnsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public Builder addPostgresqlColumns(com.google.cloud.datastream.v1.PostgresqlColumn value) {
      if (postgresqlColumnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostgresqlColumnsIsMutable();
        postgresqlColumns_.add(value);
        onChanged();
      } else {
        postgresqlColumnsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public Builder addPostgresqlColumns(
        int index, com.google.cloud.datastream.v1.PostgresqlColumn value) {
      if (postgresqlColumnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostgresqlColumnsIsMutable();
        postgresqlColumns_.add(index, value);
        onChanged();
      } else {
        postgresqlColumnsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public Builder addPostgresqlColumns(
        com.google.cloud.datastream.v1.PostgresqlColumn.Builder builderForValue) {
      if (postgresqlColumnsBuilder_ == null) {
        ensurePostgresqlColumnsIsMutable();
        postgresqlColumns_.add(builderForValue.build());
        onChanged();
      } else {
        postgresqlColumnsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public Builder addPostgresqlColumns(
        int index, com.google.cloud.datastream.v1.PostgresqlColumn.Builder builderForValue) {
      if (postgresqlColumnsBuilder_ == null) {
        ensurePostgresqlColumnsIsMutable();
        postgresqlColumns_.add(index, builderForValue.build());
        onChanged();
      } else {
        postgresqlColumnsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public Builder addAllPostgresqlColumns(
        java.lang.Iterable<? extends com.google.cloud.datastream.v1.PostgresqlColumn> values) {
      if (postgresqlColumnsBuilder_ == null) {
        ensurePostgresqlColumnsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, postgresqlColumns_);
        onChanged();
      } else {
        postgresqlColumnsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public Builder clearPostgresqlColumns() {
      if (postgresqlColumnsBuilder_ == null) {
        postgresqlColumns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        postgresqlColumnsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public Builder removePostgresqlColumns(int index) {
      if (postgresqlColumnsBuilder_ == null) {
        ensurePostgresqlColumnsIsMutable();
        postgresqlColumns_.remove(index);
        onChanged();
      } else {
        postgresqlColumnsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1.PostgresqlColumn.Builder getPostgresqlColumnsBuilder(
        int index) {
      return getPostgresqlColumnsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1.PostgresqlColumnOrBuilder getPostgresqlColumnsOrBuilder(
        int index) {
      if (postgresqlColumnsBuilder_ == null) {
        return postgresqlColumns_.get(index);  } else {
        return postgresqlColumnsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.datastream.v1.PostgresqlColumnOrBuilder> 
         getPostgresqlColumnsOrBuilderList() {
      if (postgresqlColumnsBuilder_ != null) {
        return postgresqlColumnsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(postgresqlColumns_);
      }
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1.PostgresqlColumn.Builder addPostgresqlColumnsBuilder() {
      return getPostgresqlColumnsFieldBuilder().addBuilder(
          com.google.cloud.datastream.v1.PostgresqlColumn.getDefaultInstance());
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1.PostgresqlColumn.Builder addPostgresqlColumnsBuilder(
        int index) {
      return getPostgresqlColumnsFieldBuilder().addBuilder(
          index, com.google.cloud.datastream.v1.PostgresqlColumn.getDefaultInstance());
    }
    /**
     * <pre>
     * PostgreSQL columns in the schema.
     * When unspecified as part of include/exclude objects,
     * includes/excludes everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.PostgresqlColumn postgresql_columns = 2;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1.PostgresqlColumn.Builder> 
         getPostgresqlColumnsBuilderList() {
      return getPostgresqlColumnsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.datastream.v1.PostgresqlColumn, com.google.cloud.datastream.v1.PostgresqlColumn.Builder, com.google.cloud.datastream.v1.PostgresqlColumnOrBuilder> 
        getPostgresqlColumnsFieldBuilder() {
      if (postgresqlColumnsBuilder_ == null) {
        postgresqlColumnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datastream.v1.PostgresqlColumn, com.google.cloud.datastream.v1.PostgresqlColumn.Builder, com.google.cloud.datastream.v1.PostgresqlColumnOrBuilder>(
                postgresqlColumns_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        postgresqlColumns_ = null;
      }
      return postgresqlColumnsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1.PostgresqlTable)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1.PostgresqlTable)
  private static final com.google.cloud.datastream.v1.PostgresqlTable DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1.PostgresqlTable();
  }

  public static com.google.cloud.datastream.v1.PostgresqlTable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostgresqlTable>
      PARSER = new com.google.protobuf.AbstractParser<PostgresqlTable>() {
    @java.lang.Override
    public PostgresqlTable parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostgresqlTable(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostgresqlTable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostgresqlTable> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1.PostgresqlTable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

