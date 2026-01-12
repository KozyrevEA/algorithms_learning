package ru.kea.algorithms.homework7.chain;

import ru.kea.algorithms.homework7.Order;

public class CheckBalanceHandler extends OrderHandler {
    @Override
    protected boolean check(Order order) {
        System.out.println("Проверка баланса успешна");
        return true;
    }
}
