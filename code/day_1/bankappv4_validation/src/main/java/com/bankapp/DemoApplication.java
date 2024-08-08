package com.bankapp;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.bankapp.dto.MyInfo;
import com.bankapp.repo.Account;
import com.bankapp.repo.AccountRepo;

@SpringBootApplication
//@EnableConfigurationProperties(MyInfo.class)
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private AccountRepo accountRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		accountRepo.save(new Account("raj", BigDecimal.valueOf(1000)));
		accountRepo.save(new Account("ekta", BigDecimal.valueOf(1000)));
		System.out.println("=====================Two accounts are added================================");
	}

}
