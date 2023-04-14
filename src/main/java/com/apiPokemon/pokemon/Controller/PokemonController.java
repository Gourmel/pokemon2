package com.apiPokemon.pokemon.Controller;

import com.apiPokemon.pokemon.Entity.Pokemon;
import com.apiPokemon.pokemon.Repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
public class PokemonController {
    @Autowired
    private PokemonRepository pokemonRepository;


    // 1. POST

    @PostMapping("/pokemon")
    public Pokemon addPokemon(@RequestBody Pokemon pokemon) {
        return pokemonRepository.save(pokemon);

    }

    // 2. GET all
    @GetMapping("/pokemonAll")
    public List<Pokemon> getPokemons() {
        return pokemonRepository.findAll();
    }


    // 3. GET by name
    @GetMapping("/recup/{name}")
    public Pokemon getPokemonByName(@PathVariable String name) {

        return pokemonRepository.findByName(name);

    }

    // 4. PUT
    @PutMapping("/modifPokemon/{name}")
    public Pokemon modifPokemon(@PathVariable String name, @RequestBody Pokemon pokemon) {
        Pokemon modifier = pokemonRepository.findByName(name);
        modifier.setName(pokemon.getName());
        pokemonRepository.save(pokemon);
        return modifier;

    }


    // 5. DELETE
    @DeleteMapping("/deletePokemon/{id}")
    public void delePokemon(@PathVariable Long id) {

        pokemonRepository.deleteById(id);

    }


}

