package com.epam.creational.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Product product1 = Product.getInstance();
        Product product2 = Product.getInstance();

        System.out.println("Product1 name: " + product1.getName());
        System.out.println("Product1 price: " + product1.getPrice());

        product2.setName("New Product");
        product2.setPrice(99.99);

        System.out.println("Product1 name after update using product2: " + product1.getName());
        System.out.println("Product1 price after update using product2:: " + product1.getPrice());
    }
}

