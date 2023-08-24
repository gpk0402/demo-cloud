package com.epam.creational.factory;

public class CheesePizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza() {
		System.out.println("Creating CheesePizza");
		return new CheesePizza();
	}

}
