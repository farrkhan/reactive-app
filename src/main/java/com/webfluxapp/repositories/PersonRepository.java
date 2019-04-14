package com.webfluxapp.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.webfluxapp.domain.Person;

@Repository
public interface PersonRepository extends ReactiveMongoRepository<Person, String> {
}
