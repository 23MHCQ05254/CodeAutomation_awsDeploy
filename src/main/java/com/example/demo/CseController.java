package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {

    @GetMapping("/home")
    public String rocks() {
        return "Hi! this is Joseph";
    }

    @GetMapping("/cse")
    public String rocks1() {
        return "Welcome to Third year cse";
    }
}