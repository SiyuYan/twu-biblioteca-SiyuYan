package com.twu.biblioteca.model;

import java.util.Arrays;
import java.util.List;

public class Library {
    private List<Book> bookList = Arrays.asList(new Book("a book", "Siyu", 1992), new Book("another book", "Siyu", 1992));

    public List<Book> getAllBookList() {
        return bookList;
    }
}
