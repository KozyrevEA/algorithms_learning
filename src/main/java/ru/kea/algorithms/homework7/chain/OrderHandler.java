package ru.kea.algorithms.homework7.chain;

import ru.kea.algorithms.homework7.Order;

public abstract class OrderHandler {
    protected OrderHandler next;

    public OrderHandler setNext(OrderHandler next) {
        this.next = next;
        return next;
    }

    public void handle(Order order) {
        if (check(order)) {
            if (next != null) {
                next.handle(order);
            } else {
                System.out.println("Проверки выполнены успешно");
            }
        } else {
            System.out.println("Проверки не успешны");
        }
    }

    protected abstract boolean check(Order order);
}
