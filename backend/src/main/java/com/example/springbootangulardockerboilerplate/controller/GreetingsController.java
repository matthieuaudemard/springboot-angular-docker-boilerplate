package com.example.springbootangulardockerboilerplate.controller;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/greetings")
@RestController
public class GreetingsController {

    @Getter
    @Builder
    public static class GreetingsDto {
        private String message;
    }

    @GetMapping
    public ResponseEntity<GreetingsDto> getApp() {
        return ResponseEntity.ok(GreetingsDto.builder().message("Hello World !").build());
    }

}
