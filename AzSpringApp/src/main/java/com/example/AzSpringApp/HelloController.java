package com.example.AzSpringApp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "successfully deployed my spring app to Azure App Service!";
    }
}

