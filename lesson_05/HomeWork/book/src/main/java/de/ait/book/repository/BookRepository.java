package de.ait.book.repository;

import de.ait.book.entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAll();
    Book saveBook(Book book);

}
