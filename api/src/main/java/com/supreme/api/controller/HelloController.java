package com.supreme.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hkrt
 */
@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello(){
        return "Hello ";
    }
}
