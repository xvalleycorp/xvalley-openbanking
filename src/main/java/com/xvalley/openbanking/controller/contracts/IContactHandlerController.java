package com.xvalley.openbanking.controller.contracts;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/ContactHandler")
public interface IContactHandlerController extends IBaseRestController {
    @GetMapping(value = {"/{contactHandlerId}", "/"})
    @ResponseBody
    ResponseEntity<Object> getContactHandler(@PathVariable(required = false) String contactHandlerId);

    @GetMapping("/Initiate")
    @ResponseBody
    ResponseEntity<Object> initiate();

    @GetMapping("/{contactHandlerId}/Execute")
    @ResponseBody
    ResponseEntity<Object> execute(@PathVariable String contactHandlerId);

    @GetMapping("/{contactHandlerId}/Update")
    @ResponseBody
    ResponseEntity<Object> update(@PathVariable String contactHandlerId);

    @GetMapping("/{contactHandlerId}/Request")
    @ResponseBody
    ResponseEntity<Object> request(@PathVariable String contactHandlerId);

    @GetMapping("/{contactHandlerId}/Retrieve")
    @ResponseBody
    ResponseEntity<Object> retrieve(@PathVariable String contactHandlerId);

    @GetMapping("/{contactHandlerId}/Authentication/{authenticationId}/Retrieve")
    @ResponseBody
    ResponseEntity<Object> retrieveAuthentication(@PathVariable String contactHandlerId, @PathVariable String authenticationId);

    @GetMapping("/contact-handler/{contactHandlerId}/authentication/{authenticationId}")
    ResponseEntity<Object> authentication(@PathVariable String contactHandlerId, @PathVariable String authenticationId);
}
