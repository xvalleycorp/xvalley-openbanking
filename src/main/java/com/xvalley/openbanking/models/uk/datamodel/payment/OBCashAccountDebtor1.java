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
package com.xvalley.openbanking.models.uk.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.
 */
@ApiModel(description = "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.")


public class OBCashAccountDebtor1 {

  @JsonProperty("SchemeName")
  private OBExternalAccountIdentification2Code schemeName = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("SecondaryIdentification")
  private String secondaryIdentification = null;

  public OBCashAccountDebtor1 schemeName(OBExternalAccountIdentification2Code schemeName) {
    this.schemeName = schemeName;
    return this;
  }

   /**
   * Name of the identification scheme, in a coded form as published in an external list.
   * @return schemeName
  **/
  @ApiModelProperty(required = true, value = "Name of the identification scheme, in a coded form as published in an external list.")
  @NotNull


  public OBExternalAccountIdentification2Code getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(OBExternalAccountIdentification2Code schemeName) {
    this.schemeName = schemeName;
  }

  public OBCashAccountDebtor1 identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Identification assigned by an institution to identify an account. This identification is known by the account owner.
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Identification assigned by an institution to identify an account. This identification is known by the account owner.")
  @NotNull

 @Size(min=1,max=34)
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBCashAccountDebtor1 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account. Usage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account. Usage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number.")

 @Size(min=1,max=70)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBCashAccountDebtor1 secondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }

   /**
   * Identification assigned by an institution to identify an account. This identification is known by the account owner.
   * @return secondaryIdentification
  **/
  @ApiModelProperty(value = "Identification assigned by an institution to identify an account. This identification is known by the account owner.")

 @Size(min=1,max=34)
  public String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCashAccountDebtor1 debtorAccount = (OBCashAccountDebtor1) o;
    return Objects.equals(this.schemeName, debtorAccount.schemeName) &&
        Objects.equals(this.identification, debtorAccount.identification) &&
        Objects.equals(this.name, debtorAccount.name) &&
        Objects.equals(this.secondaryIdentification, debtorAccount.secondaryIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, secondaryIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCashAccountDebtor1 {\n");
    
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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

