package com.example.helloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class HelloWorldController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
    @GetMapping(value = "/hello-world")
    public ResponseEntity<?> returnHelloWorld(){

        logger.info("Within hello world controller");
        return ResponseEntity.ok("Hello world hema");
    }
}
