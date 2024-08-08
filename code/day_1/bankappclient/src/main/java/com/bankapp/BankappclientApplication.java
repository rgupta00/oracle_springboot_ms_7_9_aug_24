package com.bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients("com.bankapp.feign")
@SpringBootApplication
public class BankappclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankappclientApplication.class, args);
	}

	//RestTemplate: 
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
