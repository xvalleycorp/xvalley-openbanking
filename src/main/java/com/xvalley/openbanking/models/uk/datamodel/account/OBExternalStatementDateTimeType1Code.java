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
package com.xvalley.openbanking.models.uk.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Date time type, in a coded form.
 */
public enum OBExternalStatementDateTimeType1Code {
  
  BALANCETRANSFERPROMOEND("BalanceTransferPromoEnd"),
  
  DIRECTDEBITDUE("DirectDebitDue"),
  
  LASTPAYMENT("LastPayment"),
  
  LASTSTATEMENT("LastStatement"),
  
  NEXTSTATEMENT("NextStatement"),
  
  PAYMENTDUE("PaymentDue"),
  
  PURCHASEPROMOEND("PurchasePromoEnd"),
  
  STATEMENTAVAILABLE("StatementAvailable");

  private String value;

  OBExternalStatementDateTimeType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalStatementDateTimeType1Code fromValue(String text) {
    for (OBExternalStatementDateTimeType1Code b : OBExternalStatementDateTimeType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

