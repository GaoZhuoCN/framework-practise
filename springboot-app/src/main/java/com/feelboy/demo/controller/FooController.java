package com.feelboy.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

	@RequestMapping("/")
	String home() {
		return "Hello World!！";
	}
}
