package com.example.springbootangulardockerboilerplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/greetings")
@RestController
public class GreetingsController {

    @GetMapping
    public String getApp() {
        return "Hello World";
    }

}
