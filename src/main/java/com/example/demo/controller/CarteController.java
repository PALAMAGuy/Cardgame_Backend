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

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
@RestController // This means that this class is a Controller
@RequestMapping(path="api/card") 
public class CarteController {
	
	@Autowired
	private CarteRepository repository;
	
	@Autowired
	private FactionRepository factionRepository;
	
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
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Carte> getAll(){
		return repository.findAll();
	}

}
