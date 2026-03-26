package com.ci.springboot_cicd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

@GetMapping("/test")
public ResponseEntity<String> hello(){
    return ResponseEntity.ok("HI! We are testing the pipeline code.");
}
}
