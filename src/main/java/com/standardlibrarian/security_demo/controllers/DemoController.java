package com.standardlibrarian.security_demo.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello")
    public HttpEntity<?> hello() {
        return new HttpEntity<>("Hello, World!");
    }
    @GetMapping("/auth")
    public HttpEntity<?> auth() {
        var authentication = SecurityContextHolder.getContext().getAuthentication();
        return new HttpEntity<>(authentication.getAuthorities());
    }
}
