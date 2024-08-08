package com.bankapp.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bankapp.dto.ErrorInfo;
import com.bankapp.exceptions.BankAccountNotFoundException;

//handler for ex handling
@RestControllerAdvice
public class ExHandlerController {

	@ExceptionHandler(BankAccountNotFoundException.class)
	public ResponseEntity<ErrorInfo> handle404(BankAccountNotFoundException ex){
		ErrorInfo errorInfo=new ErrorInfo("raj@ora.com", LocalDateTime.now(), ex.getMessage(), 
				HttpStatus.NOT_FOUND.toString());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorInfo);
	}
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<ErrorInfo> handle500(Exception ex){
//		ErrorInfo errorInfo=new ErrorInfo("raj@ora.com", LocalDateTime.now(), "pls try after some time", 
//				HttpStatus.INTERNAL_SERVER_ERROR.toString());
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorInfo);
//	}
}
