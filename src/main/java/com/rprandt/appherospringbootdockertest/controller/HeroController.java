package com.rprandt.appherospringbootdockertest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rprandt.appherospringbootdockertest.domain.Hero;
import com.rprandt.appherospringbootdockertest.service.HeroService;

@RestController
@RequestMapping("/heros")
public class HeroController {
	
	@Autowired
	private HeroService service;
	
	@GetMapping
	public ResponseEntity<List<Hero>> findAll(){
		List<Hero> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Void> save(@RequestBody Hero obj){
		service.save(obj);
		return ResponseEntity.noContent().build();
	}

}
