package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.repo.Account;
import com.bankapp.repo.AccountRepo;
@Service
public class AccountServiceImpl implements AccountService{

	private AccountRepo repo;
	
	@Autowired
	public AccountServiceImpl(AccountRepo repo) {
		this.repo = repo;
	}
	
	@Override
	public List<Account> getAll() {
		return repo.findAll();
	}

	@Override
	public Account getById(int id) {
		Account account= repo.findById(id)
				.orElseThrow(()-> new BankAccountNotFoundException("account with id "+ id +" is not found"));

		return account;
	}

	@Override
	public void addAccount(Account account) {
		repo.save(account);
	}

	@Override
	public void deleteAccount(int id) {
		Account accountToDelete=getById(id);
		repo.delete(accountToDelete);
	}

	@Override
	public void transfer(int fromAccId, int toAccId, BigDecimal amount) {
		//load both the accounts
		Account fromAcc=getById(fromAccId);
		Account toAcc=getById(toAccId);
		
		//minus from one one account
		fromAcc.setBalance(fromAcc.getBalance().subtract(amount));
		
		//add to another acc
		toAcc.setBalance(toAcc.getBalance().add(amount));
		
		repo.save(toAcc);
		repo.save(fromAcc);
		
	}

	@Override
	public void deposit(int accId, BigDecimal amount) {
		Account acc=getById(accId);
		acc.setBalance(acc.getBalance().add(amount));
		repo.save(acc);
	}

	@Override
	public void withdraw(int accId, BigDecimal amount) {
		Account acc=getById(accId);
		acc.setBalance(acc.getBalance().subtract(amount));
		repo.save(acc);
	}

}
