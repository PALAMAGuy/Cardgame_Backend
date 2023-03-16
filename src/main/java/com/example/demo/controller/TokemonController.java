package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Tokemon;
import com.example.demo.repository.TokemonRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path="/tokemon") // This means URL's start with /demo (after Application path)
public class TokemonController {
	
	 @Autowired
	private TokemonRepository repository;
	
	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<Tokemon> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return repository.findAll();
	  }

}
