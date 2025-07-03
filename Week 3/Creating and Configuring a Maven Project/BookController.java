package com.example.library.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/add")
    public String addBook()
    {
        bookService.addBook("Twister lies");
        return "success";
    }
}
