package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class Car  implements Vehicle{
	public void move() {
		System.out.println("moving in a car");
	}
}
