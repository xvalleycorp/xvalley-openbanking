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
 * OBWriteDataDomesticStandingOrderConsentResponse3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:45:43.255+01:00")
public class OBWriteDataDomesticStandingOrderConsentResponse3 {
    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("CreationDateTime")
    private DateTime creationDateTime = null;

    @JsonProperty("Status")
    private OBExternalConsentStatus1Code status = null;

    @JsonProperty("StatusUpdateDateTime")
    private DateTime statusUpdateDateTime = null;

    @JsonProperty("Permission")
    private OBExternalPermissions2Code permission = null;

    @JsonProperty("CutOffDateTime")
    private DateTime cutOffDateTime = null;

    @JsonProperty("Charges")
    private List<OBCharge2> charges = null;

    @JsonProperty("Initiation")
    private OBDomesticStandingOrder3 initiation = null;

    @JsonProperty("Authorisation")
    private OBAuthorisation1 authorisation = null;

    public OBWriteDataDomesticStandingOrderConsentResponse3 consentId(String consentId) {
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

    public OBWriteDataDomesticStandingOrderConsentResponse3 creationDateTime(DateTime creationDateTime) {
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

    public OBWriteDataDomesticStandingOrderConsentResponse3 status(OBExternalConsentStatus1Code status) {
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
    public OBExternalConsentStatus1Code getStatus() {
        return status;
    }

    public void setStatus(OBExternalConsentStatus1Code status) {
        this.status = status;
    }

    public OBWriteDataDomesticStandingOrderConsentResponse3 statusUpdateDateTime(DateTime statusUpdateDateTime) {
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

    public OBWriteDataDomesticStandingOrderConsentResponse3 permission(OBExternalPermissions2Code permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Get permission
     *
     * @return permission
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBExternalPermissions2Code getPermission() {
        return permission;
    }

    public void setPermission(OBExternalPermissions2Code permission) {
        this.permission = permission;
    }

    public OBWriteDataDomesticStandingOrderConsentResponse3 cutOffDateTime(DateTime cutOffDateTime) {
        this.cutOffDateTime = cutOffDateTime;
        return this;
    }

    /**
     * Specified cut-off date and time for the payment consent. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return cutOffDateTime
     **/
    @Valid
    @ApiModelProperty(value = "Specified cut-off date and time for the payment consent. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getCutOffDateTime() {
        return cutOffDateTime;
    }

    public void setCutOffDateTime(DateTime cutOffDateTime) {
        this.cutOffDateTime = cutOffDateTime;
    }

    public OBWriteDataDomesticStandingOrderConsentResponse3 charges(List<OBCharge2> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteDataDomesticStandingOrderConsentResponse3 addChargesItem(OBCharge2 chargesItem) {
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

    public OBWriteDataDomesticStandingOrderConsentResponse3 initiation(OBDomesticStandingOrder3 initiation) {
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
    public OBDomesticStandingOrder3 getInitiation() {
        return initiation;
    }

    public void setInitiation(OBDomesticStandingOrder3 initiation) {
        this.initiation = initiation;
    }

    public OBWriteDataDomesticStandingOrderConsentResponse3 authorisation(OBAuthorisation1 authorisation) {
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
    public OBAuthorisation1 getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(OBAuthorisation1 authorisation) {
        this.authorisation = authorisation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDataDomesticStandingOrderConsentResponse3 obWriteDataDomesticStandingOrderConsentResponse3 = (OBWriteDataDomesticStandingOrderConsentResponse3) o;
        return Objects.equals(this.consentId, obWriteDataDomesticStandingOrderConsentResponse3.consentId) &&
                Objects.equals(this.creationDateTime, obWriteDataDomesticStandingOrderConsentResponse3.creationDateTime) &&
                Objects.equals(this.status, obWriteDataDomesticStandingOrderConsentResponse3.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteDataDomesticStandingOrderConsentResponse3.statusUpdateDateTime) &&
                Objects.equals(this.permission, obWriteDataDomesticStandingOrderConsentResponse3.permission) &&
                Objects.equals(this.cutOffDateTime, obWriteDataDomesticStandingOrderConsentResponse3.cutOffDateTime) &&
                Objects.equals(this.charges, obWriteDataDomesticStandingOrderConsentResponse3.charges) &&
                Objects.equals(this.initiation, obWriteDataDomesticStandingOrderConsentResponse3.initiation) &&
                Objects.equals(this.authorisation, obWriteDataDomesticStandingOrderConsentResponse3.authorisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, creationDateTime, status, statusUpdateDateTime, permission, cutOffDateTime, charges, initiation, authorisation);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDataDomesticStandingOrderConsentResponse3 {\n");

        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    cutOffDateTime: ").append(toIndentedString(cutOffDateTime)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
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

