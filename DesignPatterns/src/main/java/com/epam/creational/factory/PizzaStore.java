package com.epam.creational.factory;

abstract class PizzaStore {
    public Pizza orderPizza() {
        Pizza pizza = createPizza();
        pizza.prepare();
        pizza.deliver();
        return pizza;
    }

    protected abstract Pizza createPizza();
}

