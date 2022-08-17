package com.example.springboot.library;

public class LibraryServiceImpl implements LibraryService {

    @Override
    public void enterLibrary() {
        System.out.println("Test");
    }

    @Override
    public void exitLibrary() {
        System.out.println("Exit");
        
    }
    
}
