package ru.kea.algorithms.homework7.visitor;

public class Book implements Product {
    private final String title;
    private final double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visitBook(this);
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
