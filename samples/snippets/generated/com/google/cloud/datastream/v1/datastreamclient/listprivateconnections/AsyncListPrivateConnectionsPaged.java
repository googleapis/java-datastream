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

// [START datastream_v1_generated_datastreamclient_listprivateconnections_paged_async]
import com.google.cloud.datastream.v1.DatastreamClient;
import com.google.cloud.datastream.v1.ListPrivateConnectionsRequest;
import com.google.cloud.datastream.v1.ListPrivateConnectionsResponse;
import com.google.cloud.datastream.v1.LocationName;
import com.google.cloud.datastream.v1.PrivateConnection;
import com.google.common.base.Strings;

public class AsyncListPrivateConnectionsPaged {

  public static void main(String[] args) throws Exception {
    asyncListPrivateConnectionsPaged();
  }

  public static void asyncListPrivateConnectionsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DatastreamClient datastreamClient = DatastreamClient.create()) {
      ListPrivateConnectionsRequest request =
          ListPrivateConnectionsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      while (true) {
        ListPrivateConnectionsResponse response =
            datastreamClient.listPrivateConnectionsCallable().call(request);
        for (PrivateConnection element : response.getPrivateConnectionsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END datastream_v1_generated_datastreamclient_listprivateconnections_paged_async]
