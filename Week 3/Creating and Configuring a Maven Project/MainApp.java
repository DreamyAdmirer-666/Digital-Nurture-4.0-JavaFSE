package com.example.library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.library.service.BookService;
public class MainApp{
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.addBook("Twisted games");
        ((ClassPathXmlApplicationContext) context).close();
    }
}