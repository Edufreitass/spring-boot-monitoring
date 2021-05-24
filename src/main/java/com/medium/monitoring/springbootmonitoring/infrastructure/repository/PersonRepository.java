package com.medium.monitoring.springbootmonitoring.infrastructure.repository;

import com.medium.monitoring.springbootmonitoring.domain.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

}
