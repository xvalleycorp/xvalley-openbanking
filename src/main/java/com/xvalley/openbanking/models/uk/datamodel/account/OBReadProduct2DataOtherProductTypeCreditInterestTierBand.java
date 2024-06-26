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
 * Tier Band Details
 */
@ApiModel(description = "Tier Band Details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadProduct2DataOtherProductTypeCreditInterestTierBand {
    @JsonProperty("Identification")
    private String identification;

    @JsonProperty("TierValueMinimum")
    private String tierValueMinimum;

    @JsonProperty("TierValueMaximum")
    private String tierValueMaximum;

    /**
     * How often is credit interest calculated for the account.
     */
    public enum CalculationFrequencyEnum {
        FQAT("FQAT"),

        FQDY("FQDY"),

        FQHY("FQHY"),

        FQMY("FQMY"),

        FQOT("FQOT"),

        FQQY("FQQY"),

        FQSD("FQSD"),

        FQWY("FQWY"),

        FQYY("FQYY");

        private String value;

        CalculationFrequencyEnum(String value) {
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
        public static CalculationFrequencyEnum fromValue(String value) {
            for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("CalculationFrequency")
    private CalculationFrequencyEnum calculationFrequency;

    /**
     * How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's account.
     */
    public enum ApplicationFrequencyEnum {
        FQAT("FQAT"),

        FQDY("FQDY"),

        FQHY("FQHY"),

        FQMY("FQMY"),

        FQOT("FQOT"),

        FQQY("FQQY"),

        FQSD("FQSD"),

        FQWY("FQWY"),

        FQYY("FQYY");

        private String value;

        ApplicationFrequencyEnum(String value) {
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
        public static ApplicationFrequencyEnum fromValue(String value) {
            for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("ApplicationFrequency")
    private ApplicationFrequencyEnum applicationFrequency;

    /**
     * Amount on which Interest applied.
     */
    public enum DepositInterestAppliedCoverageEnum {
        INBA("INBA"),

        INTI("INTI"),

        INWH("INWH");

        private String value;

        DepositInterestAppliedCoverageEnum(String value) {
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
        public static DepositInterestAppliedCoverageEnum fromValue(String value) {
            for (DepositInterestAppliedCoverageEnum b : DepositInterestAppliedCoverageEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("DepositInterestAppliedCoverage")
    private DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage;

    @JsonProperty("FixedVariableInterestRateType")
    private OBInterestFixedVariableType1Code fixedVariableInterestRateType;

    @JsonProperty("AER")
    private String AER;

    /**
     * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder's account.
     */
    public enum BankInterestRateTypeEnum {
        INBB("INBB"),

        INFR("INFR"),

        INGR("INGR"),

        INLR("INLR"),

        INNE("INNE"),

        INOT("INOT");

        private String value;

        BankInterestRateTypeEnum(String value) {
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
        public static BankInterestRateTypeEnum fromValue(String value) {
            for (BankInterestRateTypeEnum b : BankInterestRateTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("BankInterestRateType")
    private BankInterestRateTypeEnum bankInterestRateType;

    @JsonProperty("BankInterestRate")
    private String bankInterestRate;

    @JsonProperty("Notes")
    @Valid
    private List<String> notes = null;

    @JsonProperty("OtherBankInterestType")
    private OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType otherBankInterestType;

    @JsonProperty("OtherApplicationFrequency")
    private OBOtherCodeType11 otherApplicationFrequency;

    @JsonProperty("OtherCalculationFrequency")
    private OBOtherCodeType12 otherCalculationFrequency;

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for the Product.
     *
     * @return identification
     */
    @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for the Product.")
    @Size(min = 1, max = 35)
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand tierValueMinimum(String tierValueMinimum) {
        this.tierValueMinimum = tierValueMinimum;
        return this;
    }

    /**
     * Minimum deposit value for which the credit interest tier applies.
     *
     * @return tierValueMinimum
     */
    @ApiModelProperty(required = true, value = "Minimum deposit value for which the credit interest tier applies.")
    @NotNull
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    public String getTierValueMinimum() {
        return tierValueMinimum;
    }

    public void setTierValueMinimum(String tierValueMinimum) {
        this.tierValueMinimum = tierValueMinimum;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand tierValueMaximum(String tierValueMaximum) {
        this.tierValueMaximum = tierValueMaximum;
        return this;
    }

    /**
     * Maximum deposit value for which the credit interest tier applies.
     *
     * @return tierValueMaximum
     */
    @ApiModelProperty(value = "Maximum deposit value for which the credit interest tier applies.")
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    public String getTierValueMaximum() {
        return tierValueMaximum;
    }

    public void setTierValueMaximum(String tierValueMaximum) {
        this.tierValueMaximum = tierValueMaximum;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
        return this;
    }

    /**
     * How often is credit interest calculated for the account.
     *
     * @return calculationFrequency
     */
    @ApiModelProperty(value = "How often is credit interest calculated for the account.")
    public CalculationFrequencyEnum getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
        return this;
    }

    /**
     * How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's account.
     *
     * @return applicationFrequency
     */
    @ApiModelProperty(required = true, value = "How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's account.")
    @NotNull
    public ApplicationFrequencyEnum getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand depositInterestAppliedCoverage(DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
        this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
        return this;
    }

    /**
     * Amount on which Interest applied.
     *
     * @return depositInterestAppliedCoverage
     */
    @ApiModelProperty(value = "Amount on which Interest applied.")
    public DepositInterestAppliedCoverageEnum getDepositInterestAppliedCoverage() {
        return depositInterestAppliedCoverage;
    }

    public void setDepositInterestAppliedCoverage(DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
        this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand fixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
        return this;
    }

    /**
     * Get fixedVariableInterestRateType
     *
     * @return fixedVariableInterestRateType
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public OBInterestFixedVariableType1Code getFixedVariableInterestRateType() {
        return fixedVariableInterestRateType;
    }

    public void setFixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand AER(String AER) {
        this.AER = AER;
        return this;
    }

    /**
     * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A
     *
     * @return AER
     */
    @ApiModelProperty(required = true, value = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A")
    @NotNull
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    public String getAER() {
        return AER;
    }

    public void setAER(String AER) {
        this.AER = AER;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand bankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
        this.bankInterestRateType = bankInterestRateType;
        return this;
    }

    /**
     * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder's account.
     *
     * @return bankInterestRateType
     */
    @ApiModelProperty(value = "Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder's account.")
    public BankInterestRateTypeEnum getBankInterestRateType() {
        return bankInterestRateType;
    }

    public void setBankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
        this.bankInterestRateType = bankInterestRateType;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand bankInterestRate(String bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
        return this;
    }

    /**
     * Bank Interest for the product
     *
     * @return bankInterestRate
     */
    @ApiModelProperty(value = "Bank Interest for the product")
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    public String getBankInterestRate() {
        return bankInterestRate;
    }

    public void setBankInterestRate(String bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand addNotesItem(String notesItem) {
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

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand otherBankInterestType(OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType otherBankInterestType) {
        this.otherBankInterestType = otherBankInterestType;
        return this;
    }

    /**
     * Get otherBankInterestType
     *
     * @return otherBankInterestType
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType getOtherBankInterestType() {
        return otherBankInterestType;
    }

    public void setOtherBankInterestType(OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType otherBankInterestType) {
        this.otherBankInterestType = otherBankInterestType;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand otherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
        return this;
    }

    /**
     * Get otherApplicationFrequency
     *
     * @return otherApplicationFrequency
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBOtherCodeType11 getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    public void setOtherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand otherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
        return this;
    }

    /**
     * Get otherCalculationFrequency
     *
     * @return otherCalculationFrequency
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBOtherCodeType12 getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    public void setOtherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeCreditInterestTierBand obReadProduct2DataOtherProductTypeCreditInterestTierBand = (OBReadProduct2DataOtherProductTypeCreditInterestTierBand) o;
        return Objects.equals(this.identification, obReadProduct2DataOtherProductTypeCreditInterestTierBand.identification) &&
                Objects.equals(this.tierValueMinimum, obReadProduct2DataOtherProductTypeCreditInterestTierBand.tierValueMinimum) &&
                Objects.equals(this.tierValueMaximum, obReadProduct2DataOtherProductTypeCreditInterestTierBand.tierValueMaximum) &&
                Objects.equals(this.calculationFrequency, obReadProduct2DataOtherProductTypeCreditInterestTierBand.calculationFrequency) &&
                Objects.equals(this.applicationFrequency, obReadProduct2DataOtherProductTypeCreditInterestTierBand.applicationFrequency) &&
                Objects.equals(this.depositInterestAppliedCoverage, obReadProduct2DataOtherProductTypeCreditInterestTierBand.depositInterestAppliedCoverage) &&
                Objects.equals(this.fixedVariableInterestRateType, obReadProduct2DataOtherProductTypeCreditInterestTierBand.fixedVariableInterestRateType) &&
                Objects.equals(this.AER, obReadProduct2DataOtherProductTypeCreditInterestTierBand.AER) &&
                Objects.equals(this.bankInterestRateType, obReadProduct2DataOtherProductTypeCreditInterestTierBand.bankInterestRateType) &&
                Objects.equals(this.bankInterestRate, obReadProduct2DataOtherProductTypeCreditInterestTierBand.bankInterestRate) &&
                Objects.equals(this.notes, obReadProduct2DataOtherProductTypeCreditInterestTierBand.notes) &&
                Objects.equals(this.otherBankInterestType, obReadProduct2DataOtherProductTypeCreditInterestTierBand.otherBankInterestType) &&
                Objects.equals(this.otherApplicationFrequency, obReadProduct2DataOtherProductTypeCreditInterestTierBand.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, obReadProduct2DataOtherProductTypeCreditInterestTierBand.otherCalculationFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, tierValueMinimum, tierValueMaximum, calculationFrequency, applicationFrequency, depositInterestAppliedCoverage, fixedVariableInterestRateType, AER, bankInterestRateType, bankInterestRate, notes, otherBankInterestType, otherApplicationFrequency, otherCalculationFrequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeCreditInterestTierBand {\n");

        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    tierValueMinimum: ").append(toIndentedString(tierValueMinimum)).append("\n");
        sb.append("    tierValueMaximum: ").append(toIndentedString(tierValueMaximum)).append("\n");
        sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
        sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
        sb.append("    depositInterestAppliedCoverage: ").append(toIndentedString(depositInterestAppliedCoverage)).append("\n");
        sb.append("    fixedVariableInterestRateType: ").append(toIndentedString(fixedVariableInterestRateType)).append("\n");
        sb.append("    AER: ").append(toIndentedString(AER)).append("\n");
        sb.append("    bankInterestRateType: ").append(toIndentedString(bankInterestRateType)).append("\n");
        sb.append("    bankInterestRate: ").append(toIndentedString(bankInterestRate)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherBankInterestType: ").append(toIndentedString(otherBankInterestType)).append("\n");
        sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
        sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
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

