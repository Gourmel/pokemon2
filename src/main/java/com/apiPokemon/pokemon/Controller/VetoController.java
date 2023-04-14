package com.apiPokemon.pokemon.Controller;

import com.apiPokemon.pokemon.Entity.Pokemon;
import com.apiPokemon.pokemon.Entity.Veto;
import com.apiPokemon.pokemon.Repository.VetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class VetoController {
@Autowired
    private VetoRepository vetoRepository;

    @PostMapping("/veto")
    public Veto addVeto(@RequestBody Veto veto) {
         vetoRepository.save(veto);
        return veto;

    }


}
