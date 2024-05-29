package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping
    public List<Person> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Person create(@RequestBody Person person) {
        return repository.save(person);
    }

    @GetMapping("/checkDb")
    public String checkDb() {
        Query query = entityManager.createNativeQuery("SELECT COUNT(*) FROM Person");
        Number count = (Number) query.getSingleResult();
        return "Number of entries in Person table: " + count;
    }
}
