package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.services.ProduceService;

@RestController
public class ProductController {

	@Autowired
	private ProduceService produceService;
	@GetMapping("producer")
	public String callProducer(@RequestParam String message) {
		produceService.produce(message);
		return "ok";
	}
}
