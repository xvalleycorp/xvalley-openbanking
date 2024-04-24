package com.xvalley.openbanking.models.contracts.sessions;

import lombok.Data;

/**
 * Represents a request to notify a session dialogue.
 */
@Data
public class NotifySessionDialogueRequest {
    /**
     * The reference to the session dialogue instance.
     */
    private String sessionDialogueInstanceReference;

    /**
     * The reference to the session dialogue notification.
     */
    private String sessionDialogueNotificationReference;

    /**
     * The type of the session dialogue notification.
     */
    private String sessionDialogueNotificationType;

    /**
     * The description of the session dialogue notification.
     */
    private String sessionDialogueNotificationDescription;

    /**
     * The session ID.
     */
    private String sessionId;
}
