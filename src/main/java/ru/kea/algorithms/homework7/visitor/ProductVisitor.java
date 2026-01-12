package ru.kea.algorithms.homework7.visitor;

public interface ProductVisitor {
    void visitBook(Book book);
    void visitVideoGame(VideoGame videoGame);
    void visitLaptop(Laptop laptop);
}
