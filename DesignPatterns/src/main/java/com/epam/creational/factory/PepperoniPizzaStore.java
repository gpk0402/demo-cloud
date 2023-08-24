package com.epam.creational.factory;

public class PepperoniPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza() {
		System.out.println("Creating PepperoniPizza");
		return new PepperoniPizza();
	}

}
