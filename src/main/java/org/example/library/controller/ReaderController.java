package org.example.library.controller;

import lombok.RequiredArgsConstructor;
import org.example.library.model.Reader;
import org.example.library.service.ReaderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/readers")
@RequiredArgsConstructor
public class ReaderController {

    private final ReaderService readerService;

    @GetMapping
    public List<Reader> getAll() {
        return readerService.getAll();
    }

    @GetMapping("/{login}")
    public Reader getByLogin(@PathVariable(name = "login") String login) {
        return readerService.findByLogin(login);
    }

    @PostMapping("/create")
    public Reader create(@RequestBody Reader reader) {
        return readerService.save(reader);
    }
}
