package com.twu.biblioteca.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<>(Arrays.asList(new Book("a book", "Siyu", 1992),
            new Book("another book", "Siyu", 1992)));
    private List<Book> libraryBookList = new ArrayList<>(Arrays.asList(new Book("a book", "Siyu", 1992),
            new Book("another book", "Siyu", 1992)));

    private String alertMessage;

    public void setAlertMessage(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    public String getAlertMessage() {
        return alertMessage;
    }

    public List<Book> getAllBookList() {
        return bookList;
    }

    public void removeBook(String bookName) {
        for (int i = 0; i < bookList.size(); i++)
            if (bookList.get(i).getName().equals(bookName)) {
                bookList.remove(i);
                // Printer.printCheckoutSuccessMessage();
                setAlertMessage("Thank you! Enjoy the book");
            } else {
                //  Printer.printCheckoutFailedMessage();
                setAlertMessage("That book is not available.");
            }
    }

    public void addBook(String bookName) {
        for (int i = 0; i < bookList.size(); i++) {
            if (libraryBookList.get(i).getName().equals(bookName)) {
                bookList.add(new Book(bookName));
                //  Printer.printReturnSuccessMessage();
                setAlertMessage("Thank you for returning the book.");
                break;
            } else {
                // Printer.printReturnFailedMessage();
                setAlertMessage("That is not a valid book to return.");
            }
        }
    }
}
