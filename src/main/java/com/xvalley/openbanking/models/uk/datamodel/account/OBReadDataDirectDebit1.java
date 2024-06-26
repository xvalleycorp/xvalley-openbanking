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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Data
 */
@ApiModel(description = "Data")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class OBReadDataDirectDebit1 {
  @JsonProperty("DirectDebit")
  private List<OBDirectDebit1> directDebit = null;

  public OBReadDataDirectDebit1 directDebit(List<OBDirectDebit1> directDebit) {
    this.directDebit = directDebit;
    return this;
  }

  public OBReadDataDirectDebit1 addDirectDebitItem(OBDirectDebit1 directDebitItem) {
    if (this.directDebit == null) {
      this.directDebit = new ArrayList<OBDirectDebit1>();
    }
    this.directDebit.add(directDebitItem);
    return this;
  }

   /**
   * DirectDebit
   * @return directDebit
  **/
  @ApiModelProperty(value = "DirectDebit")

  @Valid

  public List<OBDirectDebit1> getDirectDebit() {
    return directDebit;
  }

  public void setDirectDebit(List<OBDirectDebit1> directDebit) {
    this.directDebit = directDebit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDataDirectDebit1 data6 = (OBReadDataDirectDebit1) o;
    return Objects.equals(this.directDebit, data6.directDebit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data6 {\n");

    sb.append("    directDebit: ").append(toIndentedString(directDebit)).append("\n");
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

