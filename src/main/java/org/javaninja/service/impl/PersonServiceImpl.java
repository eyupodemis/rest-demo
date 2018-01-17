package org.javaninja.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.javaninja.dto.PersonDto;
import org.javaninja.entity.Person;
import org.javaninja.repository.PersonRepository;
import org.javaninja.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<PersonDto> getAllPersons() {
		List<PersonDto> persons = new ArrayList<>();
		personRepository.findAll().forEach(person -> {
			PersonDto personDto = new PersonDto();
			personDto.setAge(person.getAge());
			personDto.setName(person.getName());
			personDto.setSurname(person.getSurname());
			persons.add(personDto);
		});
		return persons;
	}

	@Override
	public void createPerson(PersonDto personDto) {
		Person person = new Person();
		person.setAge(personDto.getAge());
		person.setName(personDto.getName());
		person.setSurname(personDto.getSurname());
		personRepository.save(person);
	}

}
