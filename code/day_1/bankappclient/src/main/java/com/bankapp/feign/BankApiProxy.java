package com.bankapp.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bankapp.dto.Account;
//Who will implement this interface: openfeign 
@FeignClient(name="bankapp", url = "http://localhost:8080")
public interface BankApiProxy {
	@GetMapping(path="accounts/{id}")
	public Account getById(@PathVariable int id);
}
