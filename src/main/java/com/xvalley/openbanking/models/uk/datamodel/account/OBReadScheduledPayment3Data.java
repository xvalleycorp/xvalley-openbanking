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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadScheduledPayment3Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadScheduledPayment3Data {
    @JsonProperty("ScheduledPayment")
    @Valid
    private List<OBScheduledPayment3> scheduledPayment = null;

    public OBReadScheduledPayment3Data scheduledPayment(List<OBScheduledPayment3> scheduledPayment) {
        this.scheduledPayment = scheduledPayment;
        return this;
    }

    public OBReadScheduledPayment3Data addScheduledPaymentItem(OBScheduledPayment3 scheduledPaymentItem) {
        if (this.scheduledPayment == null) {
            this.scheduledPayment = new ArrayList<OBScheduledPayment3>();
        }
        this.scheduledPayment.add(scheduledPaymentItem);
        return this;
    }

    /**
     * Get scheduledPayment
     *
     * @return scheduledPayment
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBScheduledPayment3> getScheduledPayment() {
        return scheduledPayment;
    }

    public void setScheduledPayment(List<OBScheduledPayment3> scheduledPayment) {
        this.scheduledPayment = scheduledPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadScheduledPayment3Data obReadScheduledPayment3Data = (OBReadScheduledPayment3Data) o;
        return Objects.equals(this.scheduledPayment, obReadScheduledPayment3Data.scheduledPayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduledPayment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadScheduledPayment3Data {\n");

        sb.append("    scheduledPayment: ").append(toIndentedString(scheduledPayment)).append("\n");
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

