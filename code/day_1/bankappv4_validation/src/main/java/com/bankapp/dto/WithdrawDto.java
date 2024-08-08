package com.bankapp.dto;

import java.math.BigDecimal;

public class WithdrawDto {
	private int accId;
	private BigDecimal amount;
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
}
