package com.bankapp.dto;

import java.time.LocalDateTime;

public class ErrorInfo {

	private String toContact;
	private LocalDateTime dateTime;
	private String error;
	private String status;
	
	public String getToContact() {
		return toContact;
	}
	public void setToContact(String toContact) {
		this.toContact = toContact;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ErrorInfo(String toContact, LocalDateTime dateTime, String error, String status) {
		super();
		this.toContact = toContact;
		this.dateTime = dateTime;
		this.error = error;
		this.status = status;
	}
	public ErrorInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
