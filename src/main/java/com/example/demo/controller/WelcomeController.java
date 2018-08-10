package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@RequestMapping ("/hello")
	public String hello() {
		return "Hi, Welcome to PCF";
	}

}
