package com.xvalley.openbanking.models.contracts.sessions;

import lombok.Data;

/**
 * Represents a request to retrieve a session dialogue.
 */
@Data
public class RetrieveSessionDialogueRequest {
    /**
     * The reference of the session dialogue instance.
     */
    private String sessionDialogueInstanceReference;

    /**
     * The reference of the customer associated with the session dialogue.
     */
    private String customerReference;

    /**
     * The reference of the employee associated with the session dialogue.
     */
    private String employeeReference;

    /**
     * The unique identifier of the session.
     */
    private String sessionId;
}
