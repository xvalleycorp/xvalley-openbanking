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
package com.xvalley.openbanking.models.uk.datamodel.vrp;

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
 * OBDomesticVRPResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-21T08:45:28.716207+01:00[Europe/London]")
public class OBDomesticVRPResponseData {
    @JsonProperty("DomesticVRPId")
    private String domesticVRPId;

    @JsonProperty("ConsentId")
    private String consentId;

    @JsonProperty("CreationDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    /**
     * Specifies the status of the payment information group.
     */
    public enum StatusEnum {
        ACCEPTEDCREDITSETTLEMENTCOMPLETED("AcceptedCreditSettlementCompleted"),

        ACCEPTEDWITHOUTPOSTING("AcceptedWithoutPosting"),

        ACCEPTEDSETTLEMENTCOMPLETED("AcceptedSettlementCompleted"),

        ACCEPTEDSETTLEMENTINPROCESS("AcceptedSettlementInProcess"),

        PENDING("Pending"),

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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("Status")
    private StatusEnum status;

    @JsonProperty("StatusReason")
    private String statusReason;

    @JsonProperty("StatusReasonDescription")
    private String statusReasonDescription;

    @JsonProperty("StatusUpdateDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    @JsonProperty("ExpectedExecutionDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime expectedExecutionDateTime;

    @JsonProperty("ExpectedSettlementDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime expectedSettlementDateTime;

    @JsonProperty("Refund")
    private OBCashAccountDebtorWithName refund;

    @JsonProperty("Charges")
    @Valid
    private List<OBDomesticVRPResponseDataCharges> charges = null;

    @JsonProperty("Initiation")
    private OBDomesticVRPInitiation initiation;

    @JsonProperty("Instruction")
    private OBDomesticVRPInstruction instruction;

    @JsonProperty("DebtorAccount")
    private OBCashAccountDebtorWithName debtorAccount;

    public OBDomesticVRPResponseData domesticVRPId(String domesticVRPId) {
        this.domesticVRPId = domesticVRPId;
        return this;
    }

    /**
     * Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource.
     * @return domesticVRPId
     */
    @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource. ")
    @NotNull

    @Size(min = 1, max = 40)
    public String getDomesticVRPId() {
        return domesticVRPId;
    }

    public void setDomesticVRPId(String domesticVRPId) {
        this.domesticVRPId = domesticVRPId;
    }

    public OBDomesticVRPResponseData consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Identifier for the Domestic VRP Consent that this payment is made under.
     * @return consentId
     */
    @ApiModelProperty(required = true, value = "Identifier for the Domestic VRP Consent that this payment is made under. ")
    @NotNull

    @Size(min = 1, max = 128)
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBDomesticVRPResponseData creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.
     * @return creationDateTime
     */
    @ApiModelProperty(required = true, value = "Date and time at which the resource was created. ")
    @NotNull

    @Valid

    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBDomesticVRPResponseData status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the status of the payment information group.
     * @return status
     */
    @ApiModelProperty(required = true, value = "Specifies the status of the payment information group.")
    @NotNull


    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OBDomesticVRPResponseData statusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * Reason Code provided for the status of a VRP. To be documented in the Developer Portal.
     * @return statusReason
     */
    @ApiModelProperty(value = "Reason Code provided for the status of a VRP. To be documented in the Developer Portal. ")


    public String getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    public OBDomesticVRPResponseData statusReasonDescription(String statusReasonDescription) {
        this.statusReasonDescription = statusReasonDescription;
        return this;
    }

    /**
     * Description related to provided Status/StatusReason
     * @return statusReasonDescription
     */
    @ApiModelProperty(value = "Description related to provided Status/StatusReason ")

    @Size(min = 1, max = 256)
    public String getStatusReasonDescription() {
        return statusReasonDescription;
    }

    public void setStatusReasonDescription(String statusReasonDescription) {
        this.statusReasonDescription = statusReasonDescription;
    }

    public OBDomesticVRPResponseData statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the resource status was updated.
     * @return statusUpdateDateTime
     */
    @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated. ")
    @NotNull

    @Valid

    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBDomesticVRPResponseData expectedExecutionDateTime(DateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
        return this;
    }

    /**
     * Expected execution date and time for the payment resource.
     * @return expectedExecutionDateTime
     */
    @ApiModelProperty(value = "Expected execution date and time for the payment resource. ")

    @Valid

    public DateTime getExpectedExecutionDateTime() {
        return expectedExecutionDateTime;
    }

    public void setExpectedExecutionDateTime(DateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
    }

    public OBDomesticVRPResponseData expectedSettlementDateTime(DateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
        return this;
    }

    /**
     * Expected settlement date and time for the payment resource.
     * @return expectedSettlementDateTime
     */
    @ApiModelProperty(value = "Expected settlement date and time for the payment resource. ")

    @Valid

    public DateTime getExpectedSettlementDateTime() {
        return expectedSettlementDateTime;
    }

    public void setExpectedSettlementDateTime(DateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
    }

    public OBDomesticVRPResponseData refund(OBCashAccountDebtorWithName refund) {
        this.refund = refund;
        return this;
    }

    /**
     * Get refund
     * @return refund
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBCashAccountDebtorWithName getRefund() {
        return refund;
    }

    public void setRefund(OBCashAccountDebtorWithName refund) {
        this.refund = refund;
    }

    public OBDomesticVRPResponseData charges(List<OBDomesticVRPResponseDataCharges> charges) {
        this.charges = charges;
        return this;
    }

    public OBDomesticVRPResponseData addChargesItem(OBDomesticVRPResponseDataCharges chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<OBDomesticVRPResponseDataCharges>();
        }
        this.charges.add(chargesItem);
        return this;
    }

    /**
     * Get charges
     * @return charges
     */
    @ApiModelProperty(value = "")

    @Valid

    public List<OBDomesticVRPResponseDataCharges> getCharges() {
        return charges;
    }

    public void setCharges(List<OBDomesticVRPResponseDataCharges> charges) {
        this.charges = charges;
    }

    public OBDomesticVRPResponseData initiation(OBDomesticVRPInitiation initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     * @return initiation
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBDomesticVRPInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBDomesticVRPInitiation initiation) {
        this.initiation = initiation;
    }

    public OBDomesticVRPResponseData instruction(OBDomesticVRPInstruction instruction) {
        this.instruction = instruction;
        return this;
    }

    /**
     * Get instruction
     * @return instruction
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBDomesticVRPInstruction getInstruction() {
        return instruction;
    }

    public void setInstruction(OBDomesticVRPInstruction instruction) {
        this.instruction = instruction;
    }

    public OBDomesticVRPResponseData debtorAccount(OBCashAccountDebtorWithName debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     * @return debtorAccount
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBCashAccountDebtorWithName getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBCashAccountDebtorWithName debtorAccount) {
        this.debtorAccount = debtorAccount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBDomesticVRPResponseData obDomesticVRPResponseData = (OBDomesticVRPResponseData) o;
        return Objects.equals(this.domesticVRPId, obDomesticVRPResponseData.domesticVRPId) &&
                Objects.equals(this.consentId, obDomesticVRPResponseData.consentId) &&
                Objects.equals(this.creationDateTime, obDomesticVRPResponseData.creationDateTime) &&
                Objects.equals(this.status, obDomesticVRPResponseData.status) &&
                Objects.equals(this.statusReason, obDomesticVRPResponseData.statusReason) &&
                Objects.equals(this.statusReasonDescription, obDomesticVRPResponseData.statusReasonDescription) &&
                Objects.equals(this.statusUpdateDateTime, obDomesticVRPResponseData.statusUpdateDateTime) &&
                Objects.equals(this.expectedExecutionDateTime, obDomesticVRPResponseData.expectedExecutionDateTime) &&
                Objects.equals(this.expectedSettlementDateTime, obDomesticVRPResponseData.expectedSettlementDateTime) &&
                Objects.equals(this.refund, obDomesticVRPResponseData.refund) &&
                Objects.equals(this.charges, obDomesticVRPResponseData.charges) &&
                Objects.equals(this.initiation, obDomesticVRPResponseData.initiation) &&
                Objects.equals(this.instruction, obDomesticVRPResponseData.instruction) &&
                Objects.equals(this.debtorAccount, obDomesticVRPResponseData.debtorAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domesticVRPId, consentId, creationDateTime, status, statusReason, statusReasonDescription, statusUpdateDateTime, expectedExecutionDateTime, expectedSettlementDateTime, refund, charges, initiation, instruction, debtorAccount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPResponseData {\n");

        sb.append("    domesticVRPId: ").append(toIndentedString(domesticVRPId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
        sb.append("    statusReasonDescription: ").append(toIndentedString(statusReasonDescription)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
        sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
        sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
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

