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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Payment status details.
 */
@ApiModel(description = "Payment status details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-20T11:30:55.433304+01:00[Europe/London]")

public class OBWritePaymentDetailsResponse1DataPaymentStatus {
  @JsonProperty("PaymentTransactionId")
  private String paymentTransactionId;

  /**
   * Status of a transfe, as assigned by the transaction administrator.
   */
  public enum StatusEnum {
    ACCEPTED("Accepted"),

    ACCEPTEDCANCELLATIONREQUEST("AcceptedCancellationRequest"),

    ACCEPTEDCREDITSETTLEMENTCOMPLETED("AcceptedCreditSettlementCompleted"),

    ACCEPTEDCUSTOMERPROFILE("AcceptedCustomerProfile"),

    ACCEPTEDFUNDSCHECKED("AcceptedFundsChecked"),

    ACCEPTEDSETTLEMENTCOMPLETED("AcceptedSettlementCompleted"),

    ACCEPTEDSETTLEMENTINPROCESS("AcceptedSettlementInProcess"),

    ACCEPTEDTECHNICALVALIDATION("AcceptedTechnicalValidation"),

    ACCEPTEDWITHCHANGE("AcceptedWithChange"),

    ACCEPTEDWITHOUTPOSTING("AcceptedWithoutPosting"),

    CANCELLED("Cancelled"),

    NOCANCELLATIONPROCESS("NoCancellationProcess"),

    PARTIALLYACCEPTEDCANCELLATIONREQUEST("PartiallyAcceptedCancellationRequest"),

    PARTIALLYACCEPTEDTECHNICALCORRECT("PartiallyAcceptedTechnicalCorrect"),

    PAYMENTCANCELLED("PaymentCancelled"),

    PENDING("Pending"),

    PENDINGCANCELLATIONREQUEST("PendingCancellationRequest"),

    RECEIVED("Received"),

    REJECTED("Rejected"),

    REJECTEDCANCELLATIONREQUEST("RejectedCancellationRequest");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Status")
  private StatusEnum status;

  @JsonProperty("StatusUpdateDateTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private DateTime statusUpdateDateTime;

  @JsonProperty("StatusDetail")
  private OBWritePaymentDetailsResponse1DataStatusDetail statusDetail;

  public OBWritePaymentDetailsResponse1DataPaymentStatus paymentTransactionId(String paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
    return this;
  }

  /**
   * Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
   *
   * @return paymentTransactionId
   */
  @ApiModelProperty(required = true, value = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.")
  @NotNull
  @Size(min = 1, max = 210)
  public String getPaymentTransactionId() {
    return paymentTransactionId;
  }

  public void setPaymentTransactionId(String paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
  }

  public OBWritePaymentDetailsResponse1DataPaymentStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of a transfe, as assigned by the transaction administrator.
   *
   * @return status
   */
  @ApiModelProperty(required = true, value = "Status of a transfe, as assigned by the transaction administrator.")
  @NotNull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBWritePaymentDetailsResponse1DataPaymentStatus statusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the status was assigned to the transfer.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   *
   * @return statusUpdateDateTime
   */
  @ApiModelProperty(required = true, value = "Date and time at which the status was assigned to the transfer.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull
  @Valid
  public DateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBWritePaymentDetailsResponse1DataPaymentStatus statusDetail(OBWritePaymentDetailsResponse1DataStatusDetail statusDetail) {
    this.statusDetail = statusDetail;
    return this;
  }

  /**
   * Get statusDetail
   *
   * @return statusDetail
   */
  @ApiModelProperty(value = "")
  @Valid
  public OBWritePaymentDetailsResponse1DataStatusDetail getStatusDetail() {
    return statusDetail;
  }

  public void setStatusDetail(OBWritePaymentDetailsResponse1DataStatusDetail statusDetail) {
    this.statusDetail = statusDetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWritePaymentDetailsResponse1DataPaymentStatus obWritePaymentDetailsResponse1DataPaymentStatus = (OBWritePaymentDetailsResponse1DataPaymentStatus) o;
    return Objects.equals(this.paymentTransactionId, obWritePaymentDetailsResponse1DataPaymentStatus.paymentTransactionId) &&
            Objects.equals(this.status, obWritePaymentDetailsResponse1DataPaymentStatus.status) &&
            Objects.equals(this.statusUpdateDateTime, obWritePaymentDetailsResponse1DataPaymentStatus.statusUpdateDateTime) &&
            Objects.equals(this.statusDetail, obWritePaymentDetailsResponse1DataPaymentStatus.statusDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionId, status, statusUpdateDateTime, statusDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWritePaymentDetailsResponse1DataPaymentStatus {\n");

    sb.append("    paymentTransactionId: ").append(toIndentedString(paymentTransactionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
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

