/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.datastream.v1alpha1.samples;

// [START datastream_v1alpha1_generated_datastreamclient_updatestream_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.datastream.v1alpha1.DatastreamClient;
import com.google.cloud.datastream.v1alpha1.OperationMetadata;
import com.google.cloud.datastream.v1alpha1.Stream;
import com.google.cloud.datastream.v1alpha1.UpdateStreamRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateStreamLRO {

  public static void main(String[] args) throws Exception {
    asyncUpdateStreamLRO();
  }

  public static void asyncUpdateStreamLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DatastreamClient datastreamClient = DatastreamClient.create()) {
      UpdateStreamRequest request =
          UpdateStreamRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setStream(Stream.newBuilder().build())
              .setRequestId("requestId693933066")
              .setValidateOnly(true)
              .setForce(true)
              .build();
      OperationFuture<Stream, OperationMetadata> future =
          datastreamClient.updateStreamOperationCallable().futureCall(request);
      // Do something.
      Stream response = future.get();
    }
  }
}
// [END datastream_v1alpha1_generated_datastreamclient_updatestream_lro_async]
