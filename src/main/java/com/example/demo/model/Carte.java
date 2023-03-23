package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Entité Carte qui défini les caractéristiques d'une carte
 * @author Palama Guy
 */
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
	
	/**
	 * Constructeur
	 */
	public Carte() {
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
	 * Getter
	 * @return data
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter
	 * @return data
	 */
	public Long getPower() {
		return power;
	}

	/**
	 * Setter
	 * @param power param
	 */
	public void setPower(Long power) {
		this.power = power;
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
	public Faction getFaction() {
		return faction;
	}

	/**
	 * Setter
	 * @param faction param
	 */
	public void setFaction(Faction faction) {
		this.faction = faction;
	}

	/**
	 * toString
	 * @return string
	 */
	@Override
	public String toString() {
		return "Carte [id=" + id + ", name=" + name + ", description=" + description + ", faction=" + faction + "]";
	}


	

}
