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
 * OpenAPI spec version: v3.1.2-RC1
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
 * Frequency at which the overdraft charge is applied to the account
 */
public enum OBFeeFrequency1Code0 {

    FEAC("FEAC"),

    FEAO("FEAO"),

    FECP("FECP"),

    FEDA("FEDA"),

    FEHO("FEHO"),

    FEI("FEI"),

    FEMO("FEMO"),

    FEOA("FEOA"),

    FEOT("FEOT"),

    FEPC("FEPC"),

    FEPH("FEPH"),

    FEPO("FEPO"),

    FEPS("FEPS"),

    FEPT("FEPT"),

    FEPTA("FEPTA"),

    FEPTP("FEPTP"),

    FEQU("FEQU"),

    FESM("FESM"),

    FEST("FEST"),

    FEWE("FEWE"),

    FEYE("FEYE");

    private String value;

    OBFeeFrequency1Code0(String value) {
        this.value = value;
    }

    @JsonCreator
    public static OBFeeFrequency1Code0 fromValue(String text) {
        for (OBFeeFrequency1Code0 b : OBFeeFrequency1Code0.values()) {
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

