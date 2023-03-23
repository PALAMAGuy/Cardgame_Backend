package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**

This class represents a user role in the system. A role is a collection of
permissions and access levels that determine what actions the user can perform
and what information they can see.

*/
@Entity
@Table(name = "roles")
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Enumerated(EnumType.STRING)
  @Column(length = 20)
  private ERole name;

  /**
	 * Constructeur
	 */
  public Role() {

  }

  /**
	 * Constructeur avec paramètre nom
	 * @param name nom
	 */
  public Role(ERole name) {
    this.name = name;
  }
  /**
	 * Getter
	 * @return data
	 */
  public Integer getId() {
    return id;
  }
  /**
	 * Setter
	 * @param id param
	 */
  public void setId(Integer id) {
    this.id = id;
  }
  /**
	 * Getter
	 * @return data
	 */
  public ERole getName() {
    return name;
  }
  /**
	 * Setter
	 * @param name param
	 */
  public void setName(ERole name) {
    this.name = name;
  }
}