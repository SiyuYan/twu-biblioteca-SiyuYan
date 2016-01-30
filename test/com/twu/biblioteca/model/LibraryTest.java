package com.twu.biblioteca.model;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

public class LibraryTest {

    List bookList;
    Library library;

    @Before
    public void setUp() {
        library = new Library();
        bookList = library.getAllBookList();
    }

    @Test
    public void should_get_all_book_list() {
        assertNotEquals(bookList.size(), 0);
    }

    @Test
    public void should_checkout_book_success_when_bookList_has_that_book() {
        Customer customer = new Customer();
        assertEquals(bookList.size(), 2);

        assertThat(1, is(customer.checkoutBook("a book").size()));
    }

    @Test
    public void should_not_checkout_book_success_when_bookList_do_not_has_that_book() {
        Customer customer = new Customer();
        assertEquals(library.getAllBookList().size(), 2);

        assertThat(2, is(customer.checkoutBook("not available").size()));
    }

    @Test
    public void should_return_book_success() {
        Library library = new Library();
        Customer customer = new Customer();
        assertEquals(library.getAllBookList().size(), 2);

        assertThat(3, is(customer.returnBook("a book").size()));
    }

    @Test
    public void should_not_return_book_success_when_the_book_not_belong_to_the_library() {
        Library library = new Library();
        Customer customer = new Customer();
        assertEquals(library.getAllBookList().size(), 2);

        assertThat(2, is(customer.returnBook("not available").size()));
    }
}
