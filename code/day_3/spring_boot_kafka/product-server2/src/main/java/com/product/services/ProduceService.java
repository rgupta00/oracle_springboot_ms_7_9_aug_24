package com.product.services;

import com.product.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class ProduceService {

	@Autowired
	private KafkaTemplate<String, String>kafkaTemplate;
	
	public void produce(String message) {
		System.out.println("message is send....");
		kafkaTemplate.send("t-hello2", message);
	}
}
