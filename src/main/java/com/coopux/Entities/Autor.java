package com.coopux.Entities;

import javax.persistence.*;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */
@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 60)
    private String nom;

    @Column
    private String comentari;

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
