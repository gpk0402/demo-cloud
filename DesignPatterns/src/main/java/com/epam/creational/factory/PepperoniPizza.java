package com.epam.creational.factory;

public class PepperoniPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing Pepperoni Pizza");

	}

	@Override
	public void deliver() {
		System.out.println("Delivering Pepperoni Pizza");

	}

}
