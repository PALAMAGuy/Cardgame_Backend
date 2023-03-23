package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe permettant de tester les types d'utilisateur
 * @author Palama Guy
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	
	/**
   * Méthode permettant de tester une route public
   * @return retourne un message
   */
  @GetMapping("/all")
  public String allAccess() {
    return "Public Content.";
  }

	/**
   * Méthode permettant de tester un utilisateur
   * @return retourne un message
   */
  @GetMapping("/user")
  @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
  public String userAccess() {
    return "User Content.";
  }
  
	/**
   * Méthode permettant de tester un modérateur
   * @return retourne un message
   */
  @GetMapping("/mod")
  @PreAuthorize("hasRole('MODERATOR')")
  public String moderatorAccess() {
    return "Moderator Board.";
  }

	/**
   * Méthode permettant de tester un admin
   * @return retourne un message
   */
  @GetMapping("/admin")
  @PreAuthorize("hasRole('ADMIN')")
  public String adminAccess() {
    return "Admin Board.";
  }
}