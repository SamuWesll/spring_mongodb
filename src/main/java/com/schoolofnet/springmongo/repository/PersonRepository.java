package com.schoolofnet.springmongo.repository;

import com.schoolofnet.springmongo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}
