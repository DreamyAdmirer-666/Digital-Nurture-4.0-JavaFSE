package com.example.library.service;
import com.example.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository)
    {
        this.bookRepository=bookRepository;
    }
    public void addBook(String bookName)
    {
        System.out.println("Processing book: "+bookName);
        bookRepository.saveBook(bookName);
    }
    
}
