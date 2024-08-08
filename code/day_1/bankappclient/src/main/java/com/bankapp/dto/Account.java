package com.bankapp.dto;

import java.math.BigDecimal;

//DTO: used to tranfer data bw the layers
//i will make it entity : JPA

public class Account {
	
	private int id;
	

	
	private String name;

	private BigDecimal balance;
	

	public Account() {}
	
	public Account(String name, BigDecimal balance) {
		this.name = name;
		this.balance = balance;
	}


	public Account(int id, String name, BigDecimal balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
