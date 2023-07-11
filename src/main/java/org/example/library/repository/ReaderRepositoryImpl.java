package org.example.library.repository;

import org.example.library.model.Reader;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ReaderRepositoryImpl implements ReaderRepository {

    private Map<String, Reader> readerMap = new HashMap<>();

    @PostConstruct
    private void init() {
        readerMap.put("ivan", new Reader("ivan", "11111a", "Ivan", "Ivanov", 23));
        readerMap.put("anton", new Reader("anton", "22222b", "Anton", "Antonov", 35));
        readerMap.put("oleg", new Reader("oleg", "33333c", "Oleg", "Olegov", 64));
        readerMap.put("gleb", new Reader("gleb", "44444d", "Gleb", "Glebov", 13));
    }

    @Override
    public List<Reader> getAll() {
        return new ArrayList<>(readerMap.values());
    }

    @Override
    public Reader findByLogin(String login) {
        return readerMap.get(login);
    }

    @Override
    public Reader save(Reader reader) {
        readerMap.put(reader.getLogin(), reader);
        return reader;
    }
}
