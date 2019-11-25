package com.supreme.comsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Hkrt
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/helloConsumer")
    public String helloConsumer(){
        return restTemplate.getForEntity("http://api/hello",String.class).getBody();
    }
}
