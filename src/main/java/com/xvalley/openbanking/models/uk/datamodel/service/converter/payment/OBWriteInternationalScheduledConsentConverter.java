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

import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBConsentAuthorisationConverter.*;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBInternationalScheduledConverter.*;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBWriteDomesticConsentConverter.toOBSCASupportData1;

public class OBWriteInternationalScheduledConsentConverter {

    public static OBWriteInternationalScheduledConsent1 toOBWriteInternationalScheduledConsent1(OBWriteInternationalScheduledConsent2 obWriteInternationalScheduledConsent2) {
        return (new OBWriteInternationalScheduledConsent1())
                .data(toOBWriteDataInternationalScheduledConsent1(obWriteInternationalScheduledConsent2.getData()))
                .risk(obWriteInternationalScheduledConsent2.getRisk());
    }

    public static OBWriteInternationalScheduledConsent1 toOBWriteInternationalScheduledConsent1(OBWriteInternationalScheduledConsent4 obWriteInternationalScheduledConsent4) {
        return (new OBWriteInternationalScheduledConsent1()
                .data(toOBWriteDataInternationalScheduledConsent1(obWriteInternationalScheduledConsent4.getData()))
                .risk(obWriteInternationalScheduledConsent4.getRisk()));
    }

    public static OBWriteInternationalScheduledConsent1 toOBWriteInternationalScheduledConsent1(OBWriteInternationalScheduledConsent5 obWriteInternationalScheduledConsent5) {
        return obWriteInternationalScheduledConsent5 == null ? null : (new OBWriteInternationalScheduledConsent1())
                .data(toOBWriteDataInternationalScheduledConsent1(obWriteInternationalScheduledConsent5.getData()))
                .risk(obWriteInternationalScheduledConsent5.getRisk());
    }

    public static OBWriteInternationalScheduledConsent2 toOBWriteInternationalScheduledConsent2(OBWriteInternationalScheduledConsent1 obWriteInternationalScheduledConsent1) {
        return (new OBWriteInternationalScheduledConsent2())
                .data(toOBWriteDataInternationalScheduledConsent2(obWriteInternationalScheduledConsent1.getData()))
                .risk(obWriteInternationalScheduledConsent1.getRisk());
    }

    public static OBWriteInternationalScheduled1 toOBWriteInternationalScheduled1(OBWriteInternationalScheduled2 obWriteInternationalScheduled2) {
        return (new OBWriteInternationalScheduled1())
                .data(toOBWriteDataInternationalScheduled1(obWriteInternationalScheduled2.getData()))
                .risk(obWriteInternationalScheduled2.getRisk());
    }

    public static OBWriteInternationalScheduled2 toOBWriteInternationalScheduled2(OBWriteInternationalScheduled1 obWriteInternationalScheduled1) {
        return (new OBWriteInternationalScheduled2())
                .data(toOBWriteDataInternationalScheduled2(obWriteInternationalScheduled1.getData()))
                .risk(obWriteInternationalScheduled1.getRisk());
    }

    public static OBWriteInternationalScheduledConsent4 toOBWriteInternationalScheduledConsent4(OBWriteInternationalScheduledConsent1 obWriteInternationalScheduledConsent1) {
        return (new OBWriteInternationalScheduledConsent4())
                .data(toOBWriteInternationalScheduledConsent4Data(obWriteInternationalScheduledConsent1.getData()))
                .risk(obWriteInternationalScheduledConsent1.getRisk());
    }

    public static OBWriteInternationalScheduledConsent4 toOBWriteInternationalScheduledConsent4(OBWriteInternationalScheduledConsent2 obWriteInternationalScheduledConsent2) {
        return (new OBWriteInternationalScheduledConsent4())
                .data(toOBWriteInternationalScheduledConsent4Data(obWriteInternationalScheduledConsent2.getData()))
                .risk(obWriteInternationalScheduledConsent2.getRisk());
    }

    public static OBWriteInternationalScheduledConsent5 toOBWriteInternationalScheduledConsent5(OBWriteInternationalScheduledConsent1 obWriteInternationalScheduledConsent1) {
        return (new OBWriteInternationalScheduledConsent5())
                .data(toOBWriteInternationalScheduledConsent5Data(obWriteInternationalScheduledConsent1.getData()))
                .risk(obWriteInternationalScheduledConsent1.getRisk());
    }

