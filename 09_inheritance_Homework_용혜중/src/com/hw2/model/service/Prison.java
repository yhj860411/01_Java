package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	private Prisoner[] prisoners;
	private int prisonerCount;
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}

	@Override
	public void addPerson(Person person) {
		
	}

	@Override
	public void removePerson(String id) {
		
	}

	@Override
	public void displayAllPersons() {
		
	}

}
