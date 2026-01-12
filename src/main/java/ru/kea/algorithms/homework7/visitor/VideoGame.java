package ru.kea.algorithms.homework7.visitor;

public class VideoGame implements Product {
    private final String name;
    private final double price;

    public VideoGame(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visitVideoGame(this);
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
