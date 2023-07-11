package org.example.library.service;

import org.example.library.model.Reader;

import java.util.List;

public interface ReaderService {

    List<Reader> getAll();

    Reader findByLogin(String login);

    Reader save(Reader reader);
}
