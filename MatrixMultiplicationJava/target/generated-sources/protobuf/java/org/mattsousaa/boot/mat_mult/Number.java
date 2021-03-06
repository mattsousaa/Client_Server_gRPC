// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator.proto

package org.mattsousaa.boot.mat_mult;

/**
 * Protobuf type {@code org.mattsousaa.boot.mat_mult.Number}
 */
public  final class Number extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.mattsousaa.boot.mat_mult.Number)
    NumberOrBuilder {
  // Use Number.newBuilder() to construct.
  private Number(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Number() {
    value1_ = 0;
    value2_ = 0;
    value3_ = 0;
    value4_ = 0;
    msg_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Number(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            value1_ = input.readInt32();
            break;
          }
          case 16: {

            value2_ = input.readInt32();
            break;
          }
          case 24: {

            value3_ = input.readInt32();
            break;
          }
          case 32: {

            value4_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            msg_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mattsousaa.boot.mat_mult.CalculatorOuterClass.internal_static_org_mattsousaa_boot_mat_mult_Number_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mattsousaa.boot.mat_mult.CalculatorOuterClass.internal_static_org_mattsousaa_boot_mat_mult_Number_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mattsousaa.boot.mat_mult.Number.class, org.mattsousaa.boot.mat_mult.Number.Builder.class);
  }

  public static final int VALUE1_FIELD_NUMBER = 1;
  private int value1_;
  /**
   * <code>int32 value1 = 1;</code>
   */
  public int getValue1() {
    return value1_;
  }

  public static final int VALUE2_FIELD_NUMBER = 2;
  private int value2_;
  /**
   * <code>int32 value2 = 2;</code>
   */
  public int getValue2() {
    return value2_;
  }

  public static final int VALUE3_FIELD_NUMBER = 3;
  private int value3_;
  /**
   * <code>int32 value3 = 3;</code>
   */
  public int getValue3() {
    return value3_;
  }

  public static final int VALUE4_FIELD_NUMBER = 4;
  private int value4_;
  /**
   * <code>int32 value4 = 4;</code>
   */
  public int getValue4() {
    return value4_;
  }

  public static final int MSG_FIELD_NUMBER = 5;
  private volatile java.lang.Object msg_;
  /**
   * <code>string msg = 5;</code>
   */
  public java.lang.String getMsg() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg_ = s;
      return s;
    }
  }
  /**
   * <code>string msg = 5;</code>
   */
  public com.google.protobuf.ByteString
      getMsgBytes() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (value1_ != 0) {
      output.writeInt32(1, value1_);
    }
    if (value2_ != 0) {
      output.writeInt32(2, value2_);
    }
    if (value3_ != 0) {
      output.writeInt32(3, value3_);
    }
    if (value4_ != 0) {
      output.writeInt32(4, value4_);
    }
    if (!getMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, msg_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value1_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, value1_);
    }
    if (value2_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, value2_);
    }
    if (value3_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, value3_);
    }
    if (value4_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, value4_);
    }
    if (!getMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, msg_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.mattsousaa.boot.mat_mult.Number)) {
      return super.equals(obj);
    }
    org.mattsousaa.boot.mat_mult.Number other = (org.mattsousaa.boot.mat_mult.Number) obj;

    boolean result = true;
    result = result && (getValue1()
        == other.getValue1());
    result = result && (getValue2()
        == other.getValue2());
    result = result && (getValue3()
        == other.getValue3());
    result = result && (getValue4()
        == other.getValue4());
    result = result && getMsg()
        .equals(other.getMsg());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VALUE1_FIELD_NUMBER;
    hash = (53 * hash) + getValue1();
    hash = (37 * hash) + VALUE2_FIELD_NUMBER;
    hash = (53 * hash) + getValue2();
    hash = (37 * hash) + VALUE3_FIELD_NUMBER;
    hash = (53 * hash) + getValue3();
    hash = (37 * hash) + VALUE4_FIELD_NUMBER;
    hash = (53 * hash) + getValue4();
    hash = (37 * hash) + MSG_FIELD_NUMBER;
    hash = (53 * hash) + getMsg().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mattsousaa.boot.mat_mult.Number parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mattsousaa.boot.mat_mult.Number parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mattsousaa.boot.mat_mult.Number parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mattsousaa.boot.mat_mult.Number parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mattsousaa.boot.mat_mult.Number parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mattsousaa.boot.mat_mult.Number parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mattsousaa.boot.mat_mult.Number parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mattsousaa.boot.mat_mult.Number parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mattsousaa.boot.mat_mult.Number parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mattsousaa.boot.mat_mult.Number parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mattsousaa.boot.mat_mult.Number parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mattsousaa.boot.mat_mult.Number parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.mattsousaa.boot.mat_mult.Number prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code org.mattsousaa.boot.mat_mult.Number}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.mattsousaa.boot.mat_mult.Number)
      org.mattsousaa.boot.mat_mult.NumberOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mattsousaa.boot.mat_mult.CalculatorOuterClass.internal_static_org_mattsousaa_boot_mat_mult_Number_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mattsousaa.boot.mat_mult.CalculatorOuterClass.internal_static_org_mattsousaa_boot_mat_mult_Number_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mattsousaa.boot.mat_mult.Number.class, org.mattsousaa.boot.mat_mult.Number.Builder.class);
    }

    // Construct using org.mattsousaa.boot.mat_mult.Number.newBuilder()
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
    public Builder clear() {
      super.clear();
      value1_ = 0;

      value2_ = 0;

      value3_ = 0;

      value4_ = 0;

      msg_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mattsousaa.boot.mat_mult.CalculatorOuterClass.internal_static_org_mattsousaa_boot_mat_mult_Number_descriptor;
    }

    public org.mattsousaa.boot.mat_mult.Number getDefaultInstanceForType() {
      return org.mattsousaa.boot.mat_mult.Number.getDefaultInstance();
    }

    public org.mattsousaa.boot.mat_mult.Number build() {
      org.mattsousaa.boot.mat_mult.Number result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.mattsousaa.boot.mat_mult.Number buildPartial() {
      org.mattsousaa.boot.mat_mult.Number result = new org.mattsousaa.boot.mat_mult.Number(this);
      result.value1_ = value1_;
      result.value2_ = value2_;
      result.value3_ = value3_;
      result.value4_ = value4_;
      result.msg_ = msg_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.mattsousaa.boot.mat_mult.Number) {
        return mergeFrom((org.mattsousaa.boot.mat_mult.Number)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mattsousaa.boot.mat_mult.Number other) {
      if (other == org.mattsousaa.boot.mat_mult.Number.getDefaultInstance()) return this;
      if (other.getValue1() != 0) {
        setValue1(other.getValue1());
      }
      if (other.getValue2() != 0) {
        setValue2(other.getValue2());
      }
      if (other.getValue3() != 0) {
        setValue3(other.getValue3());
      }
      if (other.getValue4() != 0) {
        setValue4(other.getValue4());
      }
      if (!other.getMsg().isEmpty()) {
        msg_ = other.msg_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.mattsousaa.boot.mat_mult.Number parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mattsousaa.boot.mat_mult.Number) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int value1_ ;
    /**
     * <code>int32 value1 = 1;</code>
     */
    public int getValue1() {
      return value1_;
    }
    /**
     * <code>int32 value1 = 1;</code>
     */
    public Builder setValue1(int value) {
      
      value1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 value1 = 1;</code>
     */
    public Builder clearValue1() {
      
      value1_ = 0;
      onChanged();
      return this;
    }

    private int value2_ ;
    /**
     * <code>int32 value2 = 2;</code>
     */
    public int getValue2() {
      return value2_;
    }
    /**
     * <code>int32 value2 = 2;</code>
     */
    public Builder setValue2(int value) {
      
      value2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 value2 = 2;</code>
     */
    public Builder clearValue2() {
      
      value2_ = 0;
      onChanged();
      return this;
    }

    private int value3_ ;
    /**
     * <code>int32 value3 = 3;</code>
     */
    public int getValue3() {
      return value3_;
    }
    /**
     * <code>int32 value3 = 3;</code>
     */
    public Builder setValue3(int value) {
      
      value3_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 value3 = 3;</code>
     */
    public Builder clearValue3() {
      
      value3_ = 0;
      onChanged();
      return this;
    }

    private int value4_ ;
    /**
     * <code>int32 value4 = 4;</code>
     */
    public int getValue4() {
      return value4_;
    }
    /**
     * <code>int32 value4 = 4;</code>
     */
    public Builder setValue4(int value) {
      
      value4_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 value4 = 4;</code>
     */
    public Builder clearValue4() {
      
      value4_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object msg_ = "";
    /**
     * <code>string msg = 5;</code>
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msg = 5;</code>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg = 5;</code>
     */
    public Builder setMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 5;</code>
     */
    public Builder clearMsg() {
      
      msg_ = getDefaultInstance().getMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 5;</code>
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:org.mattsousaa.boot.mat_mult.Number)
  }

  // @@protoc_insertion_point(class_scope:org.mattsousaa.boot.mat_mult.Number)
  private static final org.mattsousaa.boot.mat_mult.Number DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mattsousaa.boot.mat_mult.Number();
  }

  public static org.mattsousaa.boot.mat_mult.Number getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Number>
      PARSER = new com.google.protobuf.AbstractParser<Number>() {
    public Number parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Number(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Number> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Number> getParserForType() {
    return PARSER;
  }

  public org.mattsousaa.boot.mat_mult.Number getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

