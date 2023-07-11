package org.example.library.controller;

import lombok.RequiredArgsConstructor;
import org.example.library.model.Book;
import org.example.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://localhost:8080
@RestController
@RequestMapping("books")  //http://localhost:8080/books
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping //http://localhost:8080/books
    public List<Book> list() {
        return bookService.getAll();
    }

    @GetMapping("/{isbn}")        //GET http://localhost:8080/books/12345 get object by param
    public Book getByIsbn(@PathVariable(name = "isbn") long isbn) {
        return bookService.findOne(isbn);
    }

    @PostMapping("return")
    public void returnBookToLibrary(@RequestBody Book book) {
        bookService.returnToLibrary(book);
    }

    @PostMapping("/borrow/{isbn}")
    public Book borrowBookFromLibrary(@PathVariable(name = "isbn") long isbn) {
        return bookService.borrowFromLibrary(isbn);
    }
}
