/*
 * Copyright 2021 Google LLC
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

package com.google.cloud.datastream.v1alpha1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class RouteName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_PRIVATECONNECTION_ROUTE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/privateConnections/{privateConnection}/routes/{route}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String privateConnection;
  private final String route;

  @Deprecated
  protected RouteName() {
    project = null;
    location = null;
    privateConnection = null;
    route = null;
  }

  private RouteName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    privateConnection = Preconditions.checkNotNull(builder.getPrivateConnection());
    route = Preconditions.checkNotNull(builder.getRoute());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getPrivateConnection() {
    return privateConnection;
  }

  public String getRoute() {
    return route;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static RouteName of(
      String project, String location, String privateConnection, String route) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setPrivateConnection(privateConnection)
        .setRoute(route)
        .build();
  }

  public static String format(
      String project, String location, String privateConnection, String route) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setPrivateConnection(privateConnection)
        .setRoute(route)
        .build()
        .toString();
  }

  public static RouteName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_PRIVATECONNECTION_ROUTE.validatedMatch(
            formattedString, "RouteName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("privateConnection"),
        matchMap.get("route"));
  }

  public static List<RouteName> parseList(List<String> formattedStrings) {
    List<RouteName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<RouteName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (RouteName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_PRIVATECONNECTION_ROUTE.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (privateConnection != null) {
            fieldMapBuilder.put("privateConnection", privateConnection);
          }
          if (route != null) {
            fieldMapBuilder.put("route", route);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_LOCATION_PRIVATECONNECTION_ROUTE.instantiate(
        "project",
        project,
        "location",
        location,
        "privateConnection",
        privateConnection,
        "route",
        route);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      RouteName that = ((RouteName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.privateConnection, that.privateConnection)
          && Objects.equals(this.route, that.route);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(privateConnection);
    h *= 1000003;
    h ^= Objects.hashCode(route);
    return h;
  }

  /**
   * Builder for
   * projects/{project}/locations/{location}/privateConnections/{privateConnection}/routes/{route}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String privateConnection;
    private String route;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getPrivateConnection() {
      return privateConnection;
    }

    public String getRoute() {
      return route;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setPrivateConnection(String privateConnection) {
      this.privateConnection = privateConnection;
      return this;
    }

    public Builder setRoute(String route) {
      this.route = route;
      return this;
    }

    private Builder(RouteName routeName) {
      this.project = routeName.project;
      this.location = routeName.location;
      this.privateConnection = routeName.privateConnection;
      this.route = routeName.route;
    }

    public RouteName build() {
      return new RouteName(this);
    }
  }
}
