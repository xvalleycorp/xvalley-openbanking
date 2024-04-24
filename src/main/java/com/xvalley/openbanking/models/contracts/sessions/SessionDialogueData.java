package com.xvalley.openbanking.models.contracts.sessions;

import lombok.Data;

@Data
public class SessionDialogueData {
    private String sessionDialogueInstanceReference;
    private String sessionDialogueInstanceStatus;
    private String sessionDialogueInstanceUsageLog;
    private String sessionDialogueInstanceType;
    private String sessionDialogueInstanceServiceProviderReference;
    private String sessionDialogueInstanceServiceProviderSchedule;
    private String sessionDialogueInstanceServiceType;
    private String sessionDialogueInstanceServiceConfiguration;
    private String sessionDialogueInstanceServiceRequest;
    private String sessionDialogueInstanceServiceResponse;
}
