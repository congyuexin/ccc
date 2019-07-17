package com.neusoft.springboot.controller;


import com.neusoft.springboot.bean.Person;
import com.neusoft.springboot.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonMapper personMapper;

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable("id") Integer id){
        return personMapper.getPersonById(id);
    }

    @GetMapping("/person")
    public Person insertPerson(Person person){
        personMapper.insertPerson(person);
        return person;
    }



}
