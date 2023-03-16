package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private Integer power;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public Faction getFaction() {
		return faction;
	}

	public void setFaction(Faction faction) {
		this.faction = faction;
	}

	@Override
	public String toString() {
		return "Carte [id=" + id + ", name=" + name + ", power=" + power + ", faction=" + faction + "]";
	}

	
	

}
