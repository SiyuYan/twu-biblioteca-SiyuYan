package com.twu.biblioteca;

import com.twu.biblioteca.model.Customer;
import com.twu.biblioteca.model.Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) throws IOException {
        Customer customer = new Customer();
        Library library = new Library();
        Printer.printWelcome();
        Printer.printMainMenu();
        inputHandler(customer, library);
    }

    private static void inputHandler(Customer customer, Library library) throws IOException {
        Scanner scanner = InputParser.inputOption();
        while (scanner.hasNext()) {
            Integer choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    Printer.printBookList(library.getAllBookList());
                }
                break;
                case 2: {
                    System.out.println("please input the book you checkout:");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    customer.checkoutBook(library, br.readLine());
                    return;
                }

                case 3: {
                    System.out.println("please input the book you return:");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    customer.returnBook(library, br.readLine());
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
