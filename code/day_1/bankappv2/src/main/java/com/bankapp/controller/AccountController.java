package com.bankapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.repo.Account;
import com.bankapp.service.AccountService;

@RestController
public class AccountController {

	private AccountService accountService;
	
	@Autowired
	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}
	@GetMapping(path = "hello")
	public String hello() {
		return "welcome all java champs!";
	}
	//get all the accounts : json data
	@GetMapping(path="accounts")
	public List<Account> getAll(){
		return accountService.getAll();
	}
}
