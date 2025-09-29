package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{
	
	private Employee[] employees;
	private int employeeCount;
	
	public Company(int size) {
		employees = new Employee[size];
		employeeCount = 0;
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
