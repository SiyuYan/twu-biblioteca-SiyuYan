package com.twu.biblioteca.model;

public class Customer {

    public void checkoutBook(Library library, String bookName) {
         library.removeBook(bookName);
    }

    public void returnBook(Library library, String bookName) {
         library.addBook(bookName);
    }
}
