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
@RequestMapping("/api/v1")
public class ContactHandlerController implements IContactHandlerController {
    private final IDemoRepository demoRepository;

    /*
        Constructor
    */
    @Autowired
    public ContactHandlerController(IPersistence persistence)
    {
        super();
        this.demoRepository = persistence.GetDemoRepository();
    }

    @Override
    public ResponseEntity<Object> ContactHandler(@PathVariable(required = false) String contactHandlerId){
        Map<String, Object> result = new HashMap<>();
       result.put("contactHandlerId", contactHandlerId);
       result.put("actionTerm","Default");
       result.put("status","Success");
       result.put("code",200);
       result.put("message","Welcome to xValley OpenBanking!");
       return new ResponseEntity<Object>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Object> Initiate(){
        Map<String, Object> result = new HashMap<>();
        result.put("contactHandlerId", demoRepository.GetRandomNumber());
        result.put("actionTerm","Initiate");
        result.put("status","Success");
        result.put("code",200);
        result.put("message","Welcome to xValley OpenBanking!");
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Object> Execute(@PathVariable String contactHandlerId){
        Map<String, Object> result = new HashMap<>();
        result.put("contactHandlerId", contactHandlerId);
        result.put("actionTerm","Execute");
        result.put("status","Success");
        result.put("code",200);
        result.put("message","Welcome to xValley OpenBanking!");
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Object> Update(@PathVariable String contactHandlerId){
        Map<String, Object> result = new HashMap<>();
        result.put("contactHandlerId", contactHandlerId);
        result.put("actionTerm","Update");
        result.put("status","Success");
        result.put("code",200);
        result.put("message","Welcome to xValley OpenBanking!");
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Object> Request(@PathVariable String contactHandlerId){
        Map<String, Object> result = new HashMap<>();
        result.put("contactHandlerId", contactHandlerId);
        result.put("actionTerm","Request");
        result.put("status","Success");
        result.put("code",200);
        result.put("message","Welcome to xValley OpenBanking!");
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Object> Retrieve(@PathVariable String contactHandlerId){
        Map<String, Object> result = new HashMap<>();
        result.put("contactHandlerId", contactHandlerId);
        result.put("actionTerm","Retrieve");
        result.put("status","Success");
        result.put("code",200);
        result.put("message","Welcome to xValley OpenBanking!");
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Object> Authentication(@PathVariable String contactHandlerId, @PathVariable String authenticationId){
        Map<String, Object> result = new HashMap<>();
        result.put("contactHandlerId", contactHandlerId);
        result.put("authenticationId", authenticationId);
        result.put("actionTerm","Authentication/Retrieve");
        result.put("status","Success");
        result.put("code",200);
        result.put("message","Welcome to xValley OpenBanking!");
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }
}
