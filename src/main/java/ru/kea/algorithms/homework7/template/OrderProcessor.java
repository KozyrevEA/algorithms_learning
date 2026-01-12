package ru.kea.algorithms.homework7.template;

//Алгоритм заказа
public abstract class OrderProcessor {
    public final void processOrder() {
        System.out.println("\nОбработка заказа");
        if (validate()) {
            double price = calculatePrice();
            pay(price);
            notification();
        } else {
            System.out.println("Заказ не прошел проверку");
        }
    }

    protected abstract boolean validate();
    protected abstract double calculatePrice();
    protected abstract void pay(double amount);

    protected void notification() {
        System.out.println("Заказ успешно оформлен");
    }
}
