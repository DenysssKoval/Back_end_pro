package de.ait.book.repository;

import de.ait.book.entity.Book;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Repository
public class BookReppositoryImp implements BookRepository{

    List<Book> dataBase = new ArrayList<>(List.of(
            new Book(1L, "Post", "DmitriyGluhowskiy"),
            new Book(2L, "Metro 2033", " Dmitriy Gluhowskiy"),
            new Book(3L, "1984", "George Orwell"),
            new Book(4L, "Atlas Shrugged", "Ayn Rand")

    ));

    @Override
    public List<Book> findAll() {
        return dataBase;
    }

    @Override
    public Book saveBook(Book book) {
        if(book.getId() == null){
            long newId = dataBase.get(dataBase.size() - 1).getId() + 1;
            book.setId(newId);
            dataBase.add(book);
        }
        return book;
    }
}
