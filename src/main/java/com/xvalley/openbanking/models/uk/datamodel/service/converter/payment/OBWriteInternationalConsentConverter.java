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
package com.xvalley.openbanking.models.uk.datamodel.service.converter.payment;

import com.xvalley.openbanking.models.uk.datamodel.payment.*;

import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBConsentAuthorisationConverter.toOBWriteDomesticConsent3DataAuthorisation;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBConsentAuthorisationConverter.toOBWriteDomesticConsent4DataAuthorisation;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBInternationalConverter.*;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBWriteDomesticConsentConverter.toOBSCASupportData1;

public class OBWriteInternationalConsentConverter {

    public static OBWriteInternational1 toOBWriteInternational1(OBWriteInternational2 obWriteInternational2) {
        return (new OBWriteInternational1())
                .data(toOBWriteDataInternational1(obWriteInternational2.getData()))
                .risk(obWriteInternational2.getRisk());
    }

    public static OBWriteInternational2 toOBWriteInternational2(OBWriteInternational1 obWriteInternational1) {
        return (new OBWriteInternational2())
                .data(toOBWriteDataInternational2(obWriteInternational1.getData()))
                .risk(obWriteInternational1.getRisk());
    }

    public static OBWriteInternationalConsent1 toOBWriteInternationalConsent1(OBWriteInternationalConsent2 obWriteInternationalConsent2) {
        return (new OBWriteInternationalConsent1())
                .data(toOBWriteDataInternationalConsent1(obWriteInternationalConsent2.getData()))
                .risk(obWriteInternationalConsent2.getRisk());
    }

    public static OBWriteInternationalConsent2 toOBWriteInternationalConsent2(OBWriteInternationalConsent1 obWriteInternationalConsent1) {
        return (new OBWriteInternationalConsent2())
                .data(toOBWriteDataInternationalConsent2(obWriteInternationalConsent1.getData()))
                .risk(obWriteInternationalConsent1.getRisk());
    }

    public static OBWriteInternationalConsent4 toOBWriteInternationalConsent4(OBWriteInternationalConsent1 obWriteInternationalConsent1) {
        return (new OBWriteInternationalConsent4())
                .data(toOBWriteInternationalConsent4Data(obWriteInternationalConsent1.getData()))
                .risk(obWriteInternationalConsent1.getRisk());
    }

    public static OBWriteInternationalConsent4 toOBWriteInternationalConsent4(OBWriteInternationalConsent2 obWriteInternationalConsent2) {
        return (new OBWriteInternationalConsent4())
                .data(toOBWriteInternationalConsent4Data(obWriteInternationalConsent2.getData()))
                .risk(obWriteInternationalConsent2.getRisk());
    }

    public static OBWriteInternationalConsent5 toOBWriteInternationalConsent5(OBWriteInternationalConsent1 obWriteInternationalConsent1) {
        return new OBWriteInternationalConsent5()
                .data(toOBWriteInternationalConsent5Data(obWriteInternationalConsent1.getData()))
                .risk(obWriteInternationalConsent1.getRisk());
    }

    public static OBWriteInternationalConsent5 toOBWriteInternationalConsent5(OBWriteInternationalConsent2 obWriteInternationalConsent2) {
        return (new OBWriteInternationalConsent5())
                .data(toOBWriteInternationalConsent5Data(obWriteInternationalConsent2.getData()))
                .risk(obWriteInternationalConsent2.getRisk());
    }

    public static OBWriteInternationalConsent5 toOBWriteInternationalConsent5(OBWriteInternationalConsent4 obWriteInternationalConsent4) {
        return (new OBWriteInternationalConsent5())
                .data(toOBWriteInternationalConsent5Data(obWriteInternationalConsent4.getData()))
                .risk(obWriteInternationalConsent4.getRisk());
    }

    public static OBWriteDataInternational1 toOBWriteDataInternational1(OBWriteDataInternational2 data) {
        return data == null ? null : (new OBWriteDataInternational1())
                .consentId(data.getConsentId())
                .initiation(toOBInternational1(data.getInitiation()));
    }

    public static OBWriteDataInternational2 toOBWriteDataInternational2(OBWriteDataInternational1 data) {
        return data == null ? null : (new OBWriteDataInternational2())
                .consentId(data.getConsentId())
                .initiation(toOBInternational2(data.getInitiation()));
    }

    public static OBWriteDataInternationalConsent1 toOBWriteDataInternationalConsent1(OBWriteDataInternationalConsent2 data) {
        return data == null ? null : (new OBWriteDataInternationalConsent1())
                .authorisation(data.getAuthorisation())
                .initiation(toOBInternational1(data.getInitiation()));
    }

    public static OBWriteDataInternationalConsent2 toOBWriteDataInternationalConsent2(OBWriteDataInternationalConsent1 data) {
        return data == null ? null : (new OBWriteDataInternationalConsent2())
                .authorisation(data.getAuthorisation())
                .initiation(toOBInternational2(data.getInitiation()));
    }

    public static OBWriteInternationalConsent4Data toOBWriteInternationalConsent4Data(OBWriteDataInternationalConsent1 data) {
        return data == null ? null : (new OBWriteInternationalConsent4Data())
                .initiation(toOBWriteInternational3DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteInternationalConsent4Data toOBWriteInternationalConsent4Data(OBWriteDataInternationalConsent2 data) {
        return data == null ? null : (new OBWriteInternationalConsent4Data())
                .initiation(toOBWriteInternational3DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteInternationalConsent5Data toOBWriteInternationalConsent5Data(OBWriteDataInternationalConsent1 data) {
        return data == null ? null : (new OBWriteInternationalConsent5Data())
                .readRefundAccount(null)
                .initiation(toOBWriteInternational3DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteInternationalConsent5Data toOBWriteInternationalConsent5Data(OBWriteDataInternationalConsent2 data) {
        return data == null ? null : (new OBWriteInternationalConsent5Data())
                .readRefundAccount(null)
                .initiation(toOBWriteInternational3DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteInternationalConsent5Data toOBWriteInternationalConsent5Data(OBWriteInternationalConsent4Data data) {
        return data == null ? null : (new OBWriteInternationalConsent5Data())
                .initiation(data.getInitiation())
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .readRefundAccount(null)
                .scASupportData(toOBSCASupportData1(data.getScASupportData()));
    }
}
