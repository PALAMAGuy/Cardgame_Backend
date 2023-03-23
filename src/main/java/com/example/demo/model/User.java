package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**

This class represents a user in the system. A user has a unique identifier, a username,
a password, and a collection of roles that determine what actions they can perform
and what information they can see.

*/

@Entity
@Table(name = "users",
       uniqueConstraints = {
           @UniqueConstraint(columnNames = "username"),
           @UniqueConstraint(columnNames = "email")
       })
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Size(max = 20)
  private String username;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  @NotBlank
  @Size(max = 120)
  private String password;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "user_roles", 
             joinColumns = @JoinColumn(name = "user_id"),
             inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<Role> roles = new HashSet<>();

  /**
	 * Constructeur
	 */
  public User() {
  }

  /**
	 * Constructeur avec paramètres
	 * @param username username
	 * @param email email
	 * @param password password
	 */
  public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }
	/**
	 * Getter
	 * @return data
	 */
  public Long getId() {
    return id;
  }
	/**
	 * Setter
	 * @param id param
	 */
  public void setId(Long id) {
    this.id = id;
  }
	/**
	 * Getter
	 * @return data
	 */
  public String getUsername() {
    return username;
  }
	/**
	 * Setter
	 * @param username param
	 */
  public void setUsername(String username) {
    this.username = username;
  }
	/**
	 * Getter
	 * @return data
	 */
  public String getEmail() {
    return email;
  }
	/**
	 * Setter
	 * @param email param
	 */
  public void setEmail(String email) {
    this.email = email;
  }
	/**
	 * Getter
	 * @return data
	 */
  public String getPassword() {
    return password;
  }
	/**
	 * Setter
	 * @param password param
	 */
  public void setPassword(String password) {
    this.password = password;
  }
	/**
	 * Getter
	 * @return data
	 */
  public Set<Role> getRoles() {
    return roles;
  }
	/**
	 * Setter
	 * @param roles param
	 */
  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }
}