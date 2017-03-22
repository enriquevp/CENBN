package com.coopux.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */
@Entity
@Table(name = "armari")
public class Armari {
    @Id
    @Column
    int id;

    @Column(length = 60)
    String nom;

    @OneToMany(targetEntity = Prestatge.class)
    @JoinColumn(name = "id")
    Set<Prestatge> prestatges;


    public Armari() {

    }

    public Armari(String nom) {
        this.nom = nom;
        this.prestatges = new HashSet<Prestatge>();
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

    public Set<Prestatge> getPrestatges() {
        return prestatges;
    }

    public void setPrestatges(Set<Prestatge> prestatges) {
        this.prestatges = prestatges;
    }
}
