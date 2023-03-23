package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Faction;

/**
 * Faction repo
 * @author Palama Guy
 */

public interface FactionRepository extends CrudRepository<Faction,Long>{

}
