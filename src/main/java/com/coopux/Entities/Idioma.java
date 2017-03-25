package com.coopux.Entities;

import javax.persistence.*;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */

@Entity
@Table(name = "idioma")
public class Idioma {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "idioma", length = 25)
    private String nom;

    public Idioma() {

    }

    public Idioma(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
