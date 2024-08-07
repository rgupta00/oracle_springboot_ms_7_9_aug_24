package com.bankapp.dto;

import java.math.BigDecimal;

public class TransferDto {
	private int fromId;
	private int toId;
	private BigDecimal amount;
	
	public int getFromId() {
		return fromId;
	}
	public void setFromId(int fromId) {
		this.fromId = fromId;
	}
	public int getToId() {
		return toId;
	}
	public void setToId(int toId) {
		this.toId = toId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public TransferDto(int fromId, int toId, BigDecimal amount) {
		super();
		this.fromId = fromId;
		this.toId = toId;
		this.amount = amount;
	}
	public TransferDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
