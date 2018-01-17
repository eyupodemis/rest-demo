package org.javaninja.service;

import java.util.List;

import org.javaninja.dto.PersonDto;

public interface PersonService {
	
	public List<PersonDto> getAllPersons();
	
	public void createPerson(PersonDto person);

}
