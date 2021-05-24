package com.medium.monitoring.springbootmonitoring.infrastructure.repository;

import com.medium.monitoring.springbootmonitoring.domain.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByFirstNameIgnoringCase(String firstName);

    List<Person> findByLastNameIgnoringCase(String lastName);

}
