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
/*
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.xvalley.openbanking.models.uk.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. This is the servicer of the beneficiary account.
 */
@ApiModel(description = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. This is the servicer of the beneficiary account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T16:03:12.161+01:00")
public class OBWriteInternationalStandingOrder3DataInitiationCreditorAgent {
    @JsonProperty("SchemeName")
    private String schemeName = null;

    @JsonProperty("Identification")
    private String identification = null;

    @JsonProperty("Name")
    private String name = null;

    @JsonProperty("PostalAddress")
    private OBPostalAddress6 postalAddress = null;

    public OBWriteInternationalStandingOrder3DataInitiationCreditorAgent schemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }

    /**
     * Name of the identification scheme, in a coded form as published in an external list.
     *
     * @return schemeName
     **/
    @ApiModelProperty(value = "Name of the identification scheme, in a coded form as published in an external list.")
    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public OBWriteInternationalStandingOrder3DataInitiationCreditorAgent identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of the servicing institution.
     *
     * @return identification
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "Unique and unambiguous identification of the servicing institution.")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBWriteInternationalStandingOrder3DataInitiationCreditorAgent name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name by which an agent is known and which is usually used to identify that agent.
     *
     * @return name
     **/
    @Size(min = 1, max = 140)
    @ApiModelProperty(value = "Name by which an agent is known and which is usually used to identify that agent.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBWriteInternationalStandingOrder3DataInitiationCreditorAgent postalAddress(OBPostalAddress6 postalAddress) {
        this.postalAddress = postalAddress;
        return this;
    }

    /**
     * Get postalAddress
     *
     * @return postalAddress
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBPostalAddress6 getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(OBPostalAddress6 postalAddress) {
        this.postalAddress = postalAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalStandingOrder3DataInitiationCreditorAgent obWriteInternationalStandingOrder3DataInitiationCreditorAgent = (OBWriteInternationalStandingOrder3DataInitiationCreditorAgent) o;
        return Objects.equals(this.schemeName, obWriteInternationalStandingOrder3DataInitiationCreditorAgent.schemeName) &&
                Objects.equals(this.identification, obWriteInternationalStandingOrder3DataInitiationCreditorAgent.identification) &&
                Objects.equals(this.name, obWriteInternationalStandingOrder3DataInitiationCreditorAgent.name) &&
                Objects.equals(this.postalAddress, obWriteInternationalStandingOrder3DataInitiationCreditorAgent.postalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemeName, identification, name, postalAddress);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalStandingOrder3DataInitiationCreditorAgent {\n");

        sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
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

