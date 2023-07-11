package org.example.library.service;

import lombok.RequiredArgsConstructor;
import org.example.library.model.Reader;
import org.example.library.repository.ReaderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReaderServiceImpl implements ReaderService {

    private final ReaderRepository readerRepository;

    @Override
    public List<Reader> getAll() {
        return readerRepository.getAll();
    }

    @Override
    public Reader findByLogin(String login) {
        return readerRepository.findByLogin(login);
    }

    @Override
    public Reader save(Reader reader) {
        return readerRepository.save(reader);
    }
}
