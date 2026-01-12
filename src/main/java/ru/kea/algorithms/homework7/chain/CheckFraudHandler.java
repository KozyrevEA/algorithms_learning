package ru.kea.algorithms.homework7.chain;

import ru.kea.algorithms.homework7.Order;

public class CheckFraudHandler extends OrderHandler {
    @Override
    protected boolean check(Order order) {
        System.out.println("Проверка на мошенничество успешна");
        return true;
    }
}
