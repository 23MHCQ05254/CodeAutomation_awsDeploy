package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {

    @GetMapping("/home")
    public String rocks() {
        return "Hi! this is Joseph , it was designed by 23MH1A05H0";
    }

    @GetMapping("/cse")
    public String rocks1() {
        return "this is joseph";
    }
}
