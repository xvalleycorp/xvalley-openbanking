package com.xvalley.openbanking.models.contracts.sessions;

import lombok.Data;

/**
 * This class represents a request to update a session dialogue.
 */
@Data
public class UpdateSessionDialogueRequest {
    /**
     * The reference of the session dialogue instance.
     */
    private String sessionDialogueInstanceReference;

    /**
     * The type of the session dialogue.
     */
    private String sessionDialogueType;

    /**
     * The subject matter of the session dialogue.
     */
    private String sessionDialogueSubjectMatter;

    /**
     * The location of the session dialogue.
     */
    private String sessionDialogueLocation;

    /**
     * The start date and time of the session dialogue.
     */
    private String sessionDialogueStartDateTime;

    /**
     * The end date and time of the session dialogue.
     */
    private String sessionDialogueEndDateTime;

    /**
     * The result of the session dialogue.
     */
    private String sessionDialogueResult;

    /**
     * The ID of the session.
     */
    private String sessionId;
}
