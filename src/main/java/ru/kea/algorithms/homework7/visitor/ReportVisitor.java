package ru.kea.algorithms.homework7.visitor;

public class ReportVisitor implements ProductVisitor {
    private final StringBuilder report = new StringBuilder("Формирование отчета\n");

    @Override
    public void visitBook(Book book) {
        report.append("Книга: ").append(book.getTitle())
                .append(", Цена: ").append(book.getPrice()).append(" руб.\n");
    }

    @Override
    public void visitVideoGame(VideoGame videoGame) {
        report.append("Видеоигра: ")
                .append(videoGame.getName())
                .append(", Цена: ").append(videoGame.getPrice()).append(" руб.\n");
    }

    @Override
    public void visitLaptop(Laptop laptop) {
        report.append("Ноутбук: ")
                .append(laptop.getModel())
                .append(", Цена: ").append(laptop.getPrice()).append(" руб.\n");
    }

    public void printReport() {
        System.out.println(report);
    }
}
