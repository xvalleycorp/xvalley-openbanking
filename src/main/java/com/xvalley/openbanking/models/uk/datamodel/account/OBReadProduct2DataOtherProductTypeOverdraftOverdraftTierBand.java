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
package com.xvalley.openbanking.models.uk.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Provides overdraft details for a specific tier or band
 */
@ApiModel(description = "Provides overdraft details for a specific tier or band")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand {
    @JsonProperty("Identification")
    private String identification;

    @JsonProperty("TierValueMin")
    private String tierValueMin;

    @JsonProperty("TierValueMax")
    private String tierValueMax;

    @JsonProperty("EAR")
    private String EAR;

    @JsonProperty("AgreementLengthMin")
    private Integer agreementLengthMin;

    @JsonProperty("AgreementLengthMax")
    private Integer agreementLengthMax;

    /**
     * Specifies the period of a fixed length overdraft agreement
     */
    public enum AgreementPeriodEnum {
        PACT("PACT"),

        PDAY("PDAY"),

        PHYR("PHYR"),

        PMTH("PMTH"),

        PQTR("PQTR"),

        PWEK("PWEK"),

        PYER("PYER");

        private String value;

    AgreementPeriodEnum(String value) {
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
        public static AgreementPeriodEnum fromValue(String value) {
            for (AgreementPeriodEnum b : AgreementPeriodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("AgreementPeriod")
    private AgreementPeriodEnum agreementPeriod;

    /**
     * Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is �2k and the interest tiers are:- 0-�500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the �Whole� of the account balance,  and in the 2nd that it is �Tiered�.
     */
    public enum OverdraftInterestChargingCoverageEnum {
        INBA("INBA"),

        INTI("INTI"),

        INWH("INWH");

    private String value;

    OverdraftInterestChargingCoverageEnum(String value) {
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
        public static OverdraftInterestChargingCoverageEnum fromValue(String value) {
            for (OverdraftInterestChargingCoverageEnum b : OverdraftInterestChargingCoverageEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("OverdraftInterestChargingCoverage")
    private OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage;

    @JsonProperty("BankGuaranteedIndicator")
    private Boolean bankGuaranteedIndicator;

    @JsonProperty("Notes")
    @Valid
    private List<String> notes = null;

    @JsonProperty("OverdraftFeesCharges")
    @Valid
    private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges> overdraftFeesCharges = null;

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for a overdraft.
     *
     * @return identification
     */
    @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a overdraft.")
    @Size(min = 1, max = 35)
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand tierValueMin(String tierValueMin) {
        this.tierValueMin = tierValueMin;
        return this;
    }

    /**
     * Minimum value of Overdraft Tier/Band
     *
     * @return tierValueMin
     */
    @ApiModelProperty(required = true, value = "Minimum value of Overdraft Tier/Band")
    @NotNull
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    public String getTierValueMin() {
        return tierValueMin;
    }

    public void setTierValueMin(String tierValueMin) {
        this.tierValueMin = tierValueMin;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand tierValueMax(String tierValueMax) {
        this.tierValueMax = tierValueMax;
        return this;
    }

    /**
     * Maximum value of Overdraft Tier/Band
     *
     * @return tierValueMax
     */
    @ApiModelProperty(value = "Maximum value of Overdraft Tier/Band")
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    public String getTierValueMax() {
        return tierValueMax;
    }

    public void setTierValueMax(String tierValueMax) {
        this.tierValueMax = tierValueMax;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand EAR(String EAR) {
        this.EAR = EAR;
        return this;
    }

    /**
     * EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.
     *
     * @return EAR
     */
    @ApiModelProperty(value = "EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.")
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    public String getEAR() {
        return EAR;
    }

    public void setEAR(String EAR) {
        this.EAR = EAR;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand agreementLengthMin(Integer agreementLengthMin) {
        this.agreementLengthMin = agreementLengthMin;
        return this;
    }

    /**
     * Specifies the minimum length of a band for a fixed overdraft agreement
     *
     * @return agreementLengthMin
     */
    @ApiModelProperty(value = "Specifies the minimum length of a band for a fixed overdraft agreement")
    public Integer getAgreementLengthMin() {
        return agreementLengthMin;
    }

    public void setAgreementLengthMin(Integer agreementLengthMin) {
        this.agreementLengthMin = agreementLengthMin;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand agreementLengthMax(Integer agreementLengthMax) {
        this.agreementLengthMax = agreementLengthMax;
        return this;
    }

    /**
     * Specifies the maximum length of a band for a fixed overdraft agreement
     *
     * @return agreementLengthMax
     */
    @ApiModelProperty(value = "Specifies the maximum length of a band for a fixed overdraft agreement")
    public Integer getAgreementLengthMax() {
        return agreementLengthMax;
    }

    public void setAgreementLengthMax(Integer agreementLengthMax) {
        this.agreementLengthMax = agreementLengthMax;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand agreementPeriod(AgreementPeriodEnum agreementPeriod) {
        this.agreementPeriod = agreementPeriod;
        return this;
    }

    /**
     * Specifies the period of a fixed length overdraft agreement
     *
     * @return agreementPeriod
     */
    @ApiModelProperty(value = "Specifies the period of a fixed length overdraft agreement")
    public AgreementPeriodEnum getAgreementPeriod() {
        return agreementPeriod;
    }

    public void setAgreementPeriod(AgreementPeriodEnum agreementPeriod) {
        this.agreementPeriod = agreementPeriod;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand overdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
        this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
        return this;
    }

    /**
     * Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is �2k and the interest tiers are:- 0-�500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the �Whole� of the account balance,  and in the 2nd that it is �Tiered�.
     *
     * @return overdraftInterestChargingCoverage
     */
    @ApiModelProperty(value = "Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is �2k and the interest tiers are:- 0-�500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the �Whole� of the account balance,  and in the 2nd that it is �Tiered�.")
    public OverdraftInterestChargingCoverageEnum getOverdraftInterestChargingCoverage() {
        return overdraftInterestChargingCoverage;
    }

    public void setOverdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
        this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand bankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
        this.bankGuaranteedIndicator = bankGuaranteedIndicator;
        return this;
    }

    /**
     * Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it�s part of a government scheme, or whether the rate may vary dependent on the applicant�s circumstances.
     *
     * @return bankGuaranteedIndicator
     */
    @ApiModelProperty(value = "Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it�s part of a government scheme, or whether the rate may vary dependent on the applicant�s circumstances.")
    public Boolean getBankGuaranteedIndicator() {
        return bankGuaranteedIndicator;
    }

    public void setBankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
        this.bankGuaranteedIndicator = bankGuaranteedIndicator;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand notes(List<String> notes) {
        this.notes = notes;
        return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand addNotesItem(String notesItem) {
    if (this.notes == null) {
        this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
      return this;
  }

    /**
     * Get notes
     *
     * @return notes
     */
    @ApiModelProperty(value = "")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand overdraftFeesCharges(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges> overdraftFeesCharges) {
        this.overdraftFeesCharges = overdraftFeesCharges;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand addOverdraftFeesChargesItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges overdraftFeesChargesItem) {
        if (this.overdraftFeesCharges == null) {
            this.overdraftFeesCharges = new ArrayList<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges>();
        }
        this.overdraftFeesCharges.add(overdraftFeesChargesItem);
        return this;
    }

    /**
     * Get overdraftFeesCharges
     *
     * @return overdraftFeesCharges
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges> getOverdraftFeesCharges() {
        return overdraftFeesCharges;
    }

    public void setOverdraftFeesCharges(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges> overdraftFeesCharges) {
        this.overdraftFeesCharges = overdraftFeesCharges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand = (OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand) o;
        return Objects.equals(this.identification, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.identification) &&
                Objects.equals(this.tierValueMin, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.tierValueMin) &&
                Objects.equals(this.tierValueMax, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.tierValueMax) &&
                Objects.equals(this.EAR, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.EAR) &&
                Objects.equals(this.agreementLengthMin, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.agreementLengthMin) &&
                Objects.equals(this.agreementLengthMax, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.agreementLengthMax) &&
                Objects.equals(this.agreementPeriod, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.agreementPeriod) &&
                Objects.equals(this.overdraftInterestChargingCoverage, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.overdraftInterestChargingCoverage) &&
                Objects.equals(this.bankGuaranteedIndicator, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.bankGuaranteedIndicator) &&
                Objects.equals(this.notes, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.notes) &&
                Objects.equals(this.overdraftFeesCharges, obReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand.overdraftFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, tierValueMin, tierValueMax, EAR, agreementLengthMin, agreementLengthMax, agreementPeriod, overdraftInterestChargingCoverage, bankGuaranteedIndicator, notes, overdraftFeesCharges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand {\n");

        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    tierValueMin: ").append(toIndentedString(tierValueMin)).append("\n");
        sb.append("    tierValueMax: ").append(toIndentedString(tierValueMax)).append("\n");
        sb.append("    EAR: ").append(toIndentedString(EAR)).append("\n");
        sb.append("    agreementLengthMin: ").append(toIndentedString(agreementLengthMin)).append("\n");
        sb.append("    agreementLengthMax: ").append(toIndentedString(agreementLengthMax)).append("\n");
        sb.append("    agreementPeriod: ").append(toIndentedString(agreementPeriod)).append("\n");
        sb.append("    overdraftInterestChargingCoverage: ").append(toIndentedString(overdraftInterestChargingCoverage)).append("\n");
        sb.append("    bankGuaranteedIndicator: ").append(toIndentedString(bankGuaranteedIndicator)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    overdraftFeesCharges: ").append(toIndentedString(overdraftFeesCharges)).append("\n");
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

