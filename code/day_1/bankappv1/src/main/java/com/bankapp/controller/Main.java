package com.bankapp.controller;

import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bankapp.AppConfig;
import com.bankapp.repo.Account;
import com.bankapp.service.AccountService;
import com.bankapp.service.AccountServiceImpl;

public class Main {

	public static void main(String[] args) {
		//without spring 
//		AccountService accountService=new AccountServiceImpl();
//		List<Account> accounts=accountService.getAll();
//		for(Account a: accounts) {
//			System.out.println(a);
//		}
		
		AnnotationConfigApplicationContext 
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AccountService accountService=
				ctx.getBean("accountServiceImpl",AccountService.class);
		List<Account> accounts=accountService.getAll();
		for(Account a: accounts) {
			System.out.println(a);
		}
	}
}
