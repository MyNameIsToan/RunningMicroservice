package com.runningmicroservice.service2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/")
	public String Hello() {
		return "Hello Service 2";
	}
}
