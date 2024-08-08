package com.bankapp.repo;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

//DTO: used to tranfer data bw the layers
//i will make it entity : JPA
@Entity
@Table(name="account_table")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	@NotNull(message = "{account.name.absent}")
	@Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*", message = "{account.name.invalid}")
	@Column(name="account_name")
	
	private String name;
	@Column(name="account_balance")
	
	@NotNull(message = "{account.balance.absent}")
	@Range(min = 100, max = 100000, message = "{account.balance.invalid}")
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
