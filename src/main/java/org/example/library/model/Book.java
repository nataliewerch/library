package org.example.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String name;
    private long isbn;
    private Author author;
    private int year;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", isbn=" + isbn +
                ", author=" + author +
                ", year=" + year +
                '}';
    }
}
