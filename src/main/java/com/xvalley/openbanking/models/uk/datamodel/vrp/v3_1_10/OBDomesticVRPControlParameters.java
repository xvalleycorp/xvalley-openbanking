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
package com.xvalley.openbanking.models.uk.datamodel.vrp.v3_1_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBSupplementaryData1;
import com.xvalley.openbanking.models.uk.datamodel.vrp.OBActiveOrHistoricCurrencyAndAmount;
import com.xvalley.openbanking.models.uk.datamodel.vrp.OBDomesticVRPControlParametersPeriodicLimits;
import com.xvalley.openbanking.models.uk.datamodel.vrp.OBVRPInteractionTypes;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBDomesticVRPControlParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-21T08:45:28.716207+01:00[Europe/London]")
public class OBDomesticVRPControlParameters {
    @JsonProperty("ValidFromDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime validFromDateTime;

    @JsonProperty("ValidToDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime validToDateTime;

    @JsonProperty("MaximumIndividualAmount")
    private OBActiveOrHistoricCurrencyAndAmount maximumIndividualAmount;

    @JsonProperty("PeriodicLimits")
    @Valid
    private List<OBDomesticVRPControlParametersPeriodicLimits> periodicLimits = new ArrayList<OBDomesticVRPControlParametersPeriodicLimits>();

    @JsonProperty("VRPType")
    @Valid
    private List<String> vrPType = new ArrayList<String>();

    @JsonProperty("PSUAuthenticationMethods")
    @Valid
    private List<String> psUAuthenticationMethods = new ArrayList<String>();

    @JsonProperty("PSUInteractionTypes")
    @Valid
    private List<OBVRPInteractionTypes> psUInteractionTypes = null;

    @JsonProperty("SupplementaryData")
    private OBSupplementaryData1 supplementaryData;

    public OBDomesticVRPControlParameters validFromDateTime(DateTime validFromDateTime) {
        this.validFromDateTime = validFromDateTime;
        return this;
    }

    /**
     * ^ Start date time for which the consent remains valid.
     * @return validFromDateTime
     */
    @ApiModelProperty(value = "^ Start date time for which the consent remains valid.")

    @Valid

    public DateTime getValidFromDateTime() {
        return validFromDateTime;
    }

    public void setValidFromDateTime(DateTime validFromDateTime) {
        this.validFromDateTime = validFromDateTime;
    }

    public OBDomesticVRPControlParameters validToDateTime(DateTime validToDateTime) {
        this.validToDateTime = validToDateTime;
        return this;
    }

    /**
     * ^ End date time for which the consent remains valid.
     * @return validToDateTime
     */
    @ApiModelProperty(value = "^ End date time for which the consent remains valid.")

    @Valid

    public DateTime getValidToDateTime() {
        return validToDateTime;
    }

    public void setValidToDateTime(DateTime validToDateTime) {
        this.validToDateTime = validToDateTime;
    }

    public OBDomesticVRPControlParameters maximumIndividualAmount(OBActiveOrHistoricCurrencyAndAmount maximumIndividualAmount) {
        this.maximumIndividualAmount = maximumIndividualAmount;
        return this;
    }

    /**
     * Get maximumIndividualAmount
     * @return maximumIndividualAmount
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBActiveOrHistoricCurrencyAndAmount getMaximumIndividualAmount() {
        return maximumIndividualAmount;
    }

    public void setMaximumIndividualAmount(OBActiveOrHistoricCurrencyAndAmount maximumIndividualAmount) {
        this.maximumIndividualAmount = maximumIndividualAmount;
    }

    public OBDomesticVRPControlParameters periodicLimits(List<OBDomesticVRPControlParametersPeriodicLimits> periodicLimits) {
        this.periodicLimits = periodicLimits;
        return this;
    }

    public OBDomesticVRPControlParameters addPeriodicLimitsItem(OBDomesticVRPControlParametersPeriodicLimits periodicLimitsItem) {
        this.periodicLimits.add(periodicLimitsItem);
        return this;
    }

    /**
     * Get periodicLimits
     * @return periodicLimits
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid
    @Size(min = 1)
    public List<OBDomesticVRPControlParametersPeriodicLimits> getPeriodicLimits() {
        return periodicLimits;
    }

    public void setPeriodicLimits(List<OBDomesticVRPControlParametersPeriodicLimits> periodicLimits) {
        this.periodicLimits = periodicLimits;
    }

    public OBDomesticVRPControlParameters vrPType(List<String> vrPType) {
        this.vrPType = vrPType;
        return this;
    }

    public OBDomesticVRPControlParameters addVrPTypeItem(String vrPTypeItem) {
        this.vrPType.add(vrPTypeItem);
        return this;
    }

    /**
     * ^ The types of payments that can be made under this VRP consent. This can be used to indicate whether this include sweeping payment or other ecommerce payments.
     * @return vrPType
     */
    @ApiModelProperty(required = true, value = "^ The types of payments that can be made under this VRP consent. This can be used to indicate whether this include sweeping payment or other ecommerce payments.")
    @NotNull

    @Size(min = 1)
    public List<String> getVrPType() {
        return vrPType;
    }

    public void setVrPType(List<String> vrPType) {
        this.vrPType = vrPType;
    }

    public OBDomesticVRPControlParameters psUAuthenticationMethods(List<String> psUAuthenticationMethods) {
        this.psUAuthenticationMethods = psUAuthenticationMethods;
        return this;
    }

    public OBDomesticVRPControlParameters addPsUAuthenticationMethodsItem(String psUAuthenticationMethodsItem) {
        this.psUAuthenticationMethods.add(psUAuthenticationMethodsItem);
        return this;
    }

    /**
     * ^ Indicates that the PSU authentication methods supported.
     * @return psUAuthenticationMethods
     */
    @ApiModelProperty(required = true, value = "^ Indicates that the PSU authentication methods supported.")
    @NotNull

    @Size(min = 1)
    public List<String> getPsUAuthenticationMethods() {
        return psUAuthenticationMethods;
    }

    public void setPsUAuthenticationMethods(List<String> psUAuthenticationMethods) {
        this.psUAuthenticationMethods = psUAuthenticationMethods;
    }

    public OBDomesticVRPControlParameters psUInteractionTypes(List<OBVRPInteractionTypes> psUInteractionTypes) {
        this.psUInteractionTypes = psUInteractionTypes;
        return this;
    }

    public OBDomesticVRPControlParameters addPsUInteractionTypesItem(OBVRPInteractionTypes psUInteractionTypesItem) {
        if (this.psUInteractionTypes == null) {
            this.psUInteractionTypes = new ArrayList<OBVRPInteractionTypes>();
        }
        this.psUInteractionTypes.add(psUInteractionTypesItem);
        return this;
    }

    /**
     * ^ Indicates interaction type, currently if customer is present or not present.
     * @return psUInteractionTypes
     */
    @ApiModelProperty(value = "^ Indicates interaction type, currently if customer is present or not present.")

    @Valid

    public List<OBVRPInteractionTypes> getPsUInteractionTypes() {
        return psUInteractionTypes;
    }

    public void setPsUInteractionTypes(List<OBVRPInteractionTypes> psUInteractionTypes) {
        this.psUInteractionTypes = psUInteractionTypes;
    }

    public OBDomesticVRPControlParameters supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * ^ Additional information that can not be captured in the structured fields and/or any other specific block
     * @return supplementaryData
     */
    @ApiModelProperty(value = "^ Additional information that can not be captured in the structured fields and/or any other specific block")


    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBDomesticVRPControlParameters obDomesticVRPControlParameters = (OBDomesticVRPControlParameters) o;
        return Objects.equals(this.validFromDateTime, obDomesticVRPControlParameters.validFromDateTime) &&
                Objects.equals(this.validToDateTime, obDomesticVRPControlParameters.validToDateTime) &&
                Objects.equals(this.maximumIndividualAmount, obDomesticVRPControlParameters.maximumIndividualAmount) &&
                Objects.equals(this.periodicLimits, obDomesticVRPControlParameters.periodicLimits) &&
                Objects.equals(this.vrPType, obDomesticVRPControlParameters.vrPType) &&
                Objects.equals(this.psUAuthenticationMethods, obDomesticVRPControlParameters.psUAuthenticationMethods) &&
                Objects.equals(this.psUInteractionTypes, obDomesticVRPControlParameters.psUInteractionTypes) &&
                Objects.equals(this.supplementaryData, obDomesticVRPControlParameters.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validFromDateTime, validToDateTime, maximumIndividualAmount, periodicLimits, vrPType, psUAuthenticationMethods, psUInteractionTypes, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPControlParameters {\n");

        sb.append("    validFromDateTime: ").append(toIndentedString(validFromDateTime)).append("\n");
        sb.append("    validToDateTime: ").append(toIndentedString(validToDateTime)).append("\n");
        sb.append("    maximumIndividualAmount: ").append(toIndentedString(maximumIndividualAmount)).append("\n");
        sb.append("    periodicLimits: ").append(toIndentedString(periodicLimits)).append("\n");
        sb.append("    vrPType: ").append(toIndentedString(vrPType)).append("\n");
        sb.append("    psUAuthenticationMethods: ").append(toIndentedString(psUAuthenticationMethods)).append("\n");
        sb.append("    psUInteractionTypes: ").append(toIndentedString(psUInteractionTypes)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

