package com.stakater.task.controller;

import static org.springframework.http.ResponseEntity.status;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/api/v1/hello")
	public ResponseEntity<String> sayHello() {

		///System.out.println("inside the sayHello method , rest call was successfull");
		return status(HttpStatus.OK).body("Hello Vinay!");
		

	}

}
