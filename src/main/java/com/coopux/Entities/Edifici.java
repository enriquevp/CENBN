package com.coopux.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */

@Entity
public class Edifici {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 60)
    private String nom;

    @OneToMany(targetEntity = Sala.class)
    @JoinColumn(name = "edifici")
    private Set<Sala> sales;

    public Edifici() {

    }

    public Edifici(String nom) {
        this.nom = nom;
        this.sales = new HashSet<Sala>();
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

    public Set<Sala> getSales() {
        return sales;
    }

    public void setSales(Set<Sala> sales) {
        this.sales = sales;
    }

}
