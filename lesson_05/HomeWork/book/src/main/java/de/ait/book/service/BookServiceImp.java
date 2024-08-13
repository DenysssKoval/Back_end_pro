package de.ait.book.service;

import de.ait.book.entity.Book;
import de.ait.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService{

    private final BookRepository repository;

    @Autowired
    public BookServiceImp(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }

    @Override
    public Book createNewBook(Book book) {
        if(book.getId() != null){
            book.setId(null);

        }
        return repository.saveBook(book);
    }
}
