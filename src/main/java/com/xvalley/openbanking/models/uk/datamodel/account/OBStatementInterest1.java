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
import org.springframework.validation.annotation.Validated;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBActiveOrHistoricCurrencyAndAmount;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Set of elements used to provide details of a generic interest amount related to the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a generic interest amount related to the statement resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBStatementInterest1   {

  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode creditDebitIndicator = null;

  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("Amount")
  private OBActiveOrHistoricCurrencyAndAmount amount = null;

  public OBStatementInterest1 creditDebitIndicator(OBCreditDebitCode creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Indicates whether the amount is a credit or a debit.  Usage: A zero amount is considered to be a credit amount.
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the amount is a credit or a debit.  Usage: A zero amount is considered to be a credit amount.")
  @NotNull


  public OBCreditDebitCode getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBStatementInterest1 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Interest amount type, in a coded form.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Interest amount type, in a coded form.")
  @NotNull

@Size(min=1,max=40) 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OBStatementInterest1 amount(OBActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBActiveOrHistoricCurrencyAndAmount getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatementInterest1 obStatementInterest1 = (OBStatementInterest1) o;
    return Objects.equals(this.creditDebitIndicator, obStatementInterest1.creditDebitIndicator) &&
        Objects.equals(this.type, obStatementInterest1.type) &&
        Objects.equals(this.amount, obStatementInterest1.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditDebitIndicator, type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatementInterest1 {\n");
    
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

