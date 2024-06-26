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

import com.xvalley.openbanking.models.uk.datamodel.account.OBCashAccount3;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBInternationalScheduled1;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBInternationalScheduled2;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBWriteInternationalScheduled3DataInitiation;

import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.CountryCodeHelper.determineCountryCode;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBAccountConverter.*;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBAmountConverter.toOBActiveOrHistoricCurrencyAndAmount;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBAmountConverter.toOBWriteDomestic2DataInitiationInstructedAmount;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBExchangeRateConverter.toOBExchangeRate1;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBExchangeRateConverter.toOBWriteInternational3DataInitiationExchangeRateInformation;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBInternationalIdentifierConverter.*;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBRemittanceInformationConverter.toOBRemittanceInformation1;
import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.OBRemittanceInformationConverter.toOBWriteDomestic2DataInitiationRemittanceInformation;

public class OBInternationalScheduledConverter {

    public static OBInternationalScheduled1 toOBInternationalScheduled1(OBInternationalScheduled2 obInternationalScheduled2) {
        return obInternationalScheduled2 == null ? null : (new OBInternationalScheduled1())
                .instructionIdentification(obInternationalScheduled2.getInstructionIdentification())
                .endToEndIdentification(obInternationalScheduled2.getEndToEndIdentification())
                .localInstrument(obInternationalScheduled2.getLocalInstrument())
                .instructionPriority(obInternationalScheduled2.getInstructionPriority())
                .purpose(obInternationalScheduled2.getPurpose())
                .chargeBearer(obInternationalScheduled2.getChargeBearer())
                .requestedExecutionDateTime(obInternationalScheduled2.getRequestedExecutionDateTime())
                .currencyOfTransfer(obInternationalScheduled2.getCurrencyOfTransfer())
                .instructedAmount(obInternationalScheduled2.getInstructedAmount())
                .exchangeRateInformation(obInternationalScheduled2.getExchangeRateInformation())
                .debtorAccount(obInternationalScheduled2.getDebtorAccount())
                .creditor(obInternationalScheduled2.getCreditor())
                .creditorAgent(obInternationalScheduled2.getCreditorAgent())
                .creditorAccount(obInternationalScheduled2.getCreditorAccount())
                .remittanceInformation(obInternationalScheduled2.getRemittanceInformation());
    }

