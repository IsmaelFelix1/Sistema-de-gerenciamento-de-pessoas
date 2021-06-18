package com.personapi.personsystem.controller;

import com.personapi.personsystem.dto.MessageResponse;
import com.personapi.personsystem.entity.Person;
import com.personapi.personsystem.repository.PersonRepository;
import com.personapi.personsystem.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController  {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponse createPerson(@RequestBody Person person){
    return personService.createPerson(person);
    }
}
