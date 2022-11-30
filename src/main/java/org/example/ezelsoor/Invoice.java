package org.example.ezelsoor;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private List<Book> books = new ArrayList<>();
    private Customer customer;
    private double totalAmount;

    public Invoice(Customer customer) {
        this.customer = customer;
    }

    public void addBook(Book b) {
        this.books.add(b);
        totalAmount += b.getPrice();
    }

    @Override public String toString() {
        return "Invoice{\n" +
                "  books=" + books + "\n" +
                "  customer=" + customer + "\n" +
                "  totalAmount=" + totalAmount +
                '}';
    }
}
