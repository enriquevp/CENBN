package com.coopux.Entities;

import javax.persistence.*;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */

@Entity
@Table(name = "editor")
public class Editor {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 30)
    private String nom;

    @Column(length = 30)
    private String localitat;

    @Column
    private String comentari;

    public Editor() {

    }

    public Editor(String nom, String localitat) {
        this.nom = nom;
        this.localitat = localitat;
    }

    public Editor(String nom, String localitat, String comentari) {
        this.nom = nom;
        this.localitat = localitat;
        this.comentari = comentari;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLocalitat() {
        return localitat;
    }

    public void setLocalitat(String localitat) {
        this.localitat = localitat;
    }

    public String getComentari() {
        return comentari;
    }

    public void setComentari(String comentari) {
        this.comentari = comentari;
    }

    @Override
    public String toString() {
        return nom;
    }
}
