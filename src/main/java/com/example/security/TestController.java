package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hi")
    public String hi() {
        return "hi controll";
    }

    @GetMapping("/hello")
    public String hello() {
        return "HELLO COINTROLLLL";
    }

    @GetMapping("/bye")
    public  String bye() {
        return "Bye controlll";
    }
}
