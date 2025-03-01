package dev.lpa;

public abstract class Item {

    protected String name;
    protected String type;
    protected String brand;
    protected double price;

    public Item(String name, String type, String brand) {
        this.name = name;
        this.type = type;
        this.brand = brand;
    }

    public Item() {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public abstract double itemPrice();
    public abstract String itemName();
    @Override
    public abstract String toString();

    public double brandMultiplier() {
        double multiplier = 0.0;
        String brand = getBrand();

        if (brand.equalsIgnoreCase("ALIENWARE")) {
            multiplier = 0.02;
        } else if (brand.equalsIgnoreCase("ASUS")) {
            multiplier = 0.015;

        } else if (brand.equalsIgnoreCase("ACER")) {
            multiplier = 0.01;
        } else if (brand.equalsIgnoreCase("NVIDIA")) {
            multiplier = 0.008;
        } else if (brand.equalsIgnoreCase("GIGABYTE")) {
            multiplier = 0.0065;
        } else if (brand.equalsIgnoreCase("INTEL")) {
            multiplier = 0.009;
        } else {
            multiplier = 1;
        }
        return multiplier;
    }
}
