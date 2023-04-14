package com.apiPokemon.pokemon.Entity;

import jakarta.persistence.*;

@Entity
public class Veto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public Veto() {
    }
    @ManyToOne
    @JoinColumn(name = "veterinaire_id")


    public Veto(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
