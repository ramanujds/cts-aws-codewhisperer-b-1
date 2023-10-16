package com.cts.quarkus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.quarkus.model.User;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String hello() {
        return "Hello Spring";
    }
    
    @GetMapping("/user")
    public User getUser() {
    	User user = new User("Harsh", "harsh@yahoo.com", 1996);
    	return user;
    	
    }
}
