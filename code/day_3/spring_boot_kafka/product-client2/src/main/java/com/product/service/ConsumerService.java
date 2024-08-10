package com.product.service;

import com.product.dto.Product;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
	@KafkaListener(topics = "t-hello2", groupId = "my_topic_group_id")
	public void consume(String message) {
		System.out.println("---------------------------------------");
		System.out.println(message);
	}
}
