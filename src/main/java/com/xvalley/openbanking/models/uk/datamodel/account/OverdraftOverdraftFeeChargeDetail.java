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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details about the fees/charges
 */
@ApiModel(description = "Details about the fees/charges")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OverdraftOverdraftFeeChargeDetail {
    /**
     * Overdraft fee type
     */
    public enum FeeTypeEnum {
        ARRANGEDOVERDRAFT("ArrangedOverdraft"),

        ANNUALREVIEW("AnnualReview"),

        EMERGENCYBORROWING("EmergencyBorrowing"),

        BORROWINGITEM("BorrowingItem"),

        OVERDRAFTRENEWAL("OverdraftRenewal"),

        OVERDRAFTSETUP("OverdraftSetup"),

        SURCHARGE("Surcharge"),

        TEMPOVERDRAFT("TempOverdraft"),

        UNAUTHORISEDBORROWING("UnauthorisedBorrowing"),

        UNAUTHORISEDPAIDTRANS("UnauthorisedPaidTrans"),

        OTHER("Other"),

        UNAUTHORISEDUNPAIDTRANS("UnauthorisedUnpaidTrans");

        private String value;

        FeeTypeEnum(String value) {
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
        public static FeeTypeEnum fromValue(String value) {
            for (FeeTypeEnum b : FeeTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("FeeType")
    private FeeTypeEnum feeType;

    @JsonProperty("NegotiableIndicator")
    private Boolean negotiableIndicator;

    @JsonProperty("OverdraftControlIndicator")
    private Boolean overdraftControlIndicator;

    @JsonProperty("IncrementalBorrowingAmount")
    private String incrementalBorrowingAmount;

    @JsonProperty("FeeAmount")
    private String feeAmount;

    @JsonProperty("FeeRate")
    private String feeRate;

    /**
     * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
     */
    public enum FeeRateTypeEnum {
        GROSS("Gross"),

        OTHER("Other");

        private String value;

        FeeRateTypeEnum(String value) {
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
        public static FeeRateTypeEnum fromValue(String value) {
            for (FeeRateTypeEnum b : FeeRateTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("FeeRateType")
    private FeeRateTypeEnum feeRateType;

    /**
     * Frequency at which the overdraft charge is applied to the account
     */
    public enum ApplicationFrequencyEnum {
        ONCLOSING("OnClosing"),

        ONOPENING("OnOpening"),

        CHARGINGPERIOD("ChargingPeriod"),

        DAILY("Daily"),

        PERITEM("PerItem"),

        MONTHLY("Monthly"),

        ONANNIVERSARY("OnAnniversary"),

        OTHER("Other"),

        PERHUNDREDPOUNDS("PerHundredPounds"),

        PERHOUR("PerHour"),

        PEROCCURRENCE("PerOccurrence"),

        PERSHEET("PerSheet"),

        PERTRANSACTION("PerTransaction"),
    
    PERTRANSACTIONAMOUNT("PerTransactionAmount"),
    
    PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),
    
    QUARTERLY("Quarterly"),
    
    SIXMONTHLY("SixMonthly"),
    
    STATEMENTMONTHLY("StatementMonthly"),

        WEEKLY("Weekly"),

        YEARLY("Yearly");

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
     * How often is the overdraft fee/charge calculated for the account.
     */
    public enum CalculationFrequencyEnum {
        ONCLOSING("OnClosing"),

        ONOPENING("OnOpening"),

        CHARGINGPERIOD("ChargingPeriod"),

        DAILY("Daily"),

        PERITEM("PerItem"),

        MONTHLY("Monthly"),

        ONANNIVERSARY("OnAnniversary"),

        OTHER("Other"),
    
    PERHUNDREDPOUNDS("PerHundredPounds"),
    
    PERHOUR("PerHour"),
    
    PEROCCURRENCE("PerOccurrence"),
    
    PERSHEET("PerSheet"),
    
    PERTRANSACTION("PerTransaction"),
    
    PERTRANSACTIONAMOUNT("PerTransactionAmount"),
    
    PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),
    
    QUARTERLY("Quarterly"),
    
    SIXMONTHLY("SixMonthly"),
    
    STATEMENTMONTHLY("StatementMonthly"),

        WEEKLY("Weekly"),

        YEARLY("Yearly");

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

    @JsonProperty("Notes")
    @Valid
    private List<String> notes = null;

    @JsonProperty("OverdraftFeeChargeCap")
    @Valid
    private List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap = null;

    @JsonProperty("OtherFeeType")
    private OtherFeeType otherFeeType;

    @JsonProperty("OtherFeeRateType")
    private OtherFeeRateType otherFeeRateType;

    @JsonProperty("OtherApplicationFrequency")
    private OtherApplicationFrequency otherApplicationFrequency;

    @JsonProperty("OtherCalculationFrequency")
    private OtherCalculationFrequency otherCalculationFrequency;

    public OverdraftOverdraftFeeChargeDetail feeType(FeeTypeEnum feeType) {
        this.feeType = feeType;
        return this;
    }

    /**
     * Overdraft fee type
     *
     * @return feeType
     */
    @ApiModelProperty(required = true, value = "Overdraft fee type")
    @NotNull
    public FeeTypeEnum getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeTypeEnum feeType) {
        this.feeType = feeType;
    }

    public OverdraftOverdraftFeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
        return this;
    }

    /**
     * Indicates whether fee and charges are negotiable
     *
     * @return negotiableIndicator
     */
    @ApiModelProperty(value = "Indicates whether fee and charges are negotiable")
    public Boolean getNegotiableIndicator() {
        return negotiableIndicator;
    }

    public void setNegotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
    }

    public OverdraftOverdraftFeeChargeDetail overdraftControlIndicator(Boolean overdraftControlIndicator) {
        this.overdraftControlIndicator = overdraftControlIndicator;
        return this;
    }

    /**
     * Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.
     *
     * @return overdraftControlIndicator
     */
    @ApiModelProperty(value = "Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.")
    public Boolean getOverdraftControlIndicator() {
        return overdraftControlIndicator;
    }

    public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
        this.overdraftControlIndicator = overdraftControlIndicator;
    }

    public OverdraftOverdraftFeeChargeDetail incrementalBorrowingAmount(String incrementalBorrowingAmount) {
        this.incrementalBorrowingAmount = incrementalBorrowingAmount;
        return this;
    }

    /**
     * Every additional tranche of an overdraft balance to which an overdraft fee is applied
     *
     * @return incrementalBorrowingAmount
     */
    @ApiModelProperty(value = "Every additional tranche of an overdraft balance to which an overdraft fee is applied")
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    public String getIncrementalBorrowingAmount() {
        return incrementalBorrowingAmount;
    }

    public void setIncrementalBorrowingAmount(String incrementalBorrowingAmount) {
        this.incrementalBorrowingAmount = incrementalBorrowingAmount;
    }

    public OverdraftOverdraftFeeChargeDetail feeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    /**
     * Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
     *
     * @return feeAmount
     */
    @ApiModelProperty(value = "Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)")
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public OverdraftOverdraftFeeChargeDetail feeRate(String feeRate) {
        this.feeRate = feeRate;
        return this;
    }

    /**
     * Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
     *
     * @return feeRate
     */
    @ApiModelProperty(value = "Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    public String getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(String feeRate) {
        this.feeRate = feeRate;
    }

    public OverdraftOverdraftFeeChargeDetail feeRateType(FeeRateTypeEnum feeRateType) {
        this.feeRateType = feeRateType;
        return this;
    }

    /**
     * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
     *
     * @return feeRateType
     */
    @ApiModelProperty(value = "Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
    public FeeRateTypeEnum getFeeRateType() {
        return feeRateType;
    }

    public void setFeeRateType(FeeRateTypeEnum feeRateType) {
        this.feeRateType = feeRateType;
    }

    public OverdraftOverdraftFeeChargeDetail applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
        return this;
    }

    /**
     * Frequency at which the overdraft charge is applied to the account
     *
     * @return applicationFrequency
     */
    @ApiModelProperty(required = true, value = "Frequency at which the overdraft charge is applied to the account")
    @NotNull
    public ApplicationFrequencyEnum getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public OverdraftOverdraftFeeChargeDetail calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
        return this;
    }

    /**
     * How often is the overdraft fee/charge calculated for the account.
     *
     * @return calculationFrequency
     */
    @ApiModelProperty(value = "How often is the overdraft fee/charge calculated for the account.")
    public CalculationFrequencyEnum getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public OverdraftOverdraftFeeChargeDetail notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OverdraftOverdraftFeeChargeDetail addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Free text for capturing any other info related to Overdraft Fees Charge Details
     *
     * @return notes
     */
    @ApiModelProperty(value = "Free text for capturing any other info related to Overdraft Fees Charge Details")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public OverdraftOverdraftFeeChargeDetail overdraftFeeChargeCap(List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
        this.overdraftFeeChargeCap = overdraftFeeChargeCap;
        return this;
    }

    public OverdraftOverdraftFeeChargeDetail addOverdraftFeeChargeCapItem(OverdraftOverdraftFeeChargeCap overdraftFeeChargeCapItem) {
        if (this.overdraftFeeChargeCap == null) {
            this.overdraftFeeChargeCap = new ArrayList<OverdraftOverdraftFeeChargeCap>();
        }
        this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
        return this;
    }

    /**
     * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
     *
     * @return overdraftFeeChargeCap
     */
    @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")
    @Valid
    public List<OverdraftOverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
        return overdraftFeeChargeCap;
    }

    public void setOverdraftFeeChargeCap(List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
        this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    }

    public OverdraftOverdraftFeeChargeDetail otherFeeType(OtherFeeType otherFeeType) {
        this.otherFeeType = otherFeeType;
        return this;
    }

    /**
     * Get otherFeeType
     *
     * @return otherFeeType
     */
    @ApiModelProperty(value = "")
    @Valid
    public OtherFeeType getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(OtherFeeType otherFeeType) {
        this.otherFeeType = otherFeeType;
    }

    public OverdraftOverdraftFeeChargeDetail otherFeeRateType(OtherFeeRateType otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
        return this;
    }

    /**
     * Get otherFeeRateType
     *
     * @return otherFeeRateType
     */
    @ApiModelProperty(value = "")
    @Valid
    public OtherFeeRateType getOtherFeeRateType() {
        return otherFeeRateType;
    }

    public void setOtherFeeRateType(OtherFeeRateType otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
    }

    public OverdraftOverdraftFeeChargeDetail otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
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
    public OtherApplicationFrequency getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    public OverdraftOverdraftFeeChargeDetail otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
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
    public OtherCalculationFrequency getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
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
        OverdraftOverdraftFeeChargeDetail overdraftOverdraftFeeChargeDetail = (OverdraftOverdraftFeeChargeDetail) o;
        return Objects.equals(this.feeType, overdraftOverdraftFeeChargeDetail.feeType) &&
                Objects.equals(this.negotiableIndicator, overdraftOverdraftFeeChargeDetail.negotiableIndicator) &&
                Objects.equals(this.overdraftControlIndicator, overdraftOverdraftFeeChargeDetail.overdraftControlIndicator) &&
                Objects.equals(this.incrementalBorrowingAmount, overdraftOverdraftFeeChargeDetail.incrementalBorrowingAmount) &&
                Objects.equals(this.feeAmount, overdraftOverdraftFeeChargeDetail.feeAmount) &&
                Objects.equals(this.feeRate, overdraftOverdraftFeeChargeDetail.feeRate) &&
                Objects.equals(this.feeRateType, overdraftOverdraftFeeChargeDetail.feeRateType) &&
                Objects.equals(this.applicationFrequency, overdraftOverdraftFeeChargeDetail.applicationFrequency) &&
                Objects.equals(this.calculationFrequency, overdraftOverdraftFeeChargeDetail.calculationFrequency) &&
                Objects.equals(this.notes, overdraftOverdraftFeeChargeDetail.notes) &&
                Objects.equals(this.overdraftFeeChargeCap, overdraftOverdraftFeeChargeDetail.overdraftFeeChargeCap) &&
                Objects.equals(this.otherFeeType, overdraftOverdraftFeeChargeDetail.otherFeeType) &&
                Objects.equals(this.otherFeeRateType, overdraftOverdraftFeeChargeDetail.otherFeeRateType) &&
                Objects.equals(this.otherApplicationFrequency, overdraftOverdraftFeeChargeDetail.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, overdraftOverdraftFeeChargeDetail.otherCalculationFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, negotiableIndicator, overdraftControlIndicator, incrementalBorrowingAmount, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, overdraftFeeChargeCap, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverdraftOverdraftFeeChargeDetail {\n");

        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
        sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
        sb.append("    incrementalBorrowingAmount: ").append(toIndentedString(incrementalBorrowingAmount)).append("\n");
        sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
        sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
        sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
        sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
        sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
        sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
        sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
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

