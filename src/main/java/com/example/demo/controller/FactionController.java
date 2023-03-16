package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Carte;
import com.example.demo.model.Faction;
import com.example.demo.repository.FactionRepository;

@RestController // This means that this class is a Controller
@RequestMapping(path="/faction")
public class FactionController {
	
	@Autowired
	private FactionRepository repository;
	
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
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Faction> getAll(){
		return repository.findAll();
	}
	
	@GetMapping(path="/findby")
	public @ResponseBody Optional<Faction> getFaction(@RequestParam Long id_faction){
		return repository.findById(id_faction);
	}

}
