package com.ani.ecr.controller;

import com.ani.ecr.doman.AppRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "hi")
@RestController
public class HelloWorldController {
    @GetMapping
    public ResponseEntity<AppRes> hi() {
        return ResponseEntity.ok(
                AppRes.builder()
                        .msg("Hello World --> how are you")
                        .sts("success")
                        .build()
        );
    }
}
