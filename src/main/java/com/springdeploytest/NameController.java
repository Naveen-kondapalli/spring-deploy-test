package com.springdeploytest;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/names")
public class NameController {

    private final NameRepository repository;

    public NameController(NameRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public NameEntry saveName(@RequestParam String name) {
        return repository.save(new NameEntry(name));
    }

    @GetMapping
    public List<NameEntry> getAllNames() {
        return repository.findAll();
    }
}