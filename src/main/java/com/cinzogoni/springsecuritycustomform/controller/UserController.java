package com.cinzogoni.springsecuritycustomform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class UserController {

    @GetMapping("/users")
    public String user(@RequestParam(value = "user", defaultValue = "World") String name ) {
        return String.format("User Hello %s!",name);
    }
}
