package com.aos.compose.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonController {

	// This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	@Autowired(required = true)
	private PersonRepository personRepository;

	@GetMapping(path = "/addperson") // Map ONLY GET Requests
	public @ResponseBody String addNewPerson(@RequestParam String name) {
		Person person = new Person();
		person.setName(name);
		personRepository.save(person);
		return "Saved";
	}

	@GetMapping(path = "/updateperson") // Map ONLY GET Requests
	public @ResponseBody String addNewPerson(@RequestParam Integer id, @RequestParam String name) {
		Person person = personRepository.findOne(id);
		person.setName(name);
		personRepository.save(person);
		return "Updated";
	}
	
	@GetMapping(path = "/removeperson") // Map ONLY GET Requests
	public @ResponseBody String removePerson(@RequestParam Integer id) {
		Person person = personRepository.findOne(id);
		personRepository.delete(person);
		return "Saved";
	}
	
	
	@GetMapping(path = "/allperson")
	public @ResponseBody Iterable<Person> getAllPerson() {
		return personRepository.findAll();
	}

}
