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
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The group of tiers or bands for which credit interest can be applied.
 */
@ApiModel(description = "The group of tiers or bands for which credit interest can be applied.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet {
    /**
     * The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance
     */
    public enum TierBandMethodEnum {
        INBA("INBA"),

        INTI("INTI"),

        INWH("INWH");

        private String value;

        TierBandMethodEnum(String value) {
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
        public static TierBandMethodEnum fromValue(String value) {
            for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("TierBandMethod")
    private TierBandMethodEnum tierBandMethod;

    @JsonProperty("CalculationMethod")
    private OBInterestCalculationMethod1Code calculationMethod;

    /**
     * Describes whether accrued interest is payable only to the BCA or to another bank account
     */
    public enum DestinationEnum {
        INOT("INOT"),

        INPA("INPA"),

        INSC("INSC");

        private String value;

        DestinationEnum(String value) {
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
        public static DestinationEnum fromValue(String value) {
            for (DestinationEnum b : DestinationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("Destination")
    private DestinationEnum destination;

    @JsonProperty("Notes")
    @Valid
    private List<String> notes = null;

    @JsonProperty("OtherCalculationMethod")
    private OBOtherCodeType10 otherCalculationMethod;

    @JsonProperty("OtherDestination")
    private OBOtherCodeType10 otherDestination;

    @JsonProperty("TierBand")
    @Valid
    private List<OBReadProduct2DataOtherProductTypeCreditInterestTierBand> tierBand = new ArrayList<OBReadProduct2DataOtherProductTypeCreditInterestTierBand>();

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
        return this;
    }

    /**
     * The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance
     *
     * @return tierBandMethod
     */
    @ApiModelProperty(required = true, value = "The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance")
    @NotNull
    public TierBandMethodEnum getTierBandMethod() {
        return tierBandMethod;
    }

    public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet calculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
        this.calculationMethod = calculationMethod;
        return this;
    }

    /**
     * Get calculationMethod
     *
     * @return calculationMethod
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBInterestCalculationMethod1Code getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet destination(DestinationEnum destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Describes whether accrued interest is payable only to the BCA or to another bank account
     *
     * @return destination
     */
    @ApiModelProperty(required = true, value = "Describes whether accrued interest is payable only to the BCA or to another bank account")
    @NotNull
    public DestinationEnum getDestination() {
        return destination;
    }

    public void setDestination(DestinationEnum destination) {
        this.destination = destination;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet addNotesItem(String notesItem) {
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

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet otherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
        this.otherCalculationMethod = otherCalculationMethod;
        return this;
    }

    /**
     * Get otherCalculationMethod
     *
     * @return otherCalculationMethod
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBOtherCodeType10 getOtherCalculationMethod() {
        return otherCalculationMethod;
    }

    public void setOtherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
        this.otherCalculationMethod = otherCalculationMethod;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet otherDestination(OBOtherCodeType10 otherDestination) {
        this.otherDestination = otherDestination;
        return this;
    }

    /**
     * Get otherDestination
     *
     * @return otherDestination
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBOtherCodeType10 getOtherDestination() {
        return otherDestination;
    }

    public void setOtherDestination(OBOtherCodeType10 otherDestination) {
        this.otherDestination = otherDestination;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet tierBand(List<OBReadProduct2DataOtherProductTypeCreditInterestTierBand> tierBand) {
        this.tierBand = tierBand;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet addTierBandItem(OBReadProduct2DataOtherProductTypeCreditInterestTierBand tierBandItem) {
        this.tierBand.add(tierBandItem);
        return this;
    }

    /**
     * Get tierBand
     *
     * @return tierBand
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    @Size(min = 1)
    public List<OBReadProduct2DataOtherProductTypeCreditInterestTierBand> getTierBand() {
        return tierBand;
    }

    public void setTierBand(List<OBReadProduct2DataOtherProductTypeCreditInterestTierBand> tierBand) {
        this.tierBand = tierBand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet obReadProduct2DataOtherProductTypeCreditInterestTierBandSet = (OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet) o;
        return Objects.equals(this.tierBandMethod, obReadProduct2DataOtherProductTypeCreditInterestTierBandSet.tierBandMethod) &&
                Objects.equals(this.calculationMethod, obReadProduct2DataOtherProductTypeCreditInterestTierBandSet.calculationMethod) &&
                Objects.equals(this.destination, obReadProduct2DataOtherProductTypeCreditInterestTierBandSet.destination) &&
                Objects.equals(this.notes, obReadProduct2DataOtherProductTypeCreditInterestTierBandSet.notes) &&
                Objects.equals(this.otherCalculationMethod, obReadProduct2DataOtherProductTypeCreditInterestTierBandSet.otherCalculationMethod) &&
                Objects.equals(this.otherDestination, obReadProduct2DataOtherProductTypeCreditInterestTierBandSet.otherDestination) &&
                Objects.equals(this.tierBand, obReadProduct2DataOtherProductTypeCreditInterestTierBandSet.tierBand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tierBandMethod, calculationMethod, destination, notes, otherCalculationMethod, otherDestination, tierBand);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet {\n");

        sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
        sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherCalculationMethod: ").append(toIndentedString(otherCalculationMethod)).append("\n");
        sb.append("    otherDestination: ").append(toIndentedString(otherDestination)).append("\n");
        sb.append("    tierBand: ").append(toIndentedString(tierBand)).append("\n");
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

