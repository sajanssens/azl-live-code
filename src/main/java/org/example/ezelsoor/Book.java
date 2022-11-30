package org.example.ezelsoor;

import java.time.LocalDate;

public class Book {
    private String title;
    private double price;
    private Author author;
    private LocalDate publishedAt;
    private Publisher publisher;

    public Book(String title, double price, Author author, LocalDate publishedAt, Publisher publisher) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.publishedAt = publishedAt;
        this.publisher = publisher;
    }

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", author=" + author +
                ", publishedAt=" + publishedAt +
                '}';
    }
}
