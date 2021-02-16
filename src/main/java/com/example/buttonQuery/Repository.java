package com.example.buttonQuery;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Button, Integer> {

    List<Button> findByName(String name);

    Button findById(int id);
}