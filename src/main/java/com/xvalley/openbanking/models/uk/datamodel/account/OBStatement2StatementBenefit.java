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
import java.util.Objects;

/**
 * Set of elements used to provide details of a benefit or reward amount for the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a benefit or reward amount for the statement resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBStatement2StatementBenefit {
    @JsonProperty("Type")
    private String type;

    @JsonProperty("Amount")
    private OBActiveOrHistoricCurrencyAndAmount5 amount;

    public OBStatement2StatementBenefit type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Benefit type, in a coded form.
     *
     * @return type
     */
    @ApiModelProperty(required = true, value = "Benefit type, in a coded form.")
    @NotNull
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OBStatement2StatementBenefit amount(OBActiveOrHistoricCurrencyAndAmount5 amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public OBActiveOrHistoricCurrencyAndAmount5 getAmount() {
        return amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount5 amount) {
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
        OBStatement2StatementBenefit obStatement2StatementBenefit = (OBStatement2StatementBenefit) o;
        return Objects.equals(this.type, obStatement2StatementBenefit.type) &&
                Objects.equals(this.amount, obStatement2StatementBenefit.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatement2StatementBenefit {\n");

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

