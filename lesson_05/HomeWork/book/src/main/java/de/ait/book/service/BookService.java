package de.ait.book.service;

import de.ait.book.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book createNewBook(Book book);
}
