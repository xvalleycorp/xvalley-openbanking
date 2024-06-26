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
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBFileConverter.toOBFile1;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBFileConverter.toOBFile2;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBFileConverter.toOBWriteFile2DataInitiation;

public class OBWriteFileConsentConverter {

    public static OBWriteFileConsent1 toOBWriteFileConsent1(OBWriteFileConsent2 obWriteFileConsent2) {
        return (new OBWriteFileConsent1())
                .data(toOBWriteDataFileConsent1(obWriteFileConsent2.getData()));
    }

    public static OBWriteFileConsent1 toOBWriteFileConsent1(OBWriteFileConsent3 writeFileConsent) {
        return (new OBWriteFileConsent1())
                .data(toOBWriteDataFileConsent1(writeFileConsent.getData()));
    }

    public static OBWriteFileConsent2 toOBWriteFileConsent2(OBWriteFileConsent1 obWriteFileConsent1) {
        return (new OBWriteFileConsent2())
                .data(toOBWriteDataFileConsent2(obWriteFileConsent1.getData()));
    }

    public static OBWriteFileConsent2 toOBWriteFileConsent2(OBWriteFileConsent3 obWriteFileConsent3) {
        return (new OBWriteFileConsent2())
                .data(toOBWriteDataFileConsent2(obWriteFileConsent3.getData()));
    }

    public static OBWriteFileConsent3 toOBWriteFileConsent3(OBWriteFileConsent1 obWriteFileConsent1) {
        return obWriteFileConsent1 == null ? null : (new OBWriteFileConsent3())
                .data(toOBWriteFileConsent3Data(obWriteFileConsent1.getData()));
    }

    public static OBWriteFileConsent3 toOBWriteFileConsent3(OBWriteFileConsent2 obWriteFileConsent2) {
        return (new OBWriteFileConsent3())
                .data(toOBWriteFileConsent3Data(obWriteFileConsent2.getData()));
    }

    public static OBWriteFile2 toOBWriteFile2(OBWriteFile1 obWriteFile1) {
        return (new OBWriteFile2())
                .data(toOBWriteFile2Data(obWriteFile1.getData()));
    }

    public static OBWriteDataFileConsent1 toOBWriteDataFileConsent1(OBWriteDataFileConsent2 data) {
        return data == null ? null : (new OBWriteDataFileConsent1())
                .initiation(toOBFile1(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataFileConsent1 toOBWriteDataFileConsent1(OBWriteFileConsent3Data data) {
        return data == null ? null : (new OBWriteDataFileConsent1())
                .initiation(toOBFile1(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

    public static OBWriteDataFileConsent2 toOBWriteDataFileConsent2(OBWriteDataFileConsent1 data) {
        return data == null ? null : (new OBWriteDataFileConsent2())
                .initiation(toOBFile2(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataFileConsent2 toOBWriteDataFileConsent2(OBWriteFileConsent3Data data) {
        return data == null ? null : (new OBWriteDataFileConsent2())
                .initiation(toOBFile2(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

    public static OBWriteDataFile2 toOBWriteDataFile2(OBWriteDataFile1 data) {
        return data == null ? null : (new OBWriteDataFile2())
                .consentId(data.getConsentId())
                .initiation(toOBFile2(data.getInitiation()));
    }

    public static OBWriteFile2Data toOBWriteFile2Data(OBWriteDataFile1 data) {
        return data == null ? null : (new OBWriteFile2Data())
                .consentId(data.getConsentId())
                .initiation(toOBWriteFile2DataInitiation(data.getInitiation()));
    }

    public static OBWriteFileConsent3Data toOBWriteFileConsent3Data(OBWriteDataFileConsent1 data) {
        return data == null ? null : (new OBWriteFileConsent3Data())
                .initiation(toOBWriteFile2DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteFileConsent3Data toOBWriteFileConsent3Data(OBWriteDataFileConsent2 data) {
        return data == null ? null : (new OBWriteFileConsent3Data())
                .initiation(toOBWriteFile2DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }
}
