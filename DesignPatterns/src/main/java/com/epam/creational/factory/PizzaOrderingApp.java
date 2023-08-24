package com.epam.creational.factory;

public class PizzaOrderingApp {
    public static void main(String[] args) {
        PizzaStore cheesePizzaStore = new CheesePizzaStore();
        PizzaStore pepperoniPizzaStore = new PepperoniPizzaStore();

        Pizza cheesePizza = cheesePizzaStore.orderPizza();
        System.out.println();

        Pizza pepperoniPizza = pepperoniPizzaStore.orderPizza();
        // ...
    }
}

