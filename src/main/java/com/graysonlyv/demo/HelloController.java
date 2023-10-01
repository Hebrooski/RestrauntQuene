package com.graysonlyv.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

	//default route for domain
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
