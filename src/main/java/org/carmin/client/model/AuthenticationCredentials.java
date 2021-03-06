/*
 * CARMIN a Common web API for Remote pipeline INvocation
 * FLI/IAM REST API for exchanging data and remote calling pipelines.
 *
 * OpenAPI spec version: 0.2.1
 * Contact: carmin@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.carmin.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class AuthenticationCredentials {

  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  public AuthenticationCredentials username(String username) {
    this.username= username;
    return this;
  }

  @ApiModelProperty(example = "null", required = true, value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public AuthenticationCredentials password(String password) {
    this.password = password;
    return this;
  }

  @ApiModelProperty(example = "null", required = true, value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationCredentials authenticationCredentials = (AuthenticationCredentials) o;
    return Objects.equals(this.username, authenticationCredentials.username) &&
        Objects.equals(this.password, authenticationCredentials.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationCredentials {\n");

    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

