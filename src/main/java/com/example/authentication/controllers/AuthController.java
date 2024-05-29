package com.example.authentication.controllers;

import com.example.authentication.services.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }
    @PostMapping("/signup")
    public void signup() {}

    @PostMapping("/login")
    public void login() {}

    @PostMapping("/validate")
    public void validate() {}
}
