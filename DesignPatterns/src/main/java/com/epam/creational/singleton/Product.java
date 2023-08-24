package com.epam.creational.singleton;

public class Product {
    private static Product instance;
    private String name;
    private double price;

    private Product() {
        name = "Default Product";
        price = 0.0;
    }

    public static Product getInstance() {
        if (instance == null) {
            synchronized (Product.class) {
                if (instance == null) {
                    instance = new Product();
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

