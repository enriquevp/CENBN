package com.coopux.Entities;

import javax.persistence.*;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */

@Entity
@Table(name = "prestatge")
public class Prestatge {
    @Id
    @Column
    int id;

    @Column(length = 60)
    String nom;

    @ManyToOne
    @JoinColumn(name = "armari")
    Armari armari;

//    @OneToMany
//    List<Exemplar> exemplars;


    public Prestatge() {

    }

    public Prestatge(String nom, Armari armari) {
        this.nom = nom;
        this.armari = armari;
     //   this.exemplars = new ArrayList<Exemplar>();
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

    public Armari getArmari() {
        return armari;
    }

    public void setArmari(Armari armari) {
        this.armari = armari;
    }

    //    public List<Exemplar> getExemplars() {
//        return exemplars;
//    }
//
//    public void setExemplars(List<Exemplar> exemplars) {
//        this.exemplars = exemplars;
//    }
}
