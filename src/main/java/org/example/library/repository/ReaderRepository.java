package org.example.library.repository;

import org.example.library.model.Reader;

import java.util.List;

public interface ReaderRepository {

    List<Reader> getAll();

    Reader findByLogin(String login);

    Reader save(Reader reader);
}
