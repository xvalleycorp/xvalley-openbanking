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
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.7
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.xvalley.openbanking.models.uk.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An array of detail error codes, and messages, and URLs to documentation to help remediation.
 */
@ApiModel(description = "An array of detail error codes, and messages, and URLs to documentation to help remediation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-05T09:20:17.613+01:00")
public class OBErrorResponse1 {
    @JsonProperty("Code")
    private String code = null;

    @JsonProperty("Errors")
    private List<OBError1> errors = new ArrayList<OBError1>();

    @JsonProperty("Id")
    private String id = null;

    @JsonProperty("Message")
    private String message = null;

    public OBErrorResponse1 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * High level textual error code, to help categorize the errors.
     * @return code
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "High level textual error code, to help categorize the errors.")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OBErrorResponse1 errors(List<OBError1> errors) {
        this.errors = errors;
        return this;
    }

    public OBErrorResponse1 addErrorsItem(OBError1 errorsItem) {
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Get errors
     * @return errors
     **/
    @NotNull
    @Valid
    @Size(min = 1)
    @ApiModelProperty(required = true, value = "")
    public List<OBError1> getErrors() {
        return errors;
    }

    public void setErrors(List<OBError1> errors) {
        this.errors = errors;
    }

    public OBErrorResponse1 id(String id) {
        this.id = id;
        return this;
    }

    /**
     * A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.
     * @return id
     **/
    @Size(min = 1, max = 40)
    @ApiModelProperty(value = "A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OBErrorResponse1 message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Brief Error message, e.g., &#39;There is something wrong with the request parameters provided&#39;
     * @return message
     **/
    @NotNull
    @Size(min = 1, max = 500)
    @ApiModelProperty(required = true, value = "Brief Error message, e.g., 'There is something wrong with the request parameters provided'")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBErrorResponse1 obErrorResponse1 = (OBErrorResponse1) o;
        return Objects.equals(this.code, obErrorResponse1.code) &&
                Objects.equals(this.errors, obErrorResponse1.errors) &&
                Objects.equals(this.id, obErrorResponse1.id) &&
                Objects.equals(this.message, obErrorResponse1.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, errors, id, message);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBErrorResponse1 {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

