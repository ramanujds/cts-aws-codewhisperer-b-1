package com.cts.springoauth.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestApi {

    @GetMapping
    public String sayHello() {
        return "Hello Everyone";
    }

}