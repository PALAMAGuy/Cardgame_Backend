package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.User;

/**
 * User repo
 * @author Palama Guy
 */
public interface UserRepository extends CrudRepository<User, Long> {
	  /**
	   * Méthode pour retrouver un utilisateur par son nom
	   * @param username username de l'utilisateur
	   * @return retourne l'objet User
	   */
  Optional<User> findByUsername(String username);

  /**
   * Méthode pour savoir si un utilisateur existe
   * @param username username de l'utilisateur
   * @return retourne un booléen
   */
  Boolean existsByUsername(String username);
  
  /**
   * Méthode pour savoir si un utilisateur existe
   * @param email email de l'utilisateur
   * @return retourne un booléen
   */
  Boolean existsByEmail(String email);
}