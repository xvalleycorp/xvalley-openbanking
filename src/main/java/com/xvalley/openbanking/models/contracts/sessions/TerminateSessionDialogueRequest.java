package com.xvalley.openbanking.models.contracts.sessions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a request to terminate a session dialogue.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TerminateSessionDialogueRequest {
    /**
     * The reference to the session dialogue instance.
     */
    private String sessionDialogueInstanceReference;

    /**
     * The reason for terminating the session dialogue.
     */
    private String sessionDialogueTerminationReason;

    /**
     * The session ID.
     */
    private String sessionId;
}
