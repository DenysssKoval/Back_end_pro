package de.ait.book.entity;
/*
* Выберете любую сущность, например Book.
Создайте приложение, используя https://start.spring.io/  Подключите зависимость Spring Web
По примеру написанному на занятие, создайте слои приложения, и реализуйте:
1) получение всех (книг) при get запросе на /books
2) добавление книги по запросу post

*/
public class Book {
    private Long id;
    private String title;
    private String author;

    public Book(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
