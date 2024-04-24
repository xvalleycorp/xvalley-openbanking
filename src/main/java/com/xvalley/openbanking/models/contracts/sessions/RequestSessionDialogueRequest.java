package com.xvalley.openbanking.models.contracts.sessions;

import lombok.Data;

@Data
public class RequestSessionDialogueRequest {
    private String sessionDialogueInstanceReference;
    private String customerReference;
    private String employeeReference;
    private String sessionDialogueRequestType;
    private String sessionDialogueRequestDescription;
    private String sessionId;
}