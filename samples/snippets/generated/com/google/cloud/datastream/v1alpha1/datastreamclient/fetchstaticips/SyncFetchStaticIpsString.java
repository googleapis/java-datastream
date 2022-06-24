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

// [START datastream_v1alpha1_generated_datastreamclient_fetchstaticips_string_sync]
import com.google.cloud.datastream.v1alpha1.DatastreamClient;
import com.google.cloud.datastream.v1alpha1.LocationName;

public class SyncFetchStaticIpsString {

  public static void main(String[] args) throws Exception {
    syncFetchStaticIpsString();
  }

  public static void syncFetchStaticIpsString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DatastreamClient datastreamClient = DatastreamClient.create()) {
      String name = LocationName.of("[PROJECT]", "[LOCATION]").toString();
      for (String element : datastreamClient.fetchStaticIps(name).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END datastream_v1alpha1_generated_datastreamclient_fetchstaticips_string_sync]
