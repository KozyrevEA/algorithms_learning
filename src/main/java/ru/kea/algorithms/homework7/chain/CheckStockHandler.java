package ru.kea.algorithms.homework7.chain;

import ru.kea.algorithms.homework7.Order;

public class CheckStockHandler extends OrderHandler {
    @Override
    protected boolean check(Order order) {
        System.out.println("Проверка наличия товара успешна");
        return true;
    }
}
