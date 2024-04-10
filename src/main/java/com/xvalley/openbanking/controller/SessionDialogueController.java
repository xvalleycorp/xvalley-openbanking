package com.xvalley.openbanking.controller;

import com.xvalley.openbanking.controller.contracts.ISessionDialogueController;
import com.xvalley.openbanking.models.repositories.IDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class SessionDialogueController implements ISessionDialogueController {
    private final IDemoRepository demoRepository;

    @Autowired
    public SessionDialogueController(IDemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }
}
