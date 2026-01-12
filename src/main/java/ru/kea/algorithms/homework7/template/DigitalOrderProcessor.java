package ru.kea.algorithms.homework7.template;

public class DigitalOrderProcessor extends OrderProcessor {
    private final String email;
    private final double orderCost = 1;

    public DigitalOrderProcessor(String email) {
        this.email = email;
    }

    @Override
    protected boolean validate() {
        if (email == null || email.isEmpty()) {
            System.out.println("Проверка цифрового заказа не успешна");
            return false;
        }

        System.out.println("Проверка цифрового заказа успешна");
        return true;
    }

    @Override
    protected double calculatePrice() {
        System.out.println("Расчёт стоимости цифрового заказа " + orderCost + " руб.");
        return orderCost;
    }

    @Override
    protected void pay(double amount) {
        System.out.println("Оплата цифрового заказа: онлайн, сумма " + amount + " руб.");
    }
}
