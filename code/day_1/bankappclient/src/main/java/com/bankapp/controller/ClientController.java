package com.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bankapp.dto.Account;
import com.bankapp.feign.BankApiProxy;

@RestController
public class ClientController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private BankApiProxy apiProxy;
	
	
	@GetMapping("getaccount/{id}")
	public Account getAccountById(@PathVariable int id) {
//		return restTemplate.
//				getForObject("http://localhost:8080/accounts/"+ id, Account.class);
		return apiProxy.getById(id);
	}
}
