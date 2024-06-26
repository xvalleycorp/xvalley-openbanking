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

import com.xvalley.openbanking.models.uk.datamodel.payment.OBAuthorisation1;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBWriteDomesticConsent3DataAuthorisation;
import com.xvalley.openbanking.models.uk.datamodel.payment.OBWriteDomesticConsent4DataAuthorisation;

public class OBConsentAuthorisationConverter {

    public static OBWriteDomesticConsent3DataAuthorisation toOBWriteDomesticConsent3DataAuthorisation(OBAuthorisation1 authorisation) {
        return authorisation == null ? null : (new OBWriteDomesticConsent3DataAuthorisation())
                .authorisationType(authorisation.getAuthorisationType())
                .completionDateTime(authorisation.getCompletionDateTime());
    }

    public static OBWriteDomesticConsent3DataAuthorisation toOBWriteDomesticConsent3DataAuthorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
        return authorisation == null ? null : (new OBWriteDomesticConsent3DataAuthorisation())
                .authorisationType(authorisation.getAuthorisationType())
                .completionDateTime(authorisation.getCompletionDateTime());
    }

    public static OBWriteDomesticConsent4DataAuthorisation toOBWriteDomesticConsent4DataAuthorisation(OBAuthorisation1 authorisation) {
        return authorisation == null ? null : (new OBWriteDomesticConsent4DataAuthorisation())
                .authorisationType(authorisation.getAuthorisationType())
                .completionDateTime(authorisation.getCompletionDateTime());
    }

    public static OBWriteDomesticConsent4DataAuthorisation toOBWriteDomesticConsent4DataAuthorisation(OBWriteDomesticConsent3DataAuthorisation authorisation) {
        return authorisation == null ? null : (new OBWriteDomesticConsent4DataAuthorisation())
                .authorisationType(authorisation.getAuthorisationType())
                .completionDateTime(authorisation.getCompletionDateTime());
    }

    public static OBAuthorisation1 toOBAuthorisation1(OBWriteDomesticConsent3DataAuthorisation authorisation) {
        return authorisation == null ? null : (new OBAuthorisation1())
                .authorisationType(authorisation.getAuthorisationType())
                .completionDateTime(authorisation.getCompletionDateTime());
    }

    public static OBAuthorisation1 toOBAuthorisation1(OBWriteDomesticConsent4DataAuthorisation authorisation) {
        return authorisation == null ? null : (new OBAuthorisation1())
                .authorisationType(authorisation.getAuthorisationType())
                .completionDateTime(authorisation.getCompletionDateTime());
    }
}
