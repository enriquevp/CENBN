package com.coopux.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */

@Entity
@Table(name = "tipus")
public class Tipus {
    @Id
    @Column
    int id;

    @Column(name = "tipus", length = 25)
    String nom;

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
        return "Tipus{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
