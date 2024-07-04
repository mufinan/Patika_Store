package com.yourpackage;

public class Phone extends Product {
    private int memory;
    private double screenSize;
    private int battery;
    private int ram;

    public Phone(int id, double price, double discount, int amount, String name, Brand brand, int memory, double screenSize, int battery, int ram) {
        super(id, price, discount, amount, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.battery = battery;
        this.ram = ram;
    }

    // Getters and Setters
    public int getMemory() {
        return memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public int getRam() {
        return ram;
    }
}
