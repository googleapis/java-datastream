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

// [START datastream_v1alpha1_generated_datastreamclient_listconnectionprofiles_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.datastream.v1alpha1.ConnectionProfile;
import com.google.cloud.datastream.v1alpha1.DatastreamClient;
import com.google.cloud.datastream.v1alpha1.ListConnectionProfilesRequest;
import com.google.cloud.datastream.v1alpha1.LocationName;

public class AsyncListConnectionProfiles {

  public static void main(String[] args) throws Exception {
    asyncListConnectionProfiles();
  }

  public static void asyncListConnectionProfiles() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DatastreamClient datastreamClient = DatastreamClient.create()) {
      ListConnectionProfilesRequest request =
          ListConnectionProfilesRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      ApiFuture<ConnectionProfile> future =
          datastreamClient.listConnectionProfilesPagedCallable().futureCall(request);
      // Do something.
      for (ConnectionProfile element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END datastream_v1alpha1_generated_datastreamclient_listconnectionprofiles_async]
