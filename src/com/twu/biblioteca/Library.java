package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;

import java.util.Arrays;
import java.util.List;

public class Library {
    private List<Book> bookList = Arrays.asList(new Book("a book"), new Book("another book"));

    public List<Book> getAllBookList() {
        return bookList;
    }
}
