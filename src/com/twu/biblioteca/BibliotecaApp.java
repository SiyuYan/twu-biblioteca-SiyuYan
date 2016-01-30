package com.twu.biblioteca;

public class BibliotecaApp {
    public static void main(String[] args) {
        Printer.printWelcome("Welcome Biblioteca!");

        Library library = new Library();
        Printer.printBookList(library.getAllBookList());
    }

}
