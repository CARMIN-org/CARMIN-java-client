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

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * PipelineParameter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-05T11:29:38.958+02:00")
public class PipelineParameter {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private ParameterType type = null;

  @SerializedName("isOptional")
  private Boolean isOptional = null;

  @SerializedName("isReturnedValue")
  private Boolean isReturnedValue = null;
  
  @SerializedName("defaultValue")
  private Object defaultValue = null;

  @SerializedName("description")
  private String description = null;

  public PipelineParameter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PipelineParameter type(ParameterType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ParameterType getType() {
    return type;
  }

  public void setType(ParameterType type) {
    this.type = type;
  }

  public PipelineParameter isOptional(Boolean isOptional) {
    this.isOptional = isOptional;
    return this;
  }

   /**
   * Get isOptional
   * @return isOptional
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getIsOptional() {
    return isOptional;
  }

  public void setIsOptional(Boolean isOptional) {
    this.isOptional = isOptional;
  }

  public PipelineParameter isReturnedValue(Boolean isReturnedValue) {
    this.isReturnedValue = isReturnedValue;
    return this;
  }

   /**
   * Get isReturnedValue
   * @return isReturnedValue
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getIsReturnedValue() {
    return isReturnedValue;
  }

  public void setIsReturnedValue(Boolean isReturnedValue) {
    this.isReturnedValue = isReturnedValue;
  }

  public PipelineParameter defaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }
  
  /**
  * Get defaultValue
  * @return defaultValue
 **/
 @ApiModelProperty(example = "null", value = "")
 public Object getDefaultValue() {
   return defaultValue;
 }

 public void setDefaultValue(Object defaultValue) {
   this.defaultValue = defaultValue;
 }

 public PipelineParameter description(String description) {
   this.description = description;
   return this;
 }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineParameter pipelineParameter = (PipelineParameter) o;
    return Objects.equals(this.name, pipelineParameter.name) &&
        Objects.equals(this.type, pipelineParameter.type) &&
        Objects.equals(this.isOptional, pipelineParameter.isOptional) &&
        Objects.equals(this.isReturnedValue, pipelineParameter.isReturnedValue) &&
        Objects.equals(this.description, pipelineParameter.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, isOptional, isReturnedValue, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineParameter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isOptional: ").append(toIndentedString(isOptional)).append("\n");
    sb.append("    isReturnedValue: ").append(toIndentedString(isReturnedValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

