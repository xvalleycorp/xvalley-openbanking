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

import com.xvalley.openbanking.models.uk.datamodel.payment.OBDomestic1;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBDomestic2;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBWriteDomestic2DataInitiation;

import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBAccountConverter.toOBCashAccount3;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBAccountConverter.toOBWriteDomestic2DataInitiationCreditorAccount;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBAccountConverter.toOBWriteDomestic2DataInitiationDebtorAccount;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBAmountConverter.toOBActiveOrHistoricCurrencyAndAmount;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBAmountConverter.toOBWriteDomestic2DataInitiationInstructedAmount;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBRemittanceInformationConverter.toOBRemittanceInformation1;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBRemittanceInformationConverter.toOBWriteDomestic2DataInitiationRemittanceInformation;

public class OBDomesticConverter {

    public static OBDomestic1 toOBDomestic1(OBDomestic2 obDomestic2) {
        return obDomestic2 == null ? null : (new OBDomestic1())
                .instructionIdentification(obDomestic2.getInstructionIdentification())
                .endToEndIdentification(obDomestic2.getEndToEndIdentification())
                .localInstrument(obDomestic2.getLocalInstrument())
                .instructedAmount(obDomestic2.getInstructedAmount())
                .debtorAccount(obDomestic2.getDebtorAccount())
                .creditorAccount(obDomestic2.getCreditorAccount())
                .creditorPostalAddress(obDomestic2.getCreditorPostalAddress())
                .remittanceInformation(obDomestic2.getRemittanceInformation());
    }

    public static OBDomestic2 toOBDomestic2(OBDomestic1 obDomestic1) {
        return obDomestic1 == null ? null : (new OBDomestic2())
                .instructionIdentification(obDomestic1.getInstructionIdentification())
                .endToEndIdentification(obDomestic1.getEndToEndIdentification())
                .localInstrument(obDomestic1.getLocalInstrument())
                .instructedAmount(obDomestic1.getInstructedAmount())
                .debtorAccount(obDomestic1.getDebtorAccount())
                .creditorAccount(obDomestic1.getCreditorAccount())
                .creditorPostalAddress(obDomestic1.getCreditorPostalAddress())
                .remittanceInformation(obDomestic1.getRemittanceInformation())
                .supplementaryData(null);
    }

    public static OBDomestic1 toOBDomestic1(OBWriteDomestic2DataInitiation initiation) {
        return initiation == null ? null : (new OBDomestic1())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .creditorAccount(toOBCashAccount3(initiation.getCreditorAccount()))
                .creditorPostalAddress(initiation.getCreditorPostalAddress())
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()));
    }

    public static OBDomestic2 toOBDomestic2(OBWriteDomestic2DataInitiation initiation) {
        return initiation == null ? null : (new OBDomestic2())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .creditorAccount(toOBCashAccount3(initiation.getCreditorAccount()))
                .creditorPostalAddress(initiation.getCreditorPostalAddress())
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()))
                .supplementaryData(initiation.getSupplementaryData());
    }

    public static OBWriteDomestic2DataInitiation toOBWriteDomestic2DataInitiation(OBDomestic2 obDomestic2) {
        return obDomestic2 == null ? null : (new OBWriteDomestic2DataInitiation())
                .instructionIdentification(obDomestic2.getInstructionIdentification())
                .endToEndIdentification(obDomestic2.getEndToEndIdentification())
                .localInstrument(obDomestic2.getLocalInstrument())
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(obDomestic2.getInstructedAmount()))
                .debtorAccount(toOBWriteDomestic2DataInitiationDebtorAccount(obDomestic2.getDebtorAccount()))
                .creditorAccount(toOBWriteDomestic2DataInitiationCreditorAccount(obDomestic2.getCreditorAccount()))
                .creditorPostalAddress(obDomestic2.getCreditorPostalAddress())
                .remittanceInformation(toOBWriteDomestic2DataInitiationRemittanceInformation(obDomestic2.getRemittanceInformation()))
                .supplementaryData(obDomestic2.getSupplementaryData());
    }

    public static OBWriteDomestic2DataInitiation toOBWriteDomestic2DataInitiation(OBDomestic1 initiation) {
        return initiation == null ? null : (new OBWriteDomestic2DataInitiation())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditorAccount(toOBWriteDomestic2DataInitiationCreditorAccount(initiation.getCreditorAccount()))
                .creditorPostalAddress(initiation.getCreditorPostalAddress())
                .remittanceInformation(toOBWriteDomestic2DataInitiationRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(null);
    }
}
