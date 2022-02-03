/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

public interface OracleProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.OracleProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Hostname for the Oracle connection.
   * </pre>
   *
   * <code>string hostname = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The hostname.
   */
  java.lang.String getHostname();
  /**
   *
   *
   * <pre>
   * Required. Hostname for the Oracle connection.
   * </pre>
   *
   * <code>string hostname = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for hostname.
   */
  com.google.protobuf.ByteString getHostnameBytes();

  /**
   *
   *
   * <pre>
   * Port for the Oracle connection, default value is 1521.
   * </pre>
   *
   * <code>int32 port = 2;</code>
   *
   * @return The port.
   */
  int getPort();

  /**
   *
   *
   * <pre>
   * Required. Username for the Oracle connection.
   * </pre>
   *
   * <code>string username = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   *
   *
   * <pre>
   * Required. Username for the Oracle connection.
   * </pre>
   *
   * <code>string username = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString getUsernameBytes();

  /**
   *
   *
   * <pre>
   * Required. Password for the Oracle connection.
   * </pre>
   *
   * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   *
   *
   * <pre>
   * Required. Password for the Oracle connection.
   * </pre>
   *
   * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString getPasswordBytes();

  /**
   *
   *
   * <pre>
   * Required. Database for the Oracle connection.
   * </pre>
   *
   * <code>string database_service = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The databaseService.
   */
  java.lang.String getDatabaseService();
  /**
   *
   *
   * <pre>
   * Required. Database for the Oracle connection.
   * </pre>
   *
   * <code>string database_service = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for databaseService.
   */
  com.google.protobuf.ByteString getDatabaseServiceBytes();

  /**
   *
   *
   * <pre>
   * Connection string attributes
   * </pre>
   *
   * <code>map&lt;string, string&gt; connection_attributes = 6;</code>
   */
  int getConnectionAttributesCount();
  /**
   *
   *
   * <pre>
   * Connection string attributes
   * </pre>
   *
   * <code>map&lt;string, string&gt; connection_attributes = 6;</code>
   */
  boolean containsConnectionAttributes(java.lang.String key);
  /** Use {@link #getConnectionAttributesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getConnectionAttributes();
  /**
   *
   *
   * <pre>
   * Connection string attributes
   * </pre>
   *
   * <code>map&lt;string, string&gt; connection_attributes = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getConnectionAttributesMap();
  /**
   *
   *
   * <pre>
   * Connection string attributes
   * </pre>
   *
   * <code>map&lt;string, string&gt; connection_attributes = 6;</code>
   */
  java.lang.String getConnectionAttributesOrDefault(
      java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Connection string attributes
   * </pre>
   *
   * <code>map&lt;string, string&gt; connection_attributes = 6;</code>
   */
  java.lang.String getConnectionAttributesOrThrow(java.lang.String key);
}
