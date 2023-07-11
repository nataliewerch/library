package org.example.library.service;

import org.example.library.model.Reader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReaderServiceImplTest {

    @Autowired
    private ReaderService readerService;

    @Test
    void getAll() {
        assertEquals(4, readerService.getAll().size());
    }

    @Test
    void findByLogin() {
        Reader reader = readerService.findByLogin("ivan");
        assertNotNull(reader);
        assertEquals("ivan", reader.getLogin());
        assertEquals("Ivan", reader.getFirstName());
        assertEquals("Ivanov", reader.getLastName());
        assertEquals(23, reader.getAge());
    }

    @Test
    void save() {
        Reader reader = new Reader("anna", "a123", "Anna", "Ivanova", 15);
        readerService.save(reader);
        readerService.findByLogin("anna");
        assertNotNull(reader);
        assertEquals("anna", reader.getLogin());
        assertEquals("Anna", reader.getFirstName());
        assertEquals("Ivanova", reader.getLastName());
        assertEquals(15, reader.getAge());
    }
}