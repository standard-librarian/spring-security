package com.standardlibrarian.security_demo.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello")
    public HttpEntity<?> hello() {
        return new HttpEntity<>("Hello, World!");
    }
}
