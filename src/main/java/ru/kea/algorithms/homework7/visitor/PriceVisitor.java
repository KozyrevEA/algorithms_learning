package ru.kea.algorithms.homework7.visitor;

public class PriceVisitor implements ProductVisitor {
    private double totalPrice = 0;

    @Override
    public void visitBook(Book book) {
        totalPrice += book.getPrice();
        System.out.println("Книга добавлена в расчёт, цена: " + book.getPrice() + " руб.");
    }

    @Override
    public void visitVideoGame(VideoGame videoGame) {
        totalPrice += videoGame.getPrice();
        System.out.println("Игра добавлена в расчёт, цена: " + videoGame.getPrice() + " руб.");
    }

    @Override
    public void visitLaptop(Laptop laptop) {
        totalPrice += laptop.getPrice();
        System.out.println("Ноутбук добавлен в расчёт, цена: " + laptop.getPrice() + " руб.");
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
