package org.example.library.service;

import lombok.RequiredArgsConstructor;
import org.example.library.model.Book;
import org.example.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public Book findOne(long isbn) {
        return bookRepository.findOne(isbn);
    }

    @Override
    public Book borrowFromLibrary(long isbn) {
        return bookRepository.borrowFromLibrary(isbn);
    }

    @Override
    public boolean returnToLibrary(Book book) {
        return bookRepository.returnToLibrary(book);
    }
}
