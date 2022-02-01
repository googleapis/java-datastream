// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

public interface ErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.Error)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A title that explains the reason for the error.
   * </pre>
   *
   * <code>string reason = 1;</code>
   * @return The reason.
   */
  java.lang.String getReason();
  /**
   * <pre>
   * A title that explains the reason for the error.
   * </pre>
   *
   * <code>string reason = 1;</code>
   * @return The bytes for reason.
   */
  com.google.protobuf.ByteString
      getReasonBytes();

  /**
   * <pre>
   * A unique identifier for this specific error,
   * allowing it to be traced throughout the system in logs and API responses.
   * </pre>
   *
   * <code>string error_uuid = 2;</code>
   * @return The errorUuid.
   */
  java.lang.String getErrorUuid();
  /**
   * <pre>
   * A unique identifier for this specific error,
   * allowing it to be traced throughout the system in logs and API responses.
   * </pre>
   *
   * <code>string error_uuid = 2;</code>
   * @return The bytes for errorUuid.
   */
  com.google.protobuf.ByteString
      getErrorUuidBytes();

  /**
   * <pre>
   * A message containing more information about the error that occurred.
   * </pre>
   *
   * <code>string message = 3;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * A message containing more information about the error that occurred.
   * </pre>
   *
   * <code>string message = 3;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * The time when the error occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp error_time = 4;</code>
   * @return Whether the errorTime field is set.
   */
  boolean hasErrorTime();
  /**
   * <pre>
   * The time when the error occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp error_time = 4;</code>
   * @return The errorTime.
   */
  com.google.protobuf.Timestamp getErrorTime();
  /**
   * <pre>
   * The time when the error occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp error_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getErrorTimeOrBuilder();

  /**
   * <pre>
   * Additional information about the error.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 5;</code>
   */
  int getDetailsCount();
  /**
   * <pre>
   * Additional information about the error.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 5;</code>
   */
  boolean containsDetails(
      java.lang.String key);
  /**
   * Use {@link #getDetailsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getDetails();
  /**
   * <pre>
   * Additional information about the error.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDetailsMap();
  /**
   * <pre>
   * Additional information about the error.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 5;</code>
   */

  java.lang.String getDetailsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Additional information about the error.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 5;</code>
   */

  java.lang.String getDetailsOrThrow(
      java.lang.String key);
}
