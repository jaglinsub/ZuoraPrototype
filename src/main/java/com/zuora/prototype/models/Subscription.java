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

import java.util.ArrayList;
import java.util.List;

/**
 * Subscription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-20T00:16:03.519Z")



public class Subscription {
  @SerializedName("orderActions")
  private List<OrderAction> orderActions = new ArrayList<OrderAction>();

  public Subscription orderActions(List<OrderAction> orderActions) {
    this.orderActions = orderActions;
    return this;
  }

  public Subscription addOrderActionsItem(OrderAction orderActionsItem) {
    this.orderActions.add(orderActionsItem);
    return this;
  }

   /**
   * Get orderActions
   * @return orderActions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<OrderAction> getOrderActions() {
    return orderActions;
  }

  public void setOrderActions(List<OrderAction> orderActions) {
    this.orderActions = orderActions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.orderActions, subscription.orderActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderActions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("    orderActions: ").append(toIndentedString(orderActions)).append("\n");
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

