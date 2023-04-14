package com.apiPokemon.pokemon.Repository;


import com.apiPokemon.pokemon.Entity.Veto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetoRepository extends JpaRepository<Veto, Long> {
    Veto findByName(String name);
}
