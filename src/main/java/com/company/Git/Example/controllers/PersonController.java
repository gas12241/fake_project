package com.company.Git.Example.controllers;

import com.company.Git.Example.models.Person;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Random;

public class PersonController {

    private Person[] people = {
            new Person("name", 14, BigDecimal.valueOf(175.45)),
            new Person("Shaq", 52, BigDecimal.valueOf(242.22)),
            new Person("Kobe", 14, BigDecimal.valueOf(222.45)),
            new Person("Steph", 14, BigDecimal.valueOf(200.72)),
    };

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Person getPerson() {

        Random rand = new Random();

        return people[rand.nextInt(4)];
    }
}
