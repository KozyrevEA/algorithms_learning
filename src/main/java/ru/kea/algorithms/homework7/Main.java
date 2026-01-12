package ru.kea.algorithms.homework7;

import ru.kea.algorithms.homework7.chain.CheckBalanceHandler;
import ru.kea.algorithms.homework7.chain.CheckFraudHandler;
import ru.kea.algorithms.homework7.chain.CheckStockHandler;
import ru.kea.algorithms.homework7.chain.OrderHandler;
import ru.kea.algorithms.homework7.template.DigitalOrderProcessor;
import ru.kea.algorithms.homework7.template.OrderProcessor;
import ru.kea.algorithms.homework7.template.PhysicalOrderProcessor;
import ru.kea.algorithms.homework7.visitor.Book;
import ru.kea.algorithms.homework7.visitor.Laptop;
import ru.kea.algorithms.homework7.visitor.PriceVisitor;
import ru.kea.algorithms.homework7.visitor.Product;
import ru.kea.algorithms.homework7.visitor.ReportVisitor;
import ru.kea.algorithms.homework7.visitor.VideoGame;

public class Main {
    public static void main(String[] args) {

        //Создадим заказ
        Order order = new Order("Евгений");
        order.addProduct(new Book("MegaBook", 100.0));
        order.addProduct(new VideoGame("TopGame", 200.0));
        order.addProduct(new Laptop("SuperLaptop", 300.0));

        //Chain of Responsibility
        System.out.println("Проверки");
        OrderHandler stockHandler = new CheckStockHandler();
        OrderHandler balanceHandler = new CheckBalanceHandler();
        OrderHandler fraudHandler = new CheckFraudHandler();

        //Цепочка проверок
        stockHandler.setNext(balanceHandler).setNext(fraudHandler);
        stockHandler.handle(order);

        //Template Method
        System.out.println("\nОформление заказов");
        OrderProcessor digitalProcessor = new DigitalOrderProcessor("mail@mail.ru");
        digitalProcessor.processOrder();

        OrderProcessor physicalProcessor = new PhysicalOrderProcessor("г. Орел");
        physicalProcessor.processOrder();

        //Visitor
        PriceVisitor priceVisitor = new PriceVisitor();
        System.out.println("\nПодсчёт стоимости товаров");
        for (Product product : order.getProducts()) {
            product.accept(priceVisitor);
        }
        System.out.println("Общая стоимость товаров: " + priceVisitor.getTotalPrice() + " руб.");

        ReportVisitor reportVisitor = new ReportVisitor();
        for (Product product : order.getProducts()) {
            product.accept(reportVisitor);
        }
        System.out.println("\nТекстовый отчёт");
        reportVisitor.printReport();
    }
}
