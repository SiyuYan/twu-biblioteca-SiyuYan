package com.twu.biblioteca;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class LibraryTest {

    @Test
    public void should_get_all_book_list() {
        //given
        Library library = new Library();

        //when
        List bookList = library.getAllBookList();

        //then
        assertNotEquals(bookList.size(), 0);
    }
}
