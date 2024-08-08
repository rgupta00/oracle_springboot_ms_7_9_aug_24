package com.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dto.MyInfo;

@RestController
public class HelloController {

//	@Value("${my.val}")
//	private String val;
//	
//	@Value("${my.info}")
//	private String info;
//	
//	@GetMapping(path="hello")
//	public String hello() {
//		return val+": "+ info;
//	}
	
	
	@Autowired
	private MyInfo info;
	
	@GetMapping(path="hello")
	public String hello() {
		return info.getVal()+": "+ info.getInfo();
	}
}
