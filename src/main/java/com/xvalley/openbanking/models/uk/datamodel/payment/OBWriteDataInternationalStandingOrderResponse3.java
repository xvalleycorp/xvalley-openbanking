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
 * OpenAPI spec version: v3.1.1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.xvalley.openbanking.models.uk.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBWriteDataInternationalStandingOrderResponse3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:45:43.255+01:00")
public class OBWriteDataInternationalStandingOrderResponse3 {
    @JsonProperty("InternationalStandingOrderId")
    private String internationalStandingOrderId = null;

    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("CreationDateTime")
    private DateTime creationDateTime = null;

    @JsonProperty("Status")
    private OBExternalStatus1Code status = null;

    @JsonProperty("StatusUpdateDateTime")
    private DateTime statusUpdateDateTime = null;

    @JsonProperty("Charges")
    private List<OBCharge2> charges = null;

    @JsonProperty("Initiation")
    private OBInternationalStandingOrder3 initiation = null;

    @JsonProperty("MultiAuthorisation")
    private OBMultiAuthorisation1 multiAuthorisation = null;

    public OBWriteDataInternationalStandingOrderResponse3 internationalStandingOrderId(String internationalStandingOrderId) {
        this.internationalStandingOrderId = internationalStandingOrderId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the international standing order resource.
     *
     * @return internationalStandingOrderId
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the international standing order resource.")
    public String getInternationalStandingOrderId() {
        return internationalStandingOrderId;
    }

    public void setInternationalStandingOrderId(String internationalStandingOrderId) {
        this.internationalStandingOrderId = internationalStandingOrderId;
    }

    public OBWriteDataInternationalStandingOrderResponse3 consentId(String consentId) {
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

    public OBWriteDataInternationalStandingOrderResponse3 creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteDataInternationalStandingOrderResponse3 status(OBExternalStatus1Code status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBExternalStatus1Code getStatus() {
        return status;
    }

    public void setStatus(OBExternalStatus1Code status) {
        this.status = status;
    }

    public OBWriteDataInternationalStandingOrderResponse3 statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return statusUpdateDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWriteDataInternationalStandingOrderResponse3 charges(List<OBCharge2> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteDataInternationalStandingOrderResponse3 addChargesItem(OBCharge2 chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<OBCharge2>();
        }
        this.charges.add(chargesItem);
        return this;
    }

    /**
     * Set of elements used to provide details of a charge for the payment initiation.
     *
     * @return charges
     **/
    @Valid
    @ApiModelProperty(value = "Set of elements used to provide details of a charge for the payment initiation.")
    public List<OBCharge2> getCharges() {
        return charges;
    }

    public void setCharges(List<OBCharge2> charges) {
        this.charges = charges;
    }

    public OBWriteDataInternationalStandingOrderResponse3 initiation(OBInternationalStandingOrder3 initiation) {
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
    public OBInternationalStandingOrder3 getInitiation() {
        return initiation;
    }

    public void setInitiation(OBInternationalStandingOrder3 initiation) {
        this.initiation = initiation;
    }

    public OBWriteDataInternationalStandingOrderResponse3 multiAuthorisation(OBMultiAuthorisation1 multiAuthorisation) {
        this.multiAuthorisation = multiAuthorisation;
        return this;
    }

    /**
     * Get multiAuthorisation
     *
     * @return multiAuthorisation
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBMultiAuthorisation1 getMultiAuthorisation() {
        return multiAuthorisation;
    }

    public void setMultiAuthorisation(OBMultiAuthorisation1 multiAuthorisation) {
        this.multiAuthorisation = multiAuthorisation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDataInternationalStandingOrderResponse3 obWriteDataInternationalStandingOrderResponse3 = (OBWriteDataInternationalStandingOrderResponse3) o;
        return Objects.equals(this.internationalStandingOrderId, obWriteDataInternationalStandingOrderResponse3.internationalStandingOrderId) &&
                Objects.equals(this.consentId, obWriteDataInternationalStandingOrderResponse3.consentId) &&
                Objects.equals(this.creationDateTime, obWriteDataInternationalStandingOrderResponse3.creationDateTime) &&
                Objects.equals(this.status, obWriteDataInternationalStandingOrderResponse3.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteDataInternationalStandingOrderResponse3.statusUpdateDateTime) &&
                Objects.equals(this.charges, obWriteDataInternationalStandingOrderResponse3.charges) &&
                Objects.equals(this.initiation, obWriteDataInternationalStandingOrderResponse3.initiation) &&
                Objects.equals(this.multiAuthorisation, obWriteDataInternationalStandingOrderResponse3.multiAuthorisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internationalStandingOrderId, consentId, creationDateTime, status, statusUpdateDateTime, charges, initiation, multiAuthorisation);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDataInternationalStandingOrderResponse3 {\n");

        sb.append("    internationalStandingOrderId: ").append(toIndentedString(internationalStandingOrderId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    multiAuthorisation: ").append(toIndentedString(multiAuthorisation)).append("\n");
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

