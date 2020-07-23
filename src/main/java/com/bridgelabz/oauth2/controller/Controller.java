package com.bridgelabz.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Controller {

    @GetMapping("/")
    public String sayHello() {
        return "Hello Bridgelabz";
    }

    @GetMapping("/restricted")
    public String restrictedMessage(Principal principal) {
        return "Hi, " + principal.toString() + " you are successfully logged in!!";
    }
}
