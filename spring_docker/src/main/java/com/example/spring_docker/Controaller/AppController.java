package com.example.spring_docker.Controaller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;  

@RestController
public class AppController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, AWS";
    }
}