package com.example.demo.model;

import java.util.ArrayList;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Faction {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long id;
	 private String name;
	 private String description;
	 private String image;
	 
	 @JsonIgnore
	 @OneToMany(mappedBy="faction")
	 private Set<Carte> cards;
	 
	public Faction() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set<Carte> getCards() {
		return cards;
	}

	public void setCards(Set<Carte> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Faction [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image + ", cards="
				+ cards + "]";
	}

}
