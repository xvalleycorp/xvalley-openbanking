package com.xvalley.openbanking.models.contracts.sessions;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InitiateSessionDialogueRequest {
    private String sessionDialogueInstanceReference;
    private String customerReference;
    private String employeeReference;
    private String sessionDialogueType;
    private String sessionDialogueSubjectMatter;
    private String sessionDialogueLocation;
    private String sessionDialogueStartDateTime;
    private String sessionDialogueEndDateTime;
    private String sessionDialogueResult;
}
