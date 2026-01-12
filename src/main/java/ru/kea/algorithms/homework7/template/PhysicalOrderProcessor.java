package ru.kea.algorithms.homework7.template;

public class PhysicalOrderProcessor extends OrderProcessor {
    private final String address;
    private final double cost = 1;
    private final double orderCost = 100;

    public PhysicalOrderProcessor(String address) {
        this.address = address;
    }

    @Override
    protected boolean validate() {
        if (address == null || address.isEmpty()) {
            System.out.println("Проверка физического заказа не успешна");
            return false;
        }

        System.out.println("Проверка физического заказа успешна");
        return true;
    }

    @Override
    protected double calculatePrice() {
        System.out.println("Расчёт стоимости физического заказа: цена товара + доставка " + orderCost + cost + " руб.");
        return orderCost + cost;
    }

    @Override
    protected void pay(double amount) {
        System.out.println("Оплата физического заказа: при получении, сумма " + amount + " руб.");
    }
}
