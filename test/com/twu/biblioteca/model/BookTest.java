package com.twu.biblioteca.model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookTest {

    @Test
    public void should_get_author_and_year_of_publish() {
        Book book = new Book("a guide of book", "Siyu", 1992);

        assertThat(book.getAuthor(), is("Siyu"));
        assertThat(book.getYearOfPublished(), is(1992));
    }
}