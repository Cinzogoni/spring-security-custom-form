package com.cinzogoni.springsecuritycustomform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping("/admin")
    public String admin(@RequestParam(value = "admin", defaultValue = "World") String name ) {
        return String.format("Admin Hello %s!",name);
    }
}
