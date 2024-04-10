package com.xvalley.openbanking.controller.contracts;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/ContactHandler")
public interface IContactHandlerController extends IBaseRestController {
    @GetMapping(value = {"/", "/{contactHandlerId}"})
    @ResponseBody
    ResponseEntity<Object> ContactHandler(@PathVariable(required = false) String contactHandlerId);

    @GetMapping("/Initiate")
    @ResponseBody
    ResponseEntity<Object> Initiate();

    @GetMapping("/{contactHandlerId}/Execute")
    @ResponseBody
    ResponseEntity<Object> Execute(@PathVariable String contactHandlerId);

    @GetMapping("/{contactHandlerId}/Update")
    @ResponseBody
    ResponseEntity<Object> Update(@PathVariable String contactHandlerId);

    @GetMapping("/{contactHandlerId}/Request")
    @ResponseBody
    ResponseEntity<Object> Request(@PathVariable String contactHandlerId);

    @GetMapping("/{contactHandlerId}/Retrieve")
    @ResponseBody
    public ResponseEntity<Object> Retrieve(@PathVariable String contactHandlerId);

    @GetMapping("/{contactHandlerId}/Authentication/{authenticationId}/Retrieve")
    @ResponseBody
    ResponseEntity<Object> Authentication(@PathVariable String contactHandlerId, @PathVariable String authenticationId);
}
