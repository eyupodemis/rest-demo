package org.javaninja.http.request;

import org.javaninja.dto.PersonDto;
import org.javaninja.http.base.JavaNinjaRequest;

public class CreatePersonRequest extends JavaNinjaRequest {
	
	private PersonDto person;

	public PersonDto getPerson() {
		return person;
	}

	public void setPerson(PersonDto person) {
		this.person = person;
	}

}
