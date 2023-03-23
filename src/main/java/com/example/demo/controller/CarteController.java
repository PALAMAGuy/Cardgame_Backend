package com.example.demo.controller;

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
import com.example.demo.repository.CarteRepository;
import com.example.demo.repository.FactionRepository;

/**
 * Classe permettant la gestion des cartes du jeu
 * @author Palama Guy
 */

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
@RestController // This means that this class is a Controller
@RequestMapping(path="api/card") 
public class CarteController {
	
	@Autowired
	private CarteRepository repository;
	
	@Autowired
	private FactionRepository factionRepository;
	
	
  /**
   * Méthode permettant d'ajouter une carte
   * @param name nom de la carte
   * @param id_faction id de la faction
   * @param description description de la carte
   * @param image url de l'image
   * @param power puissance de la carte
   * @return retourne le message "Saved" en cas de réussite
   */
	@PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String add (@RequestParam String name , 
			  @RequestParam Long id_faction,
			  @RequestParam String description,
			  @RequestParam String image,
			  @RequestParam Long power) {

	    Carte c = new Carte();
	    c.setName(name);
	    c.setFaction(factionRepository.findById(id_faction).get());
	    c.setDescription(description);
	    c.setImage(image);
	    c.setPower(power);
	    repository.save(c);
	    return "Saved";
	    
	  }
	
	/**
   * Méthode permettant de récupérer le détails de toutes les cartes du jeu
   * @return retourne un json contenant toutes les cartes du jeu
   */
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Carte> getAll(){
		return repository.findAll();
	}

}
