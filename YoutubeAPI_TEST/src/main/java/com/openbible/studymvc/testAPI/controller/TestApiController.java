package com.openbible.studymvc.testAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {
	
	@GetMapping("/test")
	public String test() {
		return "test() 실행";
	}
}
