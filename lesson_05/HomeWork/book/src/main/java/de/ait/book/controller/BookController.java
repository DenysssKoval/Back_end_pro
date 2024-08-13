package de.ait.book.controller;

import de.ait.book.entity.Book;
import de.ait.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;


@RestController
public class BookController {

    private final BookService service;

   @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        return service.findAll();
    }

    @PostMapping("/books")
    public Book createNewBook(@RequestBody Book book){
       return service.createNewBook(book);
    }
}
