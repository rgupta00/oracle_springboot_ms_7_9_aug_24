package com.bankapp.controller;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.repo.Account;
import com.bankapp.service.AccountService;

import jakarta.validation.Valid;

@RestController
public class AccountController {

	private AccountService accountService;
	
	@Autowired
	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	//get all the accounts : json data
	@GetMapping(path="accounts")
	public List<Account> getAll(){
//		if(1==1)
//			throw new RuntimeException("some ex");
		return accountService.getAll();
	}

	//get an particular account
	//how to return correct status code, how to give error in better way: gracefull ex handing
	@GetMapping(path="accounts/{id}")
	public Account getById(@PathVariable int id) {
		return accountService.getById(id);
	}
	
	
	
	
	
	//transfer, how json convert to dto(java ob): parser: jackson parsor
	//i need to trigger that parser
	@PostMapping(path="accounts/transfer")
	public String transfer(@RequestBody  TransferDto dto) {
		accountService.transfer(dto.getFromId(), dto.getToId(), dto.getAmount());
		return "fund is transfred successfully";
	}
	
	//deposit
	@PostMapping(path="accounts/deposit")
	public String deposit(@RequestBody  DepositDto dto) {
		accountService.deposit(dto.getAccId(), dto.getAmount());
		return "fund is deposit successfully";
	}
	
	//withdraw
	
	@PostMapping(path="accounts/withdraw")
	public String withdraw(@RequestBody  WithdrawDto dto) {
		accountService.withdraw(dto.getAccId(), dto.getAmount());
		return "fund is withdrawn successfully";
	}
	
	//update
	
	//add account
	@PostMapping(path="accounts")
	public ResponseEntity<String> addAccount(@RequestBody @Valid Account account) {
		accountService.addAccount(account);
		return ResponseEntity.status(HttpStatus.CREATED).body("new account is created");
	}
	
	//delete an account
	
	@DeleteMapping(path="accounts/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable int id) {
		 accountService.deleteAccount(id);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}







