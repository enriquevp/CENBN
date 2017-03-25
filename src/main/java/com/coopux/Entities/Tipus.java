package com.coopux.Entities;

import javax.persistence.*;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */

@Entity
@Table(name = "tipus")
public class Tipus {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipus", length = 25)
    private String nom;

    public Tipus() {

    }

    public Tipus(String nom) {
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

    @Override
    public String toString() {
        return this.nom;
    }
}
