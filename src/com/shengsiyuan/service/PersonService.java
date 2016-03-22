package com.shengsiyuan.service;

import java.util.List;

import com.shengsiyuan.model.Person;

public interface PersonService {
	public void savePerson(Person person);
	
	public List<Person> listAllPersons();
	
	public void deletePerson(String id);
	
	public Person getSinglePersonById(String id);
	
	public void updatePerson(Person person);
}
