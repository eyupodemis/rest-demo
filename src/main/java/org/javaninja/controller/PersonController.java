package org.javaninja.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.javaninja.http.base.JavaNinjaResponseHeader;
import org.javaninja.http.request.CreatePersonRequest;
import org.javaninja.http.response.CreatePersonResponse;
import org.javaninja.http.response.GetPersonListResponse;
import org.javaninja.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public GetPersonListResponse getPersonList(HttpServletRequest httpRequest, HttpServletResponse httpResponse){
		GetPersonListResponse response = new GetPersonListResponse();
		JavaNinjaResponseHeader header = new JavaNinjaResponseHeader();
		header.setStatusCode(200);
		header.setResponseTime(new Date());
		response.setHeader(header);
		response.setPersons(personService.getAllPersons());
		return response;
	}
	
	@RequestMapping(value = "persons/new", method = RequestMethod.POST)
	public CreatePersonResponse createUserProfile(@Valid @RequestBody CreatePersonRequest request, 
			HttpServletRequest httpRequest, HttpServletResponse httpResponse){
		CreatePersonResponse response = new CreatePersonResponse();
		JavaNinjaResponseHeader header = new JavaNinjaResponseHeader();
		header.setStatusCode(201);
		response.setHeader(header);
		personService.createPerson(request.getPerson());
		return response; 
	}

}
