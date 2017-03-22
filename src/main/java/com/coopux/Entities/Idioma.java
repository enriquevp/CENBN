package com.coopux.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */

@Entity
@Table(name = "idioma")
public class Idioma {
    @Id
    @Column
    int id;

    @Column(name = "idioma", length = 25)
    String nom;

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
