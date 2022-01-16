package com.rprandt.appherospringbootdockertest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rprandt.appherospringbootdockertest.domain.Hero;

@Repository
public interface HeroRepository extends MongoRepository<Hero, String>{

}
