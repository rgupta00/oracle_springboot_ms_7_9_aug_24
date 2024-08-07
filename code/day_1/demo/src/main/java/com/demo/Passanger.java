package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "passanger")
public class Passanger {
	private Vehicle vehicle;

	@Autowired
	public Passanger(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void travel() {
		System.out.println("passage is traveling");
		vehicle.move();
	}
}
