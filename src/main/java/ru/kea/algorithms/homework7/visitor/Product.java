package ru.kea.algorithms.homework7.visitor;

public interface Product {
    void accept(ProductVisitor visitor);
    double getPrice();
}
