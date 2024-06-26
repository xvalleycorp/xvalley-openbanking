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
 * Details about the interest that may be payable to the SME Loan holders
 */
@ApiModel(description = "Details about the interest that may be payable to the SME Loan holders")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadProduct2DataOtherProductTypeLoanInterest {
    @JsonProperty("Notes")
    @Valid
    private List<String> notes = null;

    @JsonProperty("LoanInterestTierBandSet")
    @Valid
    private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> loanInterestTierBandSet = new ArrayList<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet>();

    public OBReadProduct2DataOtherProductTypeLoanInterest notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterest addNotesItem(String notesItem) {
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

    public OBReadProduct2DataOtherProductTypeLoanInterest loanInterestTierBandSet(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> loanInterestTierBandSet) {
        this.loanInterestTierBandSet = loanInterestTierBandSet;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterest addLoanInterestTierBandSetItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet loanInterestTierBandSetItem) {
        this.loanInterestTierBandSet.add(loanInterestTierBandSetItem);
        return this;
    }

    /**
     * Get loanInterestTierBandSet
     *
     * @return loanInterestTierBandSet
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    @Size(min = 1)
    public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> getLoanInterestTierBandSet() {
        return loanInterestTierBandSet;
    }

    public void setLoanInterestTierBandSet(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> loanInterestTierBandSet) {
        this.loanInterestTierBandSet = loanInterestTierBandSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeLoanInterest obReadProduct2DataOtherProductTypeLoanInterest = (OBReadProduct2DataOtherProductTypeLoanInterest) o;
        return Objects.equals(this.notes, obReadProduct2DataOtherProductTypeLoanInterest.notes) &&
                Objects.equals(this.loanInterestTierBandSet, obReadProduct2DataOtherProductTypeLoanInterest.loanInterestTierBandSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes, loanInterestTierBandSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeLoanInterest {\n");

        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    loanInterestTierBandSet: ").append(toIndentedString(loanInterestTierBandSet)).append("\n");
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

