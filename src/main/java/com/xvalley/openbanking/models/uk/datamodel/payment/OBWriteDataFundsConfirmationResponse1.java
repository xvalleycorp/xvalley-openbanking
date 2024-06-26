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
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * OBWriteDataFundsConfirmationResponse1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-28T11:15:38.268Z")

public class OBWriteDataFundsConfirmationResponse1   {
  @JsonProperty("FundsAvailableResult")
  private OBFundsAvailableResult1 fundsAvailableResult = null;

  @JsonProperty("SupplementaryData")
  private OBSupplementaryData1 supplementaryData = null;

  public OBWriteDataFundsConfirmationResponse1 fundsAvailableResult(OBFundsAvailableResult1 fundsAvailableResult) {
    this.fundsAvailableResult = fundsAvailableResult;
    return this;
  }

  /**
   * Get fundsAvailableResult
   * @return fundsAvailableResult
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBFundsAvailableResult1 getFundsAvailableResult() {
    return fundsAvailableResult;
  }

  public void setFundsAvailableResult(OBFundsAvailableResult1 fundsAvailableResult) {
    this.fundsAvailableResult = fundsAvailableResult;
  }

  public OBWriteDataFundsConfirmationResponse1 supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBSupplementaryData1 getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteDataFundsConfirmationResponse1 obWriteDataFundsConfirmationResponse1 = (OBWriteDataFundsConfirmationResponse1) o;
    return Objects.equals(this.fundsAvailableResult, obWriteDataFundsConfirmationResponse1.fundsAvailableResult) &&
        Objects.equals(this.supplementaryData, obWriteDataFundsConfirmationResponse1.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsAvailableResult, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDataFundsConfirmationResponse1 {\n");

    sb.append("    fundsAvailableResult: ").append(toIndentedString(fundsAvailableResult)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

