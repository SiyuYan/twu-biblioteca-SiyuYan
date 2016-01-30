package com.twu.biblioteca;

import com.twu.biblioteca.model.Library;

import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        Printer.printWelcome();
        Printer.printMainMenu();
        inputHandler();
    }

    private static void inputHandler() {
        Scanner scanner = InputParser.inputOption();
        while (scanner.hasNext()) {
            Integer choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    Library library = new Library();
                    Printer.printBookList(library.getAllBookList());
                }
                break;
                case 4:
                    return;
                default:
                    Printer.printAlertMessage();
                    break;
            }
        }
    }
}
