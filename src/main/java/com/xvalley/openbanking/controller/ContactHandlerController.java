package com.xvalley.openbanking.controller;

import com.xvalley.openbanking.controller.contracts.IContactHandlerController;
import com.xvalley.openbanking.models.persistence.IPersistence;
import com.xvalley.openbanking.models.repositories.IDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ContactHandlerController implements IContactHandlerController {
    private final IDemoRepository demoRepository;

    @Autowired
    public ContactHandlerController(IPersistence persistence) {
        this.demoRepository = persistence.GetDemoRepository();
    }

    private ResponseEntity<Object> buildResponse(String contactHandlerId, String actionTerm) {
        Map<String, Object> result = new HashMap<>();
        result.put("contactHandlerId", contactHandlerId);
        result.put("actionTerm", actionTerm);
        result.put("status", "Success");
        result.put("code", HttpStatus.OK.value());
        result.put("message", "Welcome to xValley OpenBanking!");
        return ResponseEntity.ok(result);
    }

    @GetMapping("/contact-handler/{contactHandlerId}")
    public ResponseEntity<Object> contactHandler(@PathVariable(required = false) String contactHandlerId) {
        return buildResponse(contactHandlerId, "Default");
    }

    @Override
    public ResponseEntity<Object> getContactHandler(String contactHandlerId) {
        return buildResponse(contactHandlerId, "Get");
    }

    @Override
    @GetMapping("/contact-handler/initiate")
    public ResponseEntity<Object> initiate() {
        return buildResponse(String.valueOf(demoRepository.GetRandomNumber()), "Initiate");
    }

    @Override
    @GetMapping("/contact-handler/{contactHandlerId}/execute")
    public ResponseEntity<Object> execute(@PathVariable String contactHandlerId) {
        return buildResponse(contactHandlerId, "Execute");
    }

    @Override
    @PutMapping("/contact-handler/{contactHandlerId}/update")
    public ResponseEntity<Object> update(@PathVariable String contactHandlerId) {
        return buildResponse(contactHandlerId, "Update");
    }

    @Override
    @PostMapping("/contact-handler/{contactHandlerId}/request")
    public ResponseEntity<Object> request(@PathVariable String contactHandlerId) {
        return buildResponse(contactHandlerId, "Request");
    }

    @Override
    @GetMapping("/contact-handler/{contactHandlerId}/retrieve")
    public ResponseEntity<Object> retrieve(@PathVariable String contactHandlerId) {
        return buildResponse(contactHandlerId, "Retrieve");
    }

    @Override
    public ResponseEntity<Object> retrieveAuthentication(String contactHandlerId, String authenticationId) {
        Map<String, Object> result = new HashMap<>();
        result.put("contactHandlerId", contactHandlerId);
        result.put("authenticationId", authenticationId);
        result.put("actionTerm", "Authentication/Retrieve");
        result.put("status", "Success");
        result.put("code", HttpStatus.OK.value());
        result.put("message", "Welcome to xValley OpenBanking!");
        return ResponseEntity.ok(result);
    }

    @Override
    @GetMapping("/contact-handler/{contactHandlerId}/authentication/{authenticationId}")
    public ResponseEntity<Object> authentication(@PathVariable String contactHandlerId, @PathVariable String authenticationId) {
        return retrieveAuthentication(contactHandlerId, authenticationId);
    }
}
