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
import com.xvalley.openbanking.models.uk.datamodel.account.OBCashAccount5;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBCashAccountCreditor3;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBCashAccountDebtor4;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBWriteDomestic2DataInitiationCreditorAccount;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBWriteDomestic2DataInitiationDebtorAccount;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBWriteDomesticStandingOrder3DataInitiationCreditorAccount;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBWriteDomesticStandingOrder3DataInitiationDebtorAccount;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBWriteInternationalStandingOrder4DataInitiationCreditorAccount;

import static com.xvalley.openbanking.models.uk.datamodel.service.converter.payment.ConverterHelper.copyField;

public class OBAccountConverter {

    public static OBCashAccount3 toOBCashAccount3(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
        return toAccount(new OBCashAccount3(), debtorAccount);
    }

    public static OBCashAccount3 toOBCashAccount3(OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
        return toAccount(new OBCashAccount3(), creditorAccount);
    }

    public static OBCashAccount3 toOBCashAccount3(OBWriteDomesticStandingOrder3DataInitiationCreditorAccount creditorAccount) {
        return toAccount(new OBCashAccount3(), creditorAccount);
    }

    public static OBCashAccount3 toOBCashAccount3(OBWriteInternationalStandingOrder4DataInitiationCreditorAccount creditorAccount) {
        return toAccount(new OBCashAccount3(), creditorAccount);
    }


    public static OBCashAccount3 toOBCashAccount3(OBWriteDomesticStandingOrder3DataInitiationDebtorAccount debtorAccount) {
        return toAccount(new OBCashAccount3(), debtorAccount);
    }

    public static OBCashAccount3 toOBCashAccount3(OBCashAccountDebtor4 debtorAccount) {
        return toAccount(new OBCashAccount3(), debtorAccount);
    }

    public static OBCashAccount3 toOBCashAccount3(OBCashAccountCreditor3 creditorAccount) {
        return toAccount(new OBCashAccount3(), creditorAccount);
    }

    public static OBCashAccount5 toOBCashAccount5(OBWriteInternationalStandingOrder4DataInitiationCreditorAccount creditorAccount) {
        return toAccount(new OBCashAccount5(), creditorAccount);
    }

    public static OBWriteDomestic2DataInitiationDebtorAccount toOBWriteDomestic2DataInitiationDebtorAccount(OBCashAccount3 debtorAccount) {
        return toAccount(new OBWriteDomestic2DataInitiationDebtorAccount(), debtorAccount);
    }

    public static OBWriteDomestic2DataInitiationCreditorAccount toOBWriteDomestic2DataInitiationCreditorAccount(OBCashAccount3 creditorAccount) {
        return toAccount(new OBWriteDomestic2DataInitiationCreditorAccount(), creditorAccount);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationDebtorAccount toOBWriteDomesticStandingOrder3DataInitiationDebtorAccount(OBCashAccountDebtor4 debtorAccount) {
        return toAccount(new OBWriteDomesticStandingOrder3DataInitiationDebtorAccount(), debtorAccount);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationCreditorAccount toOBWriteDomesticStandingOrder3DataInitiationCreditorAccount(OBCashAccountCreditor3 creditorAccount) {
        return toAccount(new OBWriteDomesticStandingOrder3DataInitiationCreditorAccount(), creditorAccount);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationDebtorAccount toOBWriteDomesticStandingOrder3DataInitiationDebtorAccount(OBCashAccount3 debtorAccount) {
        return toAccount(new OBWriteDomesticStandingOrder3DataInitiationDebtorAccount(), debtorAccount);
    }

    public static OBWriteInternationalStandingOrder4DataInitiationCreditorAccount toOBWriteInternationalStandingOrder4DataInitiationCreditorAccount(OBCashAccount3 creditorAccount) {
        return toAccount(new OBWriteInternationalStandingOrder4DataInitiationCreditorAccount(), creditorAccount);
    }

    public static OBWriteDomesticStandingOrder3DataInitiationCreditorAccount toOBWriteDomesticStandingOrder3DataInitiationCreditorAccount(OBCashAccount3 creditorAccount) {
        return toAccount(new OBWriteDomesticStandingOrder3DataInitiationCreditorAccount(), creditorAccount);

    }

    public static OBWriteInternationalStandingOrder4DataInitiationCreditorAccount toOBWriteInternationalStandingOrder4DataInitiationCreditorAccount(OBCashAccountCreditor3 creditorAccount) {
        return toAccount(new OBWriteInternationalStandingOrder4DataInitiationCreditorAccount(), creditorAccount);
    }

    public static OBCashAccountDebtor4 toOBCashAccountDebtor4(OBWriteDomesticStandingOrder3DataInitiationDebtorAccount debtorAccount) {
        return toAccount(new OBCashAccountDebtor4(), debtorAccount);
    }

    public static OBCashAccountDebtor4 toOBCashAccountDebtor4(OBCashAccount3 debtorAccount) {
        return toAccount(new OBCashAccountDebtor4(), debtorAccount);
    }

    public static OBCashAccountCreditor3 toOBCashAccountCreditor3(OBCashAccount3 creditorAccount) {
        return toAccount(new OBCashAccountCreditor3(), creditorAccount);
    }

    public static OBCashAccountCreditor3 toOBCashAccountCreditor3(OBWriteDomesticStandingOrder3DataInitiationCreditorAccount creditorAccount) {
        return toAccount(new OBCashAccountCreditor3(), creditorAccount);
    }

    public static OBCashAccountCreditor3 toOBCashAccountCreditor3(OBWriteInternationalStandingOrder4DataInitiationCreditorAccount creditorAccount) {
        return toAccount(new OBCashAccountCreditor3(), creditorAccount);
    }

    private static <T, U> T toAccount(T newAccount, U originalAccount) {
        if (originalAccount == null) {
            return null;
        }
        copyField(newAccount, originalAccount, "schemeName");
        copyField(newAccount, originalAccount, "identification");
        copyField(newAccount, originalAccount, "name");
        copyField(newAccount, originalAccount, "secondaryIdentification");
        return newAccount;
    }

}
