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
