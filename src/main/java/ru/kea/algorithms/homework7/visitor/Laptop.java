package ru.kea.algorithms.homework7.visitor;

public class Laptop implements Product {
    private final String model;
    private final double price;

    public Laptop(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visitLaptop(this);
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}
