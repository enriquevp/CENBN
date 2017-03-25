package com.coopux.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */
@Entity
@Table(name = "sala")
public class Sala {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 60)
    private String nom;

    @OneToMany(targetEntity = Armari.class)
    @JoinColumn(name = "sala")
    private Set<Armari> armaris;


    public Sala() {

    }

    public Sala(String nom) {
        this.nom = nom;
        this.armaris = new HashSet<Armari>();
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

    public Set<Armari> getArmaris() {
        return armaris;
    }

    public void setArmaris(Set<Armari> armaris) {
        this.armaris = armaris;
    }
}
