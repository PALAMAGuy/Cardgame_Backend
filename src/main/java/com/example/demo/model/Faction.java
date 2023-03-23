package com.example.demo.model;

import java.util.ArrayList;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * Entité Faction qui défini les caractéristiques d'une faction
 * @author Palama Guy
 */
@Entity
public class Faction {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long id;
	 private String name;
	 @Column(columnDefinition = "LONGTEXT")
	 private String description;
	 private String image;
	 
	 @JsonIgnore
	 @OneToMany(mappedBy="faction")
	 private Set<Carte> cards;
	 
	 /**
	 * Constructeur
	 */
	public Faction() {
		super();
	}

	/**
	 * Getter
	 * @return data
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Getter
	 * @return data
	 */
	public String getDescription() {
		return description;
	}

	
	/**
	 * Setter
	 * @param description param
	 */
	public void setDescription(String description) {
		this.description = description;
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
	public String getName() {
		return name;
	}

	/**
	 * Setter
	 * @param name param
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter
	 * @return data
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Setter
	 * @param image param
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * Getter
	 * @return data
	 */
	public Set<Carte> getCards() {
		return cards;
	}

	/**
	 * Setter
	 * @param cards param
	 */
	public void setCards(Set<Carte> cards) {
		this.cards = cards;
	}

	/**
	 * toString
	 * @return string
	 */
	@Override
	public String toString() {
		return "Faction [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image + ", cards="
				+ cards + "]";
	}

}
