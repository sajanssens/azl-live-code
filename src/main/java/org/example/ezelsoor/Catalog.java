package org.example.ezelsoor;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        this.books.add(b);
    }

    public List<Book> searchOnAuthor(String authorName) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getName().equals(authorName)) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> search(String title) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                results.add(book);
            }
        }
        return results;
    }
}
