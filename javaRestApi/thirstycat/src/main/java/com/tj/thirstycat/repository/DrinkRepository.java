package com.tj.thirstycat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import entity.Drink;

@Repository
public interface DrinkRepository extends CrudRepository<Drink, Long> {

	//Below method commented out because I think it's impelmentation is in CrudRepository
	//List<Drink> findAll();
	
}
