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
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBBeneficiary5
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBBeneficiary5 {
  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("BeneficiaryId")
  private String beneficiaryId;

  @JsonProperty("BeneficiaryType")
  private OBBeneficiaryType1Code beneficiaryType;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("SupplementaryData")
  @Valid
  private OBSupplementaryData1 supplementaryData = null;

  @JsonProperty("CreditorAgent")
  private OBBranchAndFinancialInstitutionIdentification60 creditorAgent;

  @JsonProperty("CreditorAccount")
  private OBCashAccount50 creditorAccount;

  public OBBeneficiary5 accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   *
   * @return accountId
   */
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  @Size(min = 1, max = 40)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBBeneficiary5 beneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.
   *
   * @return beneficiaryId
   */
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.")
  @Size(min = 1, max = 40)
  public String getBeneficiaryId() {
    return beneficiaryId;
  }

  public void setBeneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }

  public OBBeneficiary5 beneficiaryType(OBBeneficiaryType1Code beneficiaryType) {
    this.beneficiaryType = beneficiaryType;
    return this;
  }

  /**
   * Get beneficiaryType
   *
   * @return beneficiaryType
   */
  @ApiModelProperty(value = "")
  @Valid
  public OBBeneficiaryType1Code getBeneficiaryType() {
    return beneficiaryType;
  }

  public void setBeneficiaryType(OBBeneficiaryType1Code beneficiaryType) {
    this.beneficiaryType = beneficiaryType;
  }

  public OBBeneficiary5 reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   *
   * @return reference
   */
  @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")
  @Size(min = 1, max = 35)
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBBeneficiary5 supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  /**
   * Additional information that can not be captured in the structured fields and/or any other specific block.
   *
   * @return supplementaryData
   */
  @ApiModelProperty(value = "Additional information that can not be captured in the structured fields and/or any other specific block.")
  public OBSupplementaryData1 getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  public OBBeneficiary5 creditorAgent(OBBranchAndFinancialInstitutionIdentification60 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   *
   * @return creditorAgent
   */
  @ApiModelProperty(value = "")
  @Valid
  public OBBranchAndFinancialInstitutionIdentification60 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification60 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBBeneficiary5 creditorAccount(OBCashAccount50 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   *
   * @return creditorAccount
   */
  @ApiModelProperty(value = "")
  @Valid
  public OBCashAccount50 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount50 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBeneficiary5 obBeneficiary5 = (OBBeneficiary5) o;
    return Objects.equals(this.accountId, obBeneficiary5.accountId) &&
            Objects.equals(this.beneficiaryId, obBeneficiary5.beneficiaryId) &&
            Objects.equals(this.beneficiaryType, obBeneficiary5.beneficiaryType) &&
            Objects.equals(this.reference, obBeneficiary5.reference) &&
            Objects.equals(this.supplementaryData, obBeneficiary5.supplementaryData) &&
            Objects.equals(this.creditorAgent, obBeneficiary5.creditorAgent) &&
            Objects.equals(this.creditorAccount, obBeneficiary5.creditorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, beneficiaryId, beneficiaryType, reference, supplementaryData, creditorAgent, creditorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBeneficiary5 {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    beneficiaryType: ").append(toIndentedString(beneficiaryType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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

