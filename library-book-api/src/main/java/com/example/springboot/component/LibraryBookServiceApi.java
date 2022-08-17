package com.example.springboot.component;

import java.util.List;

import com.example.springboot.model.LibraryBook;

public interface LibraryBookServiceApi {
    List<LibraryBook> getBooks();
    void insertBook(LibraryBook libraryBook);
    LibraryBook getBookByISBN(String ISBN);
}
