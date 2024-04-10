package com.xvalley.openbanking.controller.contracts;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public interface IContactHandlerController {
    @GetMapping(value = {"/ContactHandler", "/ContactHandler/{contactHandlerId}"})
    @ResponseBody
    ResponseEntity<Object> ContactHandler(@PathVariable(required = false) String contactHandlerId);

    @GetMapping("/ContactHandler/Initiate")
    @ResponseBody
    ResponseEntity<Object> Initiate();

    @GetMapping("/ContactHandler/{contactHandlerId}/Execute")
    @ResponseBody
    ResponseEntity<Object> Execute(@PathVariable String contactHandlerId);

    @GetMapping("/ContactHandler/{contactHandlerId}/Update")
    @ResponseBody
    ResponseEntity<Object> Update(@PathVariable String contactHandlerId);

    @GetMapping("/ContactHandler/{contactHandlerId}/Request")
    @ResponseBody
    ResponseEntity<Object> Request(@PathVariable String contactHandlerId);

    @GetMapping("/ContactHandler/{contactHandlerId}/Retrieve")
    @ResponseBody
    public ResponseEntity<Object> Retrieve(@PathVariable String contactHandlerId);

    @GetMapping("/ContactHandler/{contactHandlerId}/Authentication/{authenticationId}/Retrieve")
    @ResponseBody
    ResponseEntity<Object> Authentication(@PathVariable String contactHandlerId, @PathVariable String authenticationId);
}
