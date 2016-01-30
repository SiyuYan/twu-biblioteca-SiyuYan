package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;

import java.util.List;

public class Printer {

    public static void printWelcome(String output) {
        System.out.println(output);
    }

    public static void printBookList(List<Book> BookList) {
        for (Book book : BookList) {
            System.out.println(book.getName());
        }
    }

}
