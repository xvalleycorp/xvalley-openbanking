/**
 * Copyright 2019 ForgeRock AS.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.xvalley.openbanking.models.uk.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import com.xvalley.openbanking.models.uk.jackson.DateTimeDeserializer;
import com.xvalley.openbanking.models.uk.jackson.DateTimeSerializer;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Reflection of The Main Data Payload, with Created Resource ID, Status and Timestamp
 */
@ApiModel(description = "Reflection of The Main Data Payload, with Created Resource ID, Status and Timestamp")


public class OBPaymentDataSubmissionResponse1 {
  @JsonProperty("PaymentSubmissionId")
  private String paymentSubmissionId = null;

  @JsonProperty("PaymentId")
  private String paymentId = null;

  @JsonProperty("Status")
  private OBTransactionIndividualStatus1Code status = null;

  @JsonProperty("CreationDateTime")
  @JsonDeserialize(using = DateTimeDeserializer.class)
  @JsonSerialize(using = DateTimeSerializer.class)
  private DateTime creationDateTime = null;

  public OBPaymentDataSubmissionResponse1 paymentSubmissionId(String paymentSubmissionId) {
    this.paymentSubmissionId = paymentSubmissionId;
    return this;
  }

   /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the payment submission resource.
   * @return paymentSubmissionId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the payment submission resource.")
  @NotNull

 @Size(min=1,max=40)
  public String getPaymentSubmissionId() {
    return paymentSubmissionId;
  }

  public void setPaymentSubmissionId(String paymentSubmissionId) {
    this.paymentSubmissionId = paymentSubmissionId;
  }

  public OBPaymentDataSubmissionResponse1 paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource.
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource.")
  @NotNull

 @Size(min=1,max=128)
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public OBPaymentDataSubmissionResponse1 status(OBTransactionIndividualStatus1Code status) {
    this.status = status;
    return this;
  }

   /**
   * Specifies the status of the payment resource.
   * @return status
  **/
  @ApiModelProperty(value = "Specifies the status of the payment resource.")


  public OBTransactionIndividualStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBTransactionIndividualStatus1Code status) {
    this.status = status;
  }

  public OBPaymentDataSubmissionResponse1 creationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

   /**
   * Date and time at which the resource was created.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPaymentDataSubmissionResponse1 paymentSetupResponse1 = (OBPaymentDataSubmissionResponse1) o;
    return Objects.equals(this.paymentSubmissionId, paymentSetupResponse1.paymentSubmissionId) &&
        Objects.equals(this.paymentId, paymentSetupResponse1.paymentId) &&
        Objects.equals(this.status, paymentSetupResponse1.status) &&
        Objects.equals(this.creationDateTime, paymentSetupResponse1.creationDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSubmissionId, paymentId, status, creationDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupResponse1 {\n");
    
    sb.append("    paymentSubmissionId: ").append(toIndentedString(paymentSubmissionId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
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

