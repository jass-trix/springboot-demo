package com.example.springboot.model;

public class LibraryBook {
    private String title;
    private String ISBN;
    private String author;

    public LibraryBook() {
    }

    public LibraryBook(
        String title,
        String ISBN,
        String author
    ) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public String getAuthor() {
        return this.author;
    }
}
