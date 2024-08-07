package com.bankapp.repo;

import java.math.BigDecimal;
import java.util.*;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
@Repository
public class AccountDaoDbImpl implements AccountDao {
	private Map<Integer, Account> accounts = new HashMap<>();

	public AccountDaoDbImpl() {
		accounts.put(1, new Account(1, "raj", BigDecimal.valueOf(1000.00)));
		accounts.put(2, new Account(2, "ekta", BigDecimal.valueOf(1000.00)));
	}

	@Override
	public List<Account> getAll() {
		System.out.println("getAll using database...");
		return new ArrayList<Account>(accounts.values());
	}

	@Override
	public Account getById(int id) {
		return accounts.get(id);
	}

	@Override
	public void updateAccount(Account account) {
		accounts.put(account.getId(), account);
	}

	@Override
	public void addAccount(Account account) {
		
	}

	@Override
	public void deleteAccount(int id) {
		
	}

}
