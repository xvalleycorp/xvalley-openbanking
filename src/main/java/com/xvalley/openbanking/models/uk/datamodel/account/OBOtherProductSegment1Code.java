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
 * OpenAPI spec version: v3.1.1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.xvalley.openbanking.models.uk.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd
 */
public enum OBOtherProductSegment1Code {

    GEAS("GEAS"),

    GEBA("GEBA"),

    GEBR("GEBR"),

    GEBU("GEBU"),

    GECI("GECI"),

    GECS("GECS"),

    GEFB("GEFB"),

    GEFG("GEFG"),

    GEG("GEG"),

    GEGR("GEGR"),

    GEGS("GEGS"),

    GEOT("GEOT"),

    GEOV("GEOV"),

    GEPA("GEPA"),

    GEPR("GEPR"),

    GERE("GERE"),

    GEST("GEST"),

    GEYA("GEYA"),

    GEYO("GEYO"),

    PSCA("PSCA"),

    PSES("PSES"),

    PSNC("PSNC"),

    PSNP("PSNP"),

    PSRG("PSRG"),

    PSSS("PSSS"),

    PSST("PSST"),

    PSSW("PSSW");

    private String value;

    OBOtherProductSegment1Code(String value) {
        this.value = value;
    }

    @JsonCreator
    public static OBOtherProductSegment1Code fromValue(String text) {
        for (OBOtherProductSegment1Code b : OBOtherProductSegment1Code.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

