package com.implants.demo.controller;

import com.implants.demo.dto.SignInRequest;
import com.implants.demo.dto.JwtResponse;
import com.implants.demo.service.AuthService;
import com.implants.demo.util.JwtTokenProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @PostMapping("/signin")
    public JwtResponse signIn(@RequestBody SignInRequest signInRequest) {
        // Authenticate the user
        String token = authService.authenticateUser(signInRequest.getUsername(), signInRequest.getPassword());

        // Extract userId from the JWT token
        String userId = jwtTokenProvider.getUserIdFromToken(token);
        String role = jwtTokenProvider.getRoleFromToken(token);

        // Determine the role of the user and set the redirect URL
        String redirectUrl;

        if ("patient".equals(role)) {
            redirectUrl = "/patients/" + userId;
        } else {
            redirectUrl = "/patients";
        }

        // Return the response with message, redirect URL, and token
        return new JwtResponse("Login successful", redirectUrl, token, role);
    }
}
