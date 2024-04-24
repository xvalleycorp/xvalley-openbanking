package com.xvalley.openbanking.controller.contracts;

import com.xvalley.openbanking.models.contracts.auth.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/Authentication")
public interface IAuthenticationController extends IBaseRestController {

    @PostMapping("/authenticate")
    ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request);

    @PostMapping("/refresh")
    ResponseEntity<AuthenticationResponse> refreshToken(@RequestHeader("Authorization") String authorizationHeader);

    @DeleteMapping("/logout")
    ResponseEntity<Void> logout(@RequestHeader("Authorization") String authorizationHeader);
}
