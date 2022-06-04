package com.sofkau.apirestwebflux.repository;

import com.sofkau.apirestwebflux.collection.Dato;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface Repositorio extends ReactiveMongoRepository<Dato, String> {
}
