package com.personapi.personsystem.service;

import com.personapi.personsystem.dto.MessageResponse;
import com.personapi.personsystem.entity.Person;
import com.personapi.personsystem.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponse createPerson( Person person){
        Person savedPerson =  personRepository.save(person);
        return MessageResponse
                .builder()
                .message("Created person with Id " + savedPerson.getId())
                .build();
    }
}
