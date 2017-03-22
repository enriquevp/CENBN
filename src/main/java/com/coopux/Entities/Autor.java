package com.coopux.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */
@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @Column
    int id;

    @Column(length = 60)
    String nom;

    @Column
    String comentari;

    public Autor() {

    }

    public Autor(String nom, String comentari) {
        this.nom = nom;
        this.comentari = comentari;
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

    public String getComentari() {
        return comentari;
    }

    public void setComentari(String comentari) {
        this.comentari = comentari;
    }
}
