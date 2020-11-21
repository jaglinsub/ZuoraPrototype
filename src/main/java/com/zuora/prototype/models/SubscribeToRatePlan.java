/*
 * Zuora Copy
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.zuora.prototype.models;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SubscribeToRatePlan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-20T00:16:03.519Z")



public class SubscribeToRatePlan {
  @SerializedName("productRatePlanId")
  private String productRatePlanId = null;

  public SubscribeToRatePlan productRatePlanId(String productRatePlanId) {
    this.productRatePlanId = productRatePlanId;
    return this;
  }

   /**
   * Get productRatePlanId
   * @return productRatePlanId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProductRatePlanId() {
    return productRatePlanId;
  }

  public void setProductRatePlanId(String productRatePlanId) {
    this.productRatePlanId = productRatePlanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscribeToRatePlan subscribeToRatePlan = (SubscribeToRatePlan) o;
    return Objects.equals(this.productRatePlanId, subscribeToRatePlan.productRatePlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productRatePlanId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribeToRatePlan {\n");
    
    sb.append("    productRatePlanId: ").append(toIndentedString(productRatePlanId)).append("\n");
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

