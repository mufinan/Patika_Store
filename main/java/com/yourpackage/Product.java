package com.yourpackage;

public abstract class Product {
    private int id;
    private double price;
    private double discount;
    private int amount;
    private String name;
    private Brand brand;

    public Product(int id, double price, double discount, int amount, String name, Brand brand) {
        this.id = id;
        this.price = price;
        this.discount = discount;
        this.amount = amount;
        this.name = name;
        this.brand = brand;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }
}