    public static OBInternationalScheduled1 toOBInternationalScheduled1(OBWriteInternationalScheduled3DataInitiation initiation) {
        return initiation == null ? null : (new OBInternationalScheduled1())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructionPriority(initiation.getInstructionPriority())
                .purpose(initiation.getPurpose())
                .chargeBearer(initiation.getChargeBearer())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(initiation.getInstructedAmount()))
                .exchangeRateInformation(toOBExchangeRate1(initiation.getExchangeRateInformation()))
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .creditor(toOBPartyIdentification43(initiation.getCreditor()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification3(initiation.getCreditorAgent()))
                .creditorAccount(toOBCashAccount3(initiation.getCreditorAccount()))
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()));
    }

    public static OBInternationalScheduled2 toOBInternationalScheduled2(OBInternationalScheduled1 obInternationalScheduled1) {
        return obInternationalScheduled1 == null ? null : (new OBInternationalScheduled2())
                .instructionIdentification(obInternationalScheduled1.getInstructionIdentification())
                .endToEndIdentification(obInternationalScheduled1.getEndToEndIdentification())
                .localInstrument(obInternationalScheduled1.getLocalInstrument())
                .instructionPriority(obInternationalScheduled1.getInstructionPriority())
                .purpose(obInternationalScheduled1.getPurpose())
                .chargeBearer(obInternationalScheduled1.getChargeBearer())
                .requestedExecutionDateTime(obInternationalScheduled1.getRequestedExecutionDateTime())
                .currencyOfTransfer(obInternationalScheduled1.getCurrencyOfTransfer())
                .instructedAmount(obInternationalScheduled1.getInstructedAmount())
                .exchangeRateInformation(obInternationalScheduled1.getExchangeRateInformation())
                .debtorAccount(obInternationalScheduled1.getDebtorAccount())
                .creditor(obInternationalScheduled1.getCreditor())
                .creditorAgent(obInternationalScheduled1.getCreditorAgent())
                .creditorAccount(obInternationalScheduled1.getCreditorAccount())
                .remittanceInformation(obInternationalScheduled1.getRemittanceInformation())
                .supplementaryData(null);
    }

    public static OBInternationalScheduled2 toOBInternationalScheduled2(OBWriteInternationalScheduled3DataInitiation initiation) {
        return initiation == null ? null : (new OBInternationalScheduled2())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructionPriority(initiation.getInstructionPriority())
                .purpose(initiation.getPurpose())
                .chargeBearer(initiation.getChargeBearer())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(initiation.getInstructedAmount()))
                .exchangeRateInformation(toOBExchangeRate1(initiation.getExchangeRateInformation()))
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .creditor(toOBPartyIdentification43(initiation.getCreditor()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification3(initiation.getCreditorAgent()))
                .creditorAccount(toOBCashAccount3(initiation.getCreditorAccount()))
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()))
                .supplementaryData(initiation.getSupplementaryData());
    }

    public static OBWriteInternationalScheduled3DataInitiation toOBWriteInternationalScheduled3DataInitiation(OBInternationalScheduled1 obInternationalScheduled1) {
        OBCashAccount3 creditorAccount = obInternationalScheduled1.getCreditorAccount();
        return obInternationalScheduled1 == null ? null : (new OBWriteInternationalScheduled3DataInitiation())
                .instructionIdentification(obInternationalScheduled1.getInstructionIdentification())
                .endToEndIdentification(obInternationalScheduled1.getEndToEndIdentification())
                .localInstrument(obInternationalScheduled1.getLocalInstrument())
                .instructionPriority(obInternationalScheduled1.getInstructionPriority())
                .purpose(obInternationalScheduled1.getPurpose())
                .chargeBearer(obInternationalScheduled1.getChargeBearer())
                .requestedExecutionDateTime(obInternationalScheduled1.getRequestedExecutionDateTime())
                .currencyOfTransfer(obInternationalScheduled1.getCurrencyOfTransfer())
                .destinationCountryCode(determineCountryCode(creditorAccount.getSchemeName(), creditorAccount.getIdentification())) // to prevent validation error
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(obInternationalScheduled1.getInstructedAmount()))
                .exchangeRateInformation(toOBWriteInternational3DataInitiationExchangeRateInformation(obInternationalScheduled1.getExchangeRateInformation()))
                .debtorAccount(toOBWriteDomestic2DataInitiationDebtorAccount(obInternationalScheduled1.getDebtorAccount()))
                .creditor(toOBWriteInternational3DataInitiationCreditor(obInternationalScheduled1.getCreditor()))
                .creditorAgent(toOBWriteInternational3DataInitiationCreditorAgent(obInternationalScheduled1.getCreditorAgent()))
                .creditorAccount(toOBWriteDomestic2DataInitiationCreditorAccount(creditorAccount))
                .remittanceInformation(toOBWriteDomestic2DataInitiationRemittanceInformation(obInternationalScheduled1.getRemittanceInformation()))
                .supplementaryData(null);
    }

    public static OBWriteInternationalScheduled3DataInitiation toOBWriteInternationalScheduled3DataInitiation(OBInternationalScheduled2 obInternationalScheduled2) {
        OBCashAccount3 creditorAccount = obInternationalScheduled2.getCreditorAccount();
        return obInternationalScheduled2 == null ? null : (new OBWriteInternationalScheduled3DataInitiation())
                .instructionIdentification(obInternationalScheduled2.getInstructionIdentification())
                .endToEndIdentification(obInternationalScheduled2.getEndToEndIdentification())
                .localInstrument(obInternationalScheduled2.getLocalInstrument())
                .instructionPriority(obInternationalScheduled2.getInstructionPriority())
                .purpose(obInternationalScheduled2.getPurpose())
                .chargeBearer(obInternationalScheduled2.getChargeBearer())
                .requestedExecutionDateTime(obInternationalScheduled2.getRequestedExecutionDateTime())
                .currencyOfTransfer(obInternationalScheduled2.getCurrencyOfTransfer())
                .destinationCountryCode(determineCountryCode(creditorAccount.getSchemeName(), creditorAccount.getIdentification())) // to prevent validation error
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(obInternationalScheduled2.getInstructedAmount()))
                .exchangeRateInformation(toOBWriteInternational3DataInitiationExchangeRateInformation(obInternationalScheduled2.getExchangeRateInformation()))
                .debtorAccount(toOBWriteDomestic2DataInitiationDebtorAccount(obInternationalScheduled2.getDebtorAccount()))
                .creditor(toOBWriteInternational3DataInitiationCreditor(obInternationalScheduled2.getCreditor()))
                .creditorAgent(toOBWriteInternational3DataInitiationCreditorAgent(obInternationalScheduled2.getCreditorAgent()))
                .creditorAccount(toOBWriteDomestic2DataInitiationCreditorAccount(creditorAccount))
                .remittanceInformation(toOBWriteDomestic2DataInitiationRemittanceInformation(obInternationalScheduled2.getRemittanceInformation()))
                .supplementaryData(obInternationalScheduled2.getSupplementaryData());
    }

}
