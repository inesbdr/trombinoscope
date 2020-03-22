package com.example.test.DAO;

import com.example.test.DTO.Person;

import java.util.List;

public interface IPersonDAO {

    public List<Person> getPersons();

    public void addPerson(Person person);

    public void removePerson(Person person);

}
