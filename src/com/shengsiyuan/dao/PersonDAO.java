package com.shengsiyuan.dao;

import java.util.List;

import com.shengsiyuan.model.Person;

public interface PersonDAO {
	
	public void savePerson(Person person);
	
	public List<Person> listAllPersons();
	
	public void removePerson(String id);
	
	public Person getSinglePerson(String id);
	
	public void updatePerson(Person person);
}
