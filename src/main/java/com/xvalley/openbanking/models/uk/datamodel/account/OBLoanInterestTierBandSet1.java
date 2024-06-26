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
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.xvalley.openbanking.models.uk.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The group of tiers or bands for which debit interest can be applied.
 */
@ApiModel(description = "The group of tiers or bands for which debit interest can be applied.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:27:41.089+01:00")
public class OBLoanInterestTierBandSet1 {
    @JsonProperty("TierBandMethod")
    private OBTierBandType1Code tierBandMethod = null;

    @JsonProperty("Identification")
    private String identification = null;

    @JsonProperty("CalculationMethod")
    private OBInterestCalculationMethod1Code calculationMethod = null;

    @JsonProperty("Notes")
    private List<String> notes = null;

    @JsonProperty("OtherCalculationMethod")
    private OBOtherCodeType1 otherCalculationMethod = null;

    @JsonProperty("LoanInterestTierBand")
    private List<OBLoanInterestTierBand1> loanInterestTierBand = new ArrayList<OBLoanInterestTierBand1>();

    @JsonProperty("LoanInterestFeesCharges")
    private List<OBLoanInterestFeesCharges1> loanInterestFeesCharges = null;

    public OBLoanInterestTierBandSet1 tierBandMethod(OBTierBandType1Code tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
        return this;
    }

    /**
     * Get tierBandMethod
     *
     * @return tierBandMethod
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBTierBandType1Code getTierBandMethod() {
        return tierBandMethod;
    }

    public void setTierBandMethod(OBTierBandType1Code tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
    }

    public OBLoanInterestTierBandSet1 identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Loan interest tierbandset identification. Used by  loan providers for internal use purpose.
     *
     * @return identification
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "Loan interest tierbandset identification. Used by  loan providers for internal use purpose.")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBLoanInterestTierBandSet1 calculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
        this.calculationMethod = calculationMethod;
        return this;
    }

    /**
     * Get calculationMethod
     *
     * @return calculationMethod
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBInterestCalculationMethod1Code getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    public OBLoanInterestTierBandSet1 notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBLoanInterestTierBandSet1 addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the Tier Band Set details
     *
     * @return notes
     **/
    @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band Set details")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public OBLoanInterestTierBandSet1 otherCalculationMethod(OBOtherCodeType1 otherCalculationMethod) {
        this.otherCalculationMethod = otherCalculationMethod;
        return this;
    }

    /**
     * Get otherCalculationMethod
     *
     * @return otherCalculationMethod
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBOtherCodeType1 getOtherCalculationMethod() {
        return otherCalculationMethod;
    }

    public void setOtherCalculationMethod(OBOtherCodeType1 otherCalculationMethod) {
        this.otherCalculationMethod = otherCalculationMethod;
    }

    public OBLoanInterestTierBandSet1 loanInterestTierBand(List<OBLoanInterestTierBand1> loanInterestTierBand) {
        this.loanInterestTierBand = loanInterestTierBand;
        return this;
    }

    public OBLoanInterestTierBandSet1 addLoanInterestTierBandItem(OBLoanInterestTierBand1 loanInterestTierBandItem) {
        this.loanInterestTierBand.add(loanInterestTierBandItem);
        return this;
    }

    /**
     * Tier Band Details
     *
     * @return loanInterestTierBand
     **/
    @NotNull
    @Valid
    @Size(min = 1)
    @ApiModelProperty(required = true, value = "Tier Band Details")
    public List<OBLoanInterestTierBand1> getLoanInterestTierBand() {
        return loanInterestTierBand;
    }

    public void setLoanInterestTierBand(List<OBLoanInterestTierBand1> loanInterestTierBand) {
        this.loanInterestTierBand = loanInterestTierBand;
    }

    public OBLoanInterestTierBandSet1 loanInterestFeesCharges(List<OBLoanInterestFeesCharges1> loanInterestFeesCharges) {
        this.loanInterestFeesCharges = loanInterestFeesCharges;
        return this;
    }

    public OBLoanInterestTierBandSet1 addLoanInterestFeesChargesItem(OBLoanInterestFeesCharges1 loanInterestFeesChargesItem) {
        if (this.loanInterestFeesCharges == null) {
            this.loanInterestFeesCharges = new ArrayList<OBLoanInterestFeesCharges1>();
        }
        this.loanInterestFeesCharges.add(loanInterestFeesChargesItem);
        return this;
    }

    /**
     * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
     *
     * @return loanInterestFeesCharges
     **/
    @Valid
    @ApiModelProperty(value = "Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits")
    public List<OBLoanInterestFeesCharges1> getLoanInterestFeesCharges() {
        return loanInterestFeesCharges;
    }

    public void setLoanInterestFeesCharges(List<OBLoanInterestFeesCharges1> loanInterestFeesCharges) {
        this.loanInterestFeesCharges = loanInterestFeesCharges;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBLoanInterestTierBandSet1 obLoanInterestTierBandSet1 = (OBLoanInterestTierBandSet1) o;
        return Objects.equals(this.tierBandMethod, obLoanInterestTierBandSet1.tierBandMethod) &&
                Objects.equals(this.identification, obLoanInterestTierBandSet1.identification) &&
                Objects.equals(this.calculationMethod, obLoanInterestTierBandSet1.calculationMethod) &&
                Objects.equals(this.notes, obLoanInterestTierBandSet1.notes) &&
                Objects.equals(this.otherCalculationMethod, obLoanInterestTierBandSet1.otherCalculationMethod) &&
                Objects.equals(this.loanInterestTierBand, obLoanInterestTierBandSet1.loanInterestTierBand) &&
                Objects.equals(this.loanInterestFeesCharges, obLoanInterestTierBandSet1.loanInterestFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tierBandMethod, identification, calculationMethod, notes, otherCalculationMethod, loanInterestTierBand, loanInterestFeesCharges);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBLoanInterestTierBandSet1 {\n");

        sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherCalculationMethod: ").append(toIndentedString(otherCalculationMethod)).append("\n");
        sb.append("    loanInterestTierBand: ").append(toIndentedString(loanInterestTierBand)).append("\n");
        sb.append("    loanInterestFeesCharges: ").append(toIndentedString(loanInterestFeesCharges)).append("\n");
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

