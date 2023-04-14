package com.apiPokemon.pokemon.Repository;

import com.apiPokemon.pokemon.Entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
    Pokemon findByName(String name);


}