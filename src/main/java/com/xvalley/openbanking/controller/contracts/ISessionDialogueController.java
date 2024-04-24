package com.xvalley.openbanking.controller.contracts;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.xvalley.openbanking.models.contracts.sessions.*;

@RestController
@RequestMapping("/api/v1/SessionDialogue")
public interface ISessionDialogueController extends IBaseRestController {
    // Service contracts based on BIAN (Banking Industry Architecture Network)
    // Assuming you want to define contracts for Session Dialogue Service Domain

    // Initiate Session Dialogue
    @PostMapping("/initiateSessionDialogue")
    ResponseEntity<?> initiateSessionDialogue(@RequestBody InitiateSessionDialogueRequest request);

    // Update Session Dialogue
    @PutMapping("/updateSessionDialogue")
    ResponseEntity<?> updateSessionDialogue(@RequestBody UpdateSessionDialogueRequest request);

    // Retrieve Session Dialogue
    @GetMapping("/retrieveSessionDialogue")
    ResponseEntity<?> retrieveSessionDialogue(@RequestBody RetrieveSessionDialogueRequest request);

    // Notify Session Dialogue
    @PostMapping("/notifySessionDialogue")
    ResponseEntity<?> notifySessionDialogue(@RequestBody NotifySessionDialogueRequest request);

    // Request Session Dialogue
    @PostMapping("/requestSessionDialogue")
    ResponseEntity<?> requestSessionDialogue(@RequestBody RequestSessionDialogueRequest request);

    // Terminate Session Dialogue
    @PostMapping("/terminateSessionDialogue")
    ResponseEntity<?> terminateSessionDialogue(@RequestBody TerminateSessionDialogueRequest request);
}
