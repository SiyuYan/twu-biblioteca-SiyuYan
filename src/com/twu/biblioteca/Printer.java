package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;

import java.util.List;

public class Printer {

    public static void printWelcome() {
        printUtil("Welcome Biblioteca!");
    }

    public static void printAlertMessage() {
        printUtil("Select a valid option!");
    }

    public static void printCheckoutSuccessMessage() {
        printUtil("Thank you! Enjoy the book.");
    }

    public static void printReturnSuccessMessage() {
        printUtil("Thank you for returning the book.");
    }

    public static void printCheckoutFailedMessage() {
        printUtil("That book is not available.");
    }

    public static void printReturnFailedMessage() {
        printUtil("That is not a valid book to return.");
    }

    public static void printMainMenu() {
        printUtil("1. List Books");
        printUtil("2. Checkout Book");
        printUtil("3. Return Book");
        printUtil("4. Quit");
    }

    public static void printBookList(List<Book> BookList) {
        for (Book book : BookList) {
            printUtil(formatBookInfo(book));
        }
    }

    private static void printUtil(String output){
        System.out.println(output);
    }
    private static String formatBookInfo(Book book) {
        return String.format("%-20s\t%s\t%s", book.getName(), book.getAuthor(), book.getYearOfPublished());
    }
}
