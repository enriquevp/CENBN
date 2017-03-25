package com.coopux.Entities;

import javax.persistence.*;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */
@Entity
@Table(name = "periodicitat")
public class Periodicitat {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String tipus;

    public Periodicitat() {

    }

    public Periodicitat(String tipus) {
        this.tipus = tipus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
}
