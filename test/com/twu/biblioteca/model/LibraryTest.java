package com.twu.biblioteca.model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LibraryTest {

    Library library;
    Customer customer;

    @Before
    public void setUp() {
        library = new Library();
        customer = new Customer();
    }

    @Test
    public void should_get_all_book_list() {
        assertNotEquals(library.getAllBookList().size(), 0);
    }

    @Test
    public void should_checkout_book_success_when_bookList_has_that_book() {
        assertThat(library.getAllBookList().size(),is(2));

        customer.checkoutBook(library, "a book");
        assertThat(library.getAllBookList().size(),is(1));

        assertThat(library.getAlertMessage(),is("Thank you! Enjoy the book"));
    }

    @Test
    public void should_not_checkout_book_success_when_bookList_do_not_has_that_book() {
        assertThat(library.getAllBookList().size(), is(2));

        customer.checkoutBook(library, "not available");
        assertThat(library.getAllBookList().size(), is(2));
        assertThat(library.getAlertMessage(),is("That book is not available."));
    }

    @Test
    public void should_return_book_success() {
        assertThat(library.getAllBookList().size(), is(2));

        customer.returnBook(library, "a book");
        assertThat(library.getAllBookList().size(), is(3));
        assertThat(library.getAlertMessage(),is("Thank you for returning the book."));
    }

    @Test
    public void should_not_return_book_success_when_the_book_not_belong_to_the_library() {
        assertThat(library.getAllBookList().size(),is(2));

        customer.returnBook(library, "not available");
        assertThat(library.getAllBookList().size(), is(2));
        assertThat(library.getAlertMessage(),is("That is not a valid book to return."));
    }

    @Test
    public void should_checkout_and_return_book_success_when_multi_operation() {
        assertThat(library.getAllBookList().size(), is(2));

        customer.checkoutBook(library, "a book");
        assertThat(library.getAllBookList().size(), is(1));
        customer.returnBook(library, "a book");
        assertThat(library.getAllBookList().size(), is(2));

        customer.checkoutBook(library, "a book");
        assertThat("Thank you! Enjoy the book", is(library.getAlertMessage()));
        assertThat(library.getAllBookList().size(), is(1));

        customer.checkoutBook(library, "a book");
        assertThat("That book is not available.", is(library.getAlertMessage()));
    }
}
