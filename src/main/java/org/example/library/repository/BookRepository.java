package org.example.library.repository;

import org.example.library.model.Book;

import java.util.List;

public interface BookRepository {

    List<Book> getAll();

    Book findOne(long isbn);

    Book borrowFromLibrary(long isbn);

    boolean returnToLibrary(Book book);
}
