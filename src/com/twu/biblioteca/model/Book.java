package com.twu.biblioteca.model;

public class Book {

    private String name;
    private Integer yearOfPublished;
    private String author;

    public Book(String name, String author, Integer yearOfPublished) {
        this.name = name;
        this.author = author;
        this.yearOfPublished = yearOfPublished;
    }

    public String getName() {
        return name;
    }

    public Book(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }

    public void setYearOfPublished(Integer yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    public void setAuthor(String auther) {
        this.author = auther;
    }

    public Integer getYearOfPublished() {
        return yearOfPublished;
    }
}
