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
package com.xvalley.openbanking.models.uk.jackson.payment;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBSupplementaryData1;

import java.io.IOException;

public class OBSupplementaryData1Serializer extends StdSerializer<OBSupplementaryData1> {

    public OBSupplementaryData1Serializer() {
        this(null);
    }

    public OBSupplementaryData1Serializer(Class<OBSupplementaryData1> t) {
        super(t);
    }

    @Override
    public void serialize(OBSupplementaryData1 supplementaryData1, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = mapper.readTree(supplementaryData1.getData());
        jsonGenerator.writeObject(actualObj);
    }
}
