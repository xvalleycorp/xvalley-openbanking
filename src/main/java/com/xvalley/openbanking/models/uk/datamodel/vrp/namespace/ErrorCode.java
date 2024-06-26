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
package com.xvalley.openbanking.models.uk.datamodel.vrp.namespace;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ErrorCode {
    FIELD_EXPECTED("UK.OBIE.Field.Expected"),
    FIELD_INVALID("UK.OBIE.Field.Invalid"),
    FIELD_INVALID_DATE("UK.OBIE.Field.InvalidDate"),
    FIELD_Missing("UK.OBIE.Field.Missing"),
    FIELD_Unexpected("UK.OBIE.Field.Unexpected"),
    HEADER_INVALID("UK.OBIE.Header.Invalid"),
    HEADER_MISSING("UK.OBIE.Header.Missing"),
    REAUTHENTICATE("UK.OBIE.Reauthenticate"),
    RESOURCE_CONSENT_MISMATCH("UK.OBIE.Resource.ConsentMismatch"),
    RESOURCE_INVALID_CONSENT_STATUS("UK.OBIE.Resource.InvalidConsentStatus"),
    RESOURCE_INVALID_FORMAT("UK.OBIE.Resource.InvalidFormat"),
    RESOURCE_NOT_FOUND("UK.OBIE.Resource.NotFound"),
    RULES_AFTER_CUT_OFF_DATETIME("UK.OBIE.Rules.AfterCutOffDateTime"),
    RULES_DUPLICATE_REFERENCE("UK.OBIE.Rules.DuplicateReference"),
    RULES_FAILS_CONTROL_PARAMETERS("UK.OBIE.Rules.FailsControlParameters"),
    SIGNATURE_INVALID("UK.OBIE.Signature.Invalid"),
    SIGNATURE_INVALID_CLAIM("UK.OBIE.Signature.InvalidClaim"),
    SIGNATURE_MALFORMED("UK.OBIE.Signature.Malformed"),
    SIGNATURE_MISSING("UK.OBIE.Signature.Missing"),
    SIGNATURE_MISSING_CLAIM("UK.OBIE.Signature.MissingClaim"),
    SIGNATURE_UNEXPECTED("UK.OBIE.Signature.Unexpected"),
    UNEXPECTED_ERROR("UK.OBIE.UnexpectedError"),
    UNSUPPORTED_ACCOUNT_IDENTIFIER("UK.OBIE.Unsupported.AccountIdentifier"),
    UNSUPPORTED_ACCOUNT_SECONDARY_IDENTIFIER("UK.OBIE.Unsupported.AccountSecondaryIdentifier"),
    UNSUPPORTED_CURRENCY("UK.OBIE.Unsupported.Currency"),
    UNSUPPORTED_FREQUENCY("UK.OBIE.Unsupported.Frequency"),
    UNSUPPORTED_LOCAL_INSTRUMENT("UK.OBIE.Unsupported.LocalInstrument"),
    UNSUPPORTED_SCHEME("UK.OBIE.Unsupported.Scheme");

    private String value;

    ErrorCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ErrorCode fromValue(String value) {
        for (ErrorCode enum_ : ErrorCode.values()) {
            if (enum_.value.equals(value)) {
                return enum_;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
