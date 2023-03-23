package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Carte;
import com.example.demo.model.Faction;
import com.example.demo.repository.FactionRepository;

/**
 * Classe permettant la gestion des factions du jeu
 * @author Palama Guy
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
@RestController // This means that this class is a Controller
@RequestMapping(path="/api/faction")
public class FactionController {
	
	@Autowired
	private FactionRepository repository;
	
	
  /**
   * Méthode permettant d'ajouter une faction
   * @param name nom de la faction
   * @param description description de la faction
   * @param image url de l'image
   * @return retourne le message "Saved" en cas de réussite
   */
  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String add (@RequestParam String name
      , @RequestParam String description, @RequestParam String image) {

    Faction f = new Faction();
    f.setName(name);
    f.setDescription(description);
    f.setImage(image);
    repository.save(f);
    return "Saved";
  }
	
  /**
   * Méthode permettant de récupérer le détails de toutes les factions du jeu
   * @return retourne un json contenant toutes les factions du jeu
   */
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Faction> getAll(){
		return repository.findAll();
	}
	
	 /**
	   * Méthode permettant de récupérer le détails la faction par rapport à l'id
	   * @param id_faction id de la faction 
	   * @return retourne un json contenant toutes les données de la faction
	   */
	@GetMapping(path="/findby")
	public @ResponseBody Optional<Faction> getFaction(@RequestParam Long id_faction){
		return repository.findById(id_faction);
	}

}
