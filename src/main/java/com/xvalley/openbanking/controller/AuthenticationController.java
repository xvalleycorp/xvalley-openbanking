package com.xvalley.openbanking.controller;

import com.xvalley.openbanking.controller.contracts.IAuthenticationController;
import com.xvalley.openbanking.models.contracts.auth.AuthenticationRequest;
import com.xvalley.openbanking.models.contracts.auth.AuthenticationResponse;
import com.xvalley.openbanking.auth.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class AuthenticationController implements IAuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    /**
     * Authenticates a user based on the provided request.
     *
     * @param request The authentication request containing user credentials.
     * @return A ResponseEntity containing the authentication response.
     */
    @Override
    public ResponseEntity<AuthenticationResponse> authenticate(AuthenticationRequest request) {
        AuthenticationResponse response = authenticationService.authenticate(request);
        return ResponseEntity.ok(response);
    }

    /**
     * Refreshes the authentication token based on the provided authorization header.
     *
     * @param authorizationHeader The authorization header containing the refresh token.
     * @return A ResponseEntity containing the updated authentication response.
     */
    @Override
    public ResponseEntity<AuthenticationResponse> refreshToken(String authorizationHeader) {
        AuthenticationResponse response = authenticationService.refreshToken(authorizationHeader);
        return ResponseEntity.ok(response);
    }

    /**
     * Logs out the user based on the provided authorization header.
     *
     * @param authorizationHeader The authorization header containing the access token.
     * @return A ResponseEntity indicating a successful logout.
     */
    @Override
    public ResponseEntity<Void> logout(String authorizationHeader) {
        authenticationService.logout(authorizationHeader);
        return ResponseEntity.ok().build();
    }
}
