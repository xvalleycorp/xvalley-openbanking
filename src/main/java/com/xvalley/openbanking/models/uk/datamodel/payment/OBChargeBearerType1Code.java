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
package com.xvalley.openbanking.models.uk.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies which party/parties will bear the charges associated with the processing of the payment transaction.
 */
public enum OBChargeBearerType1Code {
  
  BORNEBYCREDITOR("BorneByCreditor"),
  
  BORNEBYDEBTOR("BorneByDebtor"),
  
  FOLLOWINGSERVICELEVEL("FollowingServiceLevel"),
  
  SHARED("Shared");

  private String value;

  OBChargeBearerType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBChargeBearerType1Code fromValue(String text) {
    for (OBChargeBearerType1Code b : OBChargeBearerType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

