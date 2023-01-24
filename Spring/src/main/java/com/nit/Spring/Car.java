package com.nit.Spring;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	
	public void drive() {
		System.out.println("driving car1");
	}
}
