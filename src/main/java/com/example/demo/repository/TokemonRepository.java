package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Tokemon;

public interface TokemonRepository extends CrudRepository<Tokemon, Long> {

}
