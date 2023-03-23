package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.ERole;
import com.example.demo.model.Role;

/**
 * Role repo
 * @author Palama Guy
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
  /**
   * Méthode pour retrouver un role par son nom
   * @param name nom du role
   * @return retourne l'objet Role
   */
  Optional<Role> findByName(ERole name);
}