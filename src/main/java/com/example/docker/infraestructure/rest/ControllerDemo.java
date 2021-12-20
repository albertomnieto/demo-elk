package com.example.docker.infraestructure.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {
    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }

}
