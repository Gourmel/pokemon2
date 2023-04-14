package com.apiPokemon.pokemon.Entity;

import jakarta.persistence.*;

@Entity
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;



    @ManyToOne
    @JoinColumn(name = "veterinaire_id")
    private Veto veterinaire;

    // Getters et setters

    public Pokemon() {
    }

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
