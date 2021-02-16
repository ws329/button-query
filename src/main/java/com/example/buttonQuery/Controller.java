package com.example.buttonQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Repository repository;

    @GetMapping("/button")
    public String buttonQuery(@RequestParam(value = "id") int id) {

        Button button = repository.findById(id);
        return button.toString();
    }
}