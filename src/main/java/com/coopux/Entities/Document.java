package com.coopux.Entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "document")
public abstract class Document {
    @Id
    @Column(name = "codi_cenbn")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codiCenbn;

    @Column(length = 100)
    private String titol;

    @OneToOne
    @JoinColumn(name = "materia")
    private Materia materia;

    @OneToOne(targetEntity = Editor.class)
    @JoinColumn(name = "editor")
    private Editor editor;

    @ManyToMany
    @JoinTable(name = "document_escrit_en_idiomes",
            joinColumns = @JoinColumn(name = "document", referencedColumnName = "codi_cenbn"),
            inverseJoinColumns = @JoinColumn(name = "idioma", referencedColumnName = "id")
    )
    private Set<Idioma> idiomes;

    @OneToOne
    @JoinColumn(name = "tipus")
    private Tipus tipus;

    @Column
    private String comentari;

    public int getCodiCenbn() {
        return codiCenbn;
    }

    public void setCodiCenbn(int codiCenbn) {
        this.codiCenbn = codiCenbn;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    public Set<Idioma> getIdiomes() {
        return idiomes;
    }

    public void setIdiomes(Set<Idioma> idiomes) {
        this.idiomes = idiomes;
    }

    public Tipus getTipus() {
        return tipus;
    }

    public void setTipus(Tipus tipus) {
        this.tipus = tipus;
    }

    public String getComentari() {
        return comentari;
    }

    public void setComentari(String comentari) {
        this.comentari = comentari;
    }
}
