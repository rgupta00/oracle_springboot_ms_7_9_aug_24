package com.bankapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping(path = "hello")
	public String hello() {
		return "welcome all java champs!";
	}
}
