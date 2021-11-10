package com.example.aprueba_gradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InitialController {
	
	    @GetMapping("/GET")
	    public String helloWorld() {
	        return "Hello, this is the gradle project working! ";
	    }

}
