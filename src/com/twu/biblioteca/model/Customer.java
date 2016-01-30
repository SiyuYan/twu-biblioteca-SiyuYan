package com.twu.biblioteca.model;

import java.util.List;

public class Customer {
    public List checkoutBook(String bookName) {
        Library library = new Library();
        return library.removeBook(bookName);
    }

    public List returnBook(String bookName) {
        Library library = new Library();
        return library.addBook(bookName);
    }
}
