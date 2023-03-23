package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Carte {
	
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long id;
	private String name;
	@Column(columnDefinition = "LONGTEXT")
	 private String description;
	private String image;
	private Long power;
	
	@JsonIgnore
	@ManyToOne
    @JoinColumn(name="faction_id", nullable=false)
	private Faction faction;
	
	public Carte() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public Long getPower() {
		return power;
	}

	public void setPower(Long power) {
		this.power = power;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Faction getFaction() {
		return faction;
	}

	public void setFaction(Faction faction) {
		this.faction = faction;
	}

	@Override
	public String toString() {
		return "Carte [id=" + id + ", name=" + name + ", description=" + description + ", faction=" + faction + "]";
	}


	

}
