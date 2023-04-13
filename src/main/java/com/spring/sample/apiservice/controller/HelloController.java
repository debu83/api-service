package com.spring.sample.apiservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/health")
    public String hello() {
        return "Hello I am healthy !!";
    }
	
	@GetMapping("/home")
    public String home() {
        return "Hello this is our home page!!";
    }
	
	@GetMapping("/about")
    public String about() {
        return "Hello this is our about page !!";
    }
}
