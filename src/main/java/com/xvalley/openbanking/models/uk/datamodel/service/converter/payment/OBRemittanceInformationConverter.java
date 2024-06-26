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

import com.xvalley.openbanking.models.uk.datamodel.payment.OBRemittanceInformation1;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBWriteDomestic2DataInitiationRemittanceInformation;

public class OBRemittanceInformationConverter {

    public static OBRemittanceInformation1 toOBRemittanceInformation1(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
        return remittanceInformation == null ? null : (new OBRemittanceInformation1())
                .unstructured(remittanceInformation.getUnstructured())
                .reference(remittanceInformation.getReference());
    }

    public static OBWriteDomestic2DataInitiationRemittanceInformation toOBWriteDomestic2DataInitiationRemittanceInformation(OBRemittanceInformation1 remittanceInformation) {
        return remittanceInformation == null ? null : (new OBWriteDomestic2DataInitiationRemittanceInformation())
                .unstructured(remittanceInformation.getUnstructured())
                .reference(remittanceInformation.getReference());
    }
}
