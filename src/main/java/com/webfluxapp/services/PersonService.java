package com.webfluxapp.services;

import org.reactivestreams.Publisher;

import com.webfluxapp.domain.Person;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonService {

    Mono<Person> findById(String id);

    Flux<Person> findAll();

    Mono<Person> save(Person personMono);

    Mono<Person> update(Person person);

    Mono<Void> deleteById(String id);
}
