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
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * AccountRequestPOSTResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class OBReadResponse1 {
  @JsonProperty("Data")
  private OBReadDataResponse1 data = null;

  @JsonProperty("Risk")
  private OBRisk2 risk = null;

  @JsonProperty("Links")
  private Links links = null;

  @JsonProperty("Meta")
  private Meta meta = null;

  public OBReadResponse1 data(OBReadDataResponse1 data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBReadDataResponse1 getData() {
    return data;
  }

  public void setData(OBReadDataResponse1 data) {
    this.data = data;
  }

  public OBReadResponse1 risk(OBRisk2 risk) {
    this.risk = risk;
    return this;
  }

   /**
   * The Risk payload is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.
   * @return risk
  **/
  @ApiModelProperty(required = true, value = "The Risk payload is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.")
  @NotNull


  public Object getRisk() {
    return risk;
  }

  public void setRisk(OBRisk2 risk) {
    this.risk = risk;
  }

  public OBReadResponse1 links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBReadResponse1 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadResponse1 accountRequestPOSTResponse = (OBReadResponse1) o;
    return Objects.equals(this.data, accountRequestPOSTResponse.data) &&
        Objects.equals(this.risk, accountRequestPOSTResponse.risk) &&
        Objects.equals(this.links, accountRequestPOSTResponse.links) &&
        Objects.equals(this.meta, accountRequestPOSTResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRequestPOSTResponse {\n");

    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

