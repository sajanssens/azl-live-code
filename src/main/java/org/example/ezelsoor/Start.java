package org.example.ezelsoor;

import java.time.LocalDate;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        Book b1 = new Book(
                "Carry de Slayer",
                20.99,
                new Author("Slee"),
                LocalDate.of(2022, 11, 30),
                new Publisher("De Luie Weps")
        );

        Catalog catalogus = new Catalog();
        catalogus.addBook(b1);

        List<Book> tolkienBooks = catalogus.searchOnAuthor("Tolkien");
        System.out.println(tolkienBooks);

        List<Book> searchResults = catalogus.search("The Hobbit");

        if (searchResults.size() == 0) {
            Customer c = new Customer("Piet Jansen", "Dorpsstraat 42", "Heerlen");

            // when book arrives:
            Book h = new Book(
                    "The Hobbit",
                    10.50,
                    new Author("Tolkien"),
                    LocalDate.of(1937, 9, 21),
                    new Publisher("George Allen & Unwin")
            );
            catalogus.addBook(h);

            Invoice i = new Invoice(c);
            i.addBook(h);
            i.addBook(new Book("The Silmarillion", 15.00));
            System.out.println(i);
        }
    }
}
