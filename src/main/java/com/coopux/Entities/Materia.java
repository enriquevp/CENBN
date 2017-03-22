package com.coopux.Entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */

@Entity
@Table(name = "materia")
public class Materia {

    @Id
    @Column
    int id;

    @Column(length = 30)
    String nom;

    @OneToMany
    @JoinTable(name = "materia_te_submateria",
            joinColumns = @JoinColumn(name = "materia_pare", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "submateria", referencedColumnName = "id")
    )

    Set<Materia> materies;

    @Column
    String comentari;

    public Materia() {

    }

    public Materia(String nom, Set<Materia> materies, String comentari) {
        this.nom = nom;
        this.materies = materies;
        this.comentari = comentari;
    }

    public Materia(String nom, Set<Materia> materies) {
        this.nom = nom;
        this.materies = materies;
    }

    public Materia(String nom, String comentari) {
        this.nom = nom;
        this.comentari = comentari;
    }

    public Materia(String nom) {
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

    public Set<Materia> getMateries() {
        return materies;
    }

    public void setMateries(Set<Materia> materies) {
        this.materies = materies;
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
