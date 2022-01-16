package com.rprandt.appherospringbootdockertest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rprandt.appherospringbootdockertest.domain.Hero;
import com.rprandt.appherospringbootdockertest.repository.HeroRepository;

@Service
public class HeroService {
	
	@Autowired
	private HeroRepository repo;
	
	public List<Hero> findAll(){
		return repo.findAll();
	}
	
	public void save(Hero obj) {
		repo.save(obj);
	}

}