    public static OBWriteInternationalScheduledConsent5 toOBWriteInternationalScheduledConsent5(OBWriteInternationalScheduledConsent2 obWriteInternationalScheduledConsent2) {
        return (new OBWriteInternationalScheduledConsent5())
                .data(toOBWriteInternationalScheduledConsent5Data(obWriteInternationalScheduledConsent2.getData()))
                .risk(obWriteInternationalScheduledConsent2.getRisk());
    }

    public static OBWriteInternationalScheduledConsent5 toOBWriteInternationalScheduledConsent5(OBWriteInternationalScheduledConsent4 obWriteInternationalScheduledConsent4) {
        return (new OBWriteInternationalScheduledConsent5())
                .data(toOBWriteInternationalScheduledConsent5Data(obWriteInternationalScheduledConsent4.getData()))
                .risk(obWriteInternationalScheduledConsent4.getRisk());
    }

    public static OBWriteDataInternationalScheduled1 toOBWriteDataInternationalScheduled1(OBWriteDataInternationalScheduled2 data) {
        return data == null ? null : (new OBWriteDataInternationalScheduled1())
                .consentId(data.getConsentId())
                .initiation(toOBInternationalScheduled1(data.getInitiation()));
    }

    public static OBWriteDataInternationalScheduled2 toOBWriteDataInternationalScheduled2(OBWriteDataInternationalScheduled1 data) {
        return data == null ? null : (new OBWriteDataInternationalScheduled2())
                .consentId(data.getConsentId())
                .initiation(toOBInternationalScheduled2(data.getInitiation()));
    }

    public static OBWriteDataInternationalScheduledConsent1 toOBWriteDataInternationalScheduledConsent1(OBWriteDataInternationalScheduledConsent2 data) {
        return data == null ? null : (new OBWriteDataInternationalScheduledConsent1())
                .permission(data.getPermission())
                .initiation(toOBInternationalScheduled1(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataInternationalScheduledConsent1 toOBWriteDataInternationalScheduledConsent1(OBWriteInternationalScheduledConsent4Data data) {
        return data == null ? null : (new OBWriteDataInternationalScheduledConsent1())
                .permission(data.getPermission())
                .initiation(toOBInternationalScheduled1(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

    public static OBWriteDataInternationalScheduledConsent1 toOBWriteDataInternationalScheduledConsent1(OBWriteInternationalScheduledConsent5Data data) {
        return data == null ? null : (new OBWriteDataInternationalScheduledConsent1())
                .permission(data.getPermission())
                .initiation(toOBInternationalScheduled1(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

    public static OBWriteDataInternationalScheduledConsent2 toOBWriteDataInternationalScheduledConsent2(OBWriteDataInternationalScheduledConsent1 data) {
        return data == null ? null : (new OBWriteDataInternationalScheduledConsent2())
                .permission(data.getPermission())
                .initiation(toOBInternationalScheduled2(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteInternationalScheduledConsent4Data toOBWriteInternationalScheduledConsent4Data(OBWriteDataInternationalScheduledConsent1 data) {
        return data == null ? null : (new OBWriteInternationalScheduledConsent4Data())
                .permission(data.getPermission())
                .initiation(toOBWriteInternationalScheduled3DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteInternationalScheduledConsent4Data toOBWriteInternationalScheduledConsent4Data(OBWriteDataInternationalScheduledConsent2 data) {
        return data == null ? null : (new OBWriteInternationalScheduledConsent4Data())
                .permission(data.getPermission())
                .initiation(toOBWriteInternationalScheduled3DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteInternationalScheduledConsent5Data toOBWriteInternationalScheduledConsent5Data(OBWriteDataInternationalScheduledConsent1 data) {
        return data == null ? null : (new OBWriteInternationalScheduledConsent5Data())
                .permission(data.getPermission())
                .readRefundAccount(null)
                .initiation(toOBWriteInternationalScheduled3DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteInternationalScheduledConsent5Data toOBWriteInternationalScheduledConsent5Data(OBWriteDataInternationalScheduledConsent2 data) {
        return data == null ? null : (new OBWriteInternationalScheduledConsent5Data())
                .permission(data.getPermission())
                .readRefundAccount(null)
                .initiation(toOBWriteInternationalScheduled3DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteInternationalScheduledConsent5Data toOBWriteInternationalScheduledConsent5Data(OBWriteInternationalScheduledConsent4Data data) {
        return data == null ? null : (new OBWriteInternationalScheduledConsent5Data())
                .permission(data.getPermission())
                .readRefundAccount(null)
                .initiation(data.getInitiation())
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(toOBSCASupportData1(data.getScASupportData()));
    }
}
