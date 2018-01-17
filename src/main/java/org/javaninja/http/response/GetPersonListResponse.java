package org.javaninja.http.response;

import java.util.List;

import org.javaninja.dto.PersonDto;
import org.javaninja.http.base.JavaNinjaResponse;

public class GetPersonListResponse extends JavaNinjaResponse {
	
	private List<PersonDto> persons;

	public List<PersonDto> getPersons() {
		return persons;
	}

	public void setPersons(List<PersonDto> persons) {
		this.persons = persons;
	} 

}
