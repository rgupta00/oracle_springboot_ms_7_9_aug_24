package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.repo.Account;
import com.bankapp.repo.AccountDao;
import com.bankapp.repo.AccountDaoDbImpl;
import com.bankapp.repo.AccountDaoMapImpl;
@Service
public class AccountServiceImpl implements AccountService{

	private AccountDao accountDao;
	
	//Spring framework simply create the object of dao layer and call this ctr
	//that is called DI
	@Autowired
	public AccountServiceImpl(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public List<Account> getAll() {
		return accountDao.getAll();
	}

	@Override
	public Account getById(int id) {
		return accountDao.getById(id);
	}

	@Override
	public void addAccount(Account account) {
		accountDao.addAccount(account);
	}

	@Override
	public void deleteAccount(int id) {
		accountDao.deleteAccount(id);
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
		
		accountDao.updateAccount(toAcc);
		accountDao.updateAccount(fromAcc);
		
	}

	@Override
	public void deposit(int accId, BigDecimal amount) {
		Account acc=getById(accId);
		acc.setBalance(acc.getBalance().add(amount));
		accountDao.updateAccount(acc);
	}

	@Override
	public void withdraw(int accId, BigDecimal amount) {
		Account acc=getById(accId);
		acc.setBalance(acc.getBalance().subtract(amount));
		accountDao.updateAccount(acc);
	}

}
