package org.javaninja.repository;

import java.io.Serializable;
import java.util.List;

import org.javaninja.entity.Person;
import org.springframework.data.repository.CrudRepository;


public interface PersonRepository extends CrudRepository<Person, Serializable> {
	
	public List<Person> getPersonsByAgeGreaterThan(Integer age);
	
	public Person getPersonBySurname(String surname);

}