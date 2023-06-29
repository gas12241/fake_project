package com.company.Git.Example.models;

import java.util.List;
import java.util.Objects;

public class Pokemon {
    private Integer pokemonId;
    private String name;
    private Integer health;

    public Pokemon(Integer pokemonId, String name, Integer health) {
        this.pokemonId = pokemonId;
        this.name = name;
        this.health = health;
    }

    public Integer getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(Integer pokemonId) {
        this.pokemonId = pokemonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(getPokemonId(), pokemon.getPokemonId()) && Objects.equals(getName(), pokemon.getName()) && Objects.equals(getHealth(), pokemon.getHealth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPokemonId(), getName(), getHealth());
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "pokemonId=" + pokemonId +
                ", name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
