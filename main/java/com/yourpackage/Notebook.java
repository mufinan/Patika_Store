package com.yourpackage;

public class Notebook extends Product {
    private int memory;
    private double screenSize;
    private int ram;

    public Notebook(int id, double price, double discount, int amount, String name, Brand brand, int memory, double screenSize, int ram) {
        super(id, price, discount, amount, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    // Getters and Setters
    public int getMemory() {
        return memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getRam() {
        return ram;
    }
}
