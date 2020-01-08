package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.repo.PersonRepo;

@RestController
public class PersonController {
	@Autowired
	PersonRepo repo;

	@PostMapping("/person")
	public Person savePerson(@RequestBody Person person) {
		return repo.save(person);
	}

}
