package com.twu.biblioteca.model;

import com.twu.biblioteca.Printer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<>(Arrays.asList(new Book("a book", "Siyu", 1992),
            new Book("another book", "Siyu", 1992)));


    public List<Book> getAllBookList() {
        return bookList;
    }

    public List removeBook(String bookName) {
        for (int i = 0; i < bookList.size(); i++)
            if (bookList.get(i).getName().equals(bookName)) {
                bookList.remove(i);
                Printer.printCheckoutSuccessMessage();
            } else {
                Printer.printCheckoutFailedMessage();
            }
        return bookList;
    }

    public List addBook(String bookName) {
        for (int i = 0; i < bookList.size(); i++)
            if (bookList.get(i).getName().equals(bookName)) {
                bookList.add(new Book(bookName));
                Printer.printReturnSuccessMessage();
                break;
            } else {
                Printer.printReturnFailedMessage();
            }
        return bookList;
    }
}
