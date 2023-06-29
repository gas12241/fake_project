package com.company.Git.Example.controllers;

import com.company.Git.Example.models.Pokemon;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@RestController
public class PokemonController {

    private Pokemon[] pokemon = {
            new Pokemon(0, "Charizard", 150),
            new Pokemon(1, "Wartortle", 100),
            new Pokemon(2, "Pikachu", 50),
            new Pokemon(3, "Mew", 200)
    };

    @RequestMapping(value = "/pokemon", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Pokemon getPokemon() {

        Random rand = new Random();

        return pokemon[rand.nextInt(4)];
    }
}
