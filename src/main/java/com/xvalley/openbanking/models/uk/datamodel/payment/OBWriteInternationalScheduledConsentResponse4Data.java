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
/*
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.3-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.xvalley.openbanking.models.uk.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBWriteInternationalScheduledConsentResponse4Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T11:45:24.725+01:00")
public class OBWriteInternationalScheduledConsentResponse4Data {
    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("CreationDateTime")
    private DateTime creationDateTime = null;

    /**
     * Specifies the status of consent resource in code form.
     */
    public enum StatusEnum {
        AUTHORISED("Authorised"),

        AWAITINGAUTHORISATION("AwaitingAuthorisation"),

        CONSUMED("Consumed"),

        REJECTED("Rejected");

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
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("Status")
    private StatusEnum status = null;

    @JsonProperty("StatusUpdateDateTime")
    private DateTime statusUpdateDateTime = null;

    @JsonProperty("Permission")
    private OBExternalPermissions2Code permission = null;

    @JsonProperty("CutOffDateTime")
    private DateTime cutOffDateTime = null;

    @JsonProperty("ExpectedExecutionDateTime")
    private DateTime expectedExecutionDateTime = null;

    @JsonProperty("ExpectedSettlementDateTime")
    private DateTime expectedSettlementDateTime = null;

    @JsonProperty("Charges")
    private List<OBWriteDomesticConsentResponse3DataCharges> charges = null;

    @JsonProperty("ExchangeRateInformation")
    private OBWriteInternationalConsentResponse4DataExchangeRateInformation exchangeRateInformation = null;

    @JsonProperty("Initiation")
    private OBWriteInternationalScheduled3DataInitiation initiation = null;

    @JsonProperty("Authorisation")
    private OBWriteDomesticConsent3DataAuthorisation authorisation = null;

    @JsonProperty("SCASupportData")
    private OBWriteDomesticConsent3DataSCASupportData scASupportData = null;

    public OBWriteInternationalScheduledConsentResponse4Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
     *
     * @return consentId
     **/
    @NotNull
    @Size(min = 1, max = 128)
    @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBWriteInternationalScheduledConsentResponse4Data creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteInternationalScheduledConsentResponse4Data status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the status of consent resource in code form.
     *
     * @return status
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Specifies the status of consent resource in code form.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OBWriteInternationalScheduledConsentResponse4Data statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return statusUpdateDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWriteInternationalScheduledConsentResponse4Data permission(OBExternalPermissions2Code permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Specifies the Open Banking service request types.
     *
     * @return permission
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Specifies the Open Banking service request types.")
    public OBExternalPermissions2Code getPermission() {
        return permission;
    }

    public void setPermission(OBExternalPermissions2Code permission) {
        this.permission = permission;
    }

    public OBWriteInternationalScheduledConsentResponse4Data cutOffDateTime(DateTime cutOffDateTime) {
        this.cutOffDateTime = cutOffDateTime;
        return this;
    }

    /**
     * Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return cutOffDateTime
     **/
    @Valid
    @ApiModelProperty(value = "Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getCutOffDateTime() {
        return cutOffDateTime;
    }

    public void setCutOffDateTime(DateTime cutOffDateTime) {
        this.cutOffDateTime = cutOffDateTime;
    }

    public OBWriteInternationalScheduledConsentResponse4Data expectedExecutionDateTime(DateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
        return this;
    }

    /**
     * Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expectedExecutionDateTime
     **/
    @Valid
    @ApiModelProperty(value = "Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getExpectedExecutionDateTime() {
        return expectedExecutionDateTime;
    }

    public void setExpectedExecutionDateTime(DateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
    }

    public OBWriteInternationalScheduledConsentResponse4Data expectedSettlementDateTime(DateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
        return this;
    }

    /**
     * Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expectedSettlementDateTime
     **/
    @Valid
    @ApiModelProperty(value = "Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getExpectedSettlementDateTime() {
        return expectedSettlementDateTime;
    }

    public void setExpectedSettlementDateTime(DateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
    }

    public OBWriteInternationalScheduledConsentResponse4Data charges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteInternationalScheduledConsentResponse4Data addChargesItem(OBWriteDomesticConsentResponse3DataCharges chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<OBWriteDomesticConsentResponse3DataCharges>();
        }
        this.charges.add(chargesItem);
        return this;
    }

    /**
     * Get charges
     *
     * @return charges
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBWriteDomesticConsentResponse3DataCharges> getCharges() {
        return charges;
    }

    public void setCharges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
        this.charges = charges;
    }

    public OBWriteInternationalScheduledConsentResponse4Data exchangeRateInformation(OBWriteInternationalConsentResponse4DataExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
        return this;
    }

    /**
     * Get exchangeRateInformation
     *
     * @return exchangeRateInformation
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteInternationalConsentResponse4DataExchangeRateInformation getExchangeRateInformation() {
        return exchangeRateInformation;
    }

    public void setExchangeRateInformation(OBWriteInternationalConsentResponse4DataExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
    }

    public OBWriteInternationalScheduledConsentResponse4Data initiation(OBWriteInternationalScheduled3DataInitiation initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBWriteInternationalScheduled3DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteInternationalScheduled3DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteInternationalScheduledConsentResponse4Data authorisation(OBWriteDomesticConsent3DataAuthorisation authorisation) {
        this.authorisation = authorisation;
        return this;
    }

    /**
     * Get authorisation
     *
     * @return authorisation
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteDomesticConsent3DataAuthorisation getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(OBWriteDomesticConsent3DataAuthorisation authorisation) {
        this.authorisation = authorisation;
    }

    public OBWriteInternationalScheduledConsentResponse4Data scASupportData(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
        this.scASupportData = scASupportData;
        return this;
    }

    /**
     * Get scASupportData
     *
     * @return scASupportData
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteDomesticConsent3DataSCASupportData getScASupportData() {
        return scASupportData;
    }

    public void setScASupportData(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
        this.scASupportData = scASupportData;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalScheduledConsentResponse4Data obWriteInternationalScheduledConsentResponse4Data = (OBWriteInternationalScheduledConsentResponse4Data) o;
        return Objects.equals(this.consentId, obWriteInternationalScheduledConsentResponse4Data.consentId) &&
                Objects.equals(this.creationDateTime, obWriteInternationalScheduledConsentResponse4Data.creationDateTime) &&
                Objects.equals(this.status, obWriteInternationalScheduledConsentResponse4Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteInternationalScheduledConsentResponse4Data.statusUpdateDateTime) &&
                Objects.equals(this.permission, obWriteInternationalScheduledConsentResponse4Data.permission) &&
                Objects.equals(this.cutOffDateTime, obWriteInternationalScheduledConsentResponse4Data.cutOffDateTime) &&
                Objects.equals(this.expectedExecutionDateTime, obWriteInternationalScheduledConsentResponse4Data.expectedExecutionDateTime) &&
                Objects.equals(this.expectedSettlementDateTime, obWriteInternationalScheduledConsentResponse4Data.expectedSettlementDateTime) &&
                Objects.equals(this.charges, obWriteInternationalScheduledConsentResponse4Data.charges) &&
                Objects.equals(this.exchangeRateInformation, obWriteInternationalScheduledConsentResponse4Data.exchangeRateInformation) &&
                Objects.equals(this.initiation, obWriteInternationalScheduledConsentResponse4Data.initiation) &&
                Objects.equals(this.authorisation, obWriteInternationalScheduledConsentResponse4Data.authorisation) &&
                Objects.equals(this.scASupportData, obWriteInternationalScheduledConsentResponse4Data.scASupportData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, creationDateTime, status, statusUpdateDateTime, permission, cutOffDateTime, expectedExecutionDateTime, expectedSettlementDateTime, charges, exchangeRateInformation, initiation, authorisation, scASupportData);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalScheduledConsentResponse4Data {\n");

        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    cutOffDateTime: ").append(toIndentedString(cutOffDateTime)).append("\n");
        sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
        sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
        sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
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
