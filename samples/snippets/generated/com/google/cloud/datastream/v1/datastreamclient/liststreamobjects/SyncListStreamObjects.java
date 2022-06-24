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

package com.google.cloud.datastream.v1.samples;

// [START datastream_v1_generated_datastreamclient_liststreamobjects_sync]
import com.google.cloud.datastream.v1.DatastreamClient;
import com.google.cloud.datastream.v1.ListStreamObjectsRequest;
import com.google.cloud.datastream.v1.StreamName;
import com.google.cloud.datastream.v1.StreamObject;

public class SyncListStreamObjects {

  public static void main(String[] args) throws Exception {
    syncListStreamObjects();
  }

  public static void syncListStreamObjects() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DatastreamClient datastreamClient = DatastreamClient.create()) {
      ListStreamObjectsRequest request =
          ListStreamObjectsRequest.newBuilder()
              .setParent(StreamName.of("[PROJECT]", "[LOCATION]", "[STREAM]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      for (StreamObject element : datastreamClient.listStreamObjects(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END datastream_v1_generated_datastreamclient_liststreamobjects_sync]
