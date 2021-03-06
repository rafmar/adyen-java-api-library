/*
 * Adyen Wherever People Pay
 * This is the Adyen API Playground where you can test our API's. <br /><br />You can find out more about Adyen      at <a href=\"http://www.adyen.com\">http://www.adyen.com</a>.  <!--For this sample, you can use the api key \"special-key\" to test the authorization filters.-->
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.adyen.model.recurring;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DisableResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-14T08:41:23.938Z")
public class DisableResult {
  @SerializedName("response")
  private String response = null;

  @SerializedName("details")
  private List<RecurringDetail> details = new ArrayList<RecurringDetail>();

  public DisableResult response(String response) {
    this.response = response;
    return this;
  }

   /**
   * Depending on whether a specific recurring detail was in the request, result is either [detail-successfully-disabled] or [all-details-successfully-disabled]
   * @return response
  **/
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public DisableResult details(List<RecurringDetail> details) {
    this.details = details;
    return this;
  }

  public DisableResult addDetailsItem(RecurringDetail detailsItem) {
    this.details.add(detailsItem);
    return this;
  }

   /**
   * a list of one or more recurring payment details that were disabled
   * @return details
  **/
  public List<RecurringDetail> getDetails() {
    return details;
  }

  public void setDetails(List<RecurringDetail> details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisableResult disableResult = (DisableResult) o;
    return Objects.equals(this.response, disableResult.response) &&
        Objects.equals(this.details, disableResult.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisableResult {\n");

    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

