package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springboot.library.LibraryService;
import com.example.springboot.library.LibraryServiceImpl;
import com.example.springboot.model.LibraryBook;

@SpringBootApplication
public class SpringbootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

    public SpringbootDemoApplication() {
        LibraryBook libBook = new LibraryBook(
            "House of Fire",
            "ISBN-12346",
            "RR Martin"
        );

        System.out.println(libBook.getAuthor() + " " + libBook.getISBN());
        LibraryService libraryService = new LibraryServiceImpl();
        libraryService.enterLibrary();
        libraryService.exitLibrary();
        System.out.println("Halo");
    }
}