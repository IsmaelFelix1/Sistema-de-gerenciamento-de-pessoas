package com.personapi.personsystem.repository;

import com.personapi.personsystem.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
