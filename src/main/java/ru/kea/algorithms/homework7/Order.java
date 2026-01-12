package ru.kea.algorithms.homework7;

import ru.kea.algorithms.homework7.visitor.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Product> products = new ArrayList<>();
    private final String customer;

    public Order(String customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getCustomer() {
        return customer;
    }
}
