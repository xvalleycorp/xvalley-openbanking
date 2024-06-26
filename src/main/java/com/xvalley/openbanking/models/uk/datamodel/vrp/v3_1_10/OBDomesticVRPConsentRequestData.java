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
package com.xvalley.openbanking.models.uk.datamodel.vrp.v3_1_10;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBDomesticVRPConsentRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-30T12:56:02.347748Z[Europe/London]")
public class OBDomesticVRPConsentRequestData   {
  /**
   * Indicates whether information about RefundAccount should be included in the payment response. 
   */
  public enum ReadRefundAccountEnum {

    YES("Yes"),
    
    NO("No");

    private String value;

    ReadRefundAccountEnum(String value) {
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
    public static ReadRefundAccountEnum fromValue(String value) {
      for (ReadRefundAccountEnum b : ReadRefundAccountEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("ReadRefundAccount")
  private ReadRefundAccountEnum readRefundAccount;

  @JsonProperty("ControlParameters")
  private OBDomesticVRPControlParameters controlParameters;

  @JsonProperty("Initiation")
  private OBDomesticVRPInitiation initiation;

  public OBDomesticVRPConsentRequestData readRefundAccount(ReadRefundAccountEnum readRefundAccount) {
    this.readRefundAccount = readRefundAccount;
    return this;
  }

  /**
   * Indicates whether information about RefundAccount should be included in the payment response. 
   * @return readRefundAccount
  */
  @ApiModelProperty(value = "Indicates whether information about RefundAccount should be included in the payment response. ")


  public ReadRefundAccountEnum getReadRefundAccount() {
    return readRefundAccount;
  }

  public void setReadRefundAccount(ReadRefundAccountEnum readRefundAccount) {
    this.readRefundAccount = readRefundAccount;
  }

  public OBDomesticVRPConsentRequestData controlParameters(OBDomesticVRPControlParameters controlParameters) {
    this.controlParameters = controlParameters;
    return this;
  }

  /**
   * Get controlParameters
   * @return controlParameters
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBDomesticVRPControlParameters getControlParameters() {
    return controlParameters;
  }

  public void setControlParameters(OBDomesticVRPControlParameters controlParameters) {
    this.controlParameters = controlParameters;
  }

  public OBDomesticVRPConsentRequestData initiation(OBDomesticVRPInitiation initiation) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBDomesticVRPConsentRequestData obDomesticVRPConsentRequestData = (OBDomesticVRPConsentRequestData) o;
    return Objects.equals(this.readRefundAccount, obDomesticVRPConsentRequestData.readRefundAccount) &&
        Objects.equals(this.controlParameters, obDomesticVRPConsentRequestData.controlParameters) &&
        Objects.equals(this.initiation, obDomesticVRPConsentRequestData.initiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readRefundAccount, controlParameters, initiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBDomesticVRPConsentRequestData {\n");
    
    sb.append("    readRefundAccount: ").append(toIndentedString(readRefundAccount)).append("\n");
    sb.append("    controlParameters: ").append(toIndentedString(controlParameters)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
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

