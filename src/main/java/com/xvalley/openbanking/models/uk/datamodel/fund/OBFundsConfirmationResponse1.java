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
package com.xvalley.openbanking.models.uk.datamodel.fund;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import com.xvalley.openbanking.models.uk.datamodel.account.Links;
import com.xvalley.openbanking.models.uk.datamodel.account.Meta;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBFundsConfirmationResponse1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-18T09:57:44.731259Z[Europe/London]")
public class OBFundsConfirmationResponse1 {
    @JsonProperty("Data")
    private OBFundsConfirmationResponse1Data data;

    @JsonProperty("Links")
    private Links links; // Use class from account package to prevent duplication and keep things DRY

    @JsonProperty("Meta")
    private Meta meta; // Use class from account package to prevent duplication and keep things DRY

    public OBFundsConfirmationResponse1 data(OBFundsConfirmationResponse1Data data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBFundsConfirmationResponse1Data getData() {
        return data;
    }

    public void setData(OBFundsConfirmationResponse1Data data) {
        this.data = data;
    }

    public OBFundsConfirmationResponse1 links(Links links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     *
     * @return links
     */
    @ApiModelProperty(value = "")

    @Valid

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public OBFundsConfirmationResponse1 meta(Meta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get meta
     *
     * @return meta
     */
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
        OBFundsConfirmationResponse1 obFundsConfirmationResponse1 = (OBFundsConfirmationResponse1) o;
        return Objects.equals(this.data, obFundsConfirmationResponse1.data) &&
                Objects.equals(this.links, obFundsConfirmationResponse1.links) &&
                Objects.equals(this.meta, obFundsConfirmationResponse1.meta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, links, meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBFundsConfirmationResponse1 {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

