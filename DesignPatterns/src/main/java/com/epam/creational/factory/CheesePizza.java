package com.epam.creational.factory;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing Cheese Pizza");

	}

	@Override
	public void deliver() {
		System.out.println("Delivering Cheese Pizza");

	}

}
