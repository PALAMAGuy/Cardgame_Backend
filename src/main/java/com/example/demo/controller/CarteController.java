package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Carte;
import com.example.demo.model.Faction;
import com.example.demo.repository.CarteRepository;
import com.example.demo.repository.FactionRepository;

@RestController // This means that this class is a Controller
@RequestMapping(path="/carte") 
public class CarteController {
	
	@Autowired
	private CarteRepository repository;
	
	@Autowired
	private FactionRepository factionRepository;
	
	@PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String add (@RequestParam String name
	      , @RequestParam Integer power, @RequestParam Long id_faction) {

	    Carte c = new Carte();
	    c.setName(name);
	    c.setPower(power);
	    c.setFaction(factionRepository.findById(id_faction).get());
	    
	    repository.save(c);
	    return "Saved";
	    
	  }

}
