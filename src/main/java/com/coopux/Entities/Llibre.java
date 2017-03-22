package com.coopux.Entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */

@Entity
@Table(name = "llibre")
public class Llibre extends Document {

    @Column(length = 17)
    private String isbn;

    @Column(length = 4)
    private String anyPublicacio;

    @Column(length = 4)
    private String edicio;

    @ManyToMany
    @JoinTable(name = "llibre_escrit_per_autors",
            joinColumns = @JoinColumn(name = "llibre", referencedColumnName = "codi_cenbn"),
            inverseJoinColumns = @JoinColumn(name = "autor", referencedColumnName = "id")
    )
    private Set<Autor> autors;

    public Llibre() {

    }

    public Llibre(int codiCenbn, String isbn, Materia materia, Editor editor, Set<Idioma> idiomes, Tipus tipus, String anyPublicacio, String edicio, String comentari) {
        this.setCodiCenbn(codiCenbn);
        this.isbn = isbn;
        this.setMateria(materia);
        this.setEditor(editor);
        this.setIdiomes(idiomes);
        this.setTipus(tipus);
        this.anyPublicacio = anyPublicacio;
        this.edicio = edicio;
        this.setComentari(comentari);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAnyPublicacio() {
        return anyPublicacio;
    }

    public void setAnyPublicacio(String anyPublicacio) {
        this.anyPublicacio = anyPublicacio;
    }

    public String getEdicio() {
        return edicio;
    }

    public void setEdicio(String edicio) {
        this.edicio = edicio;
    }

    public Set<Autor> getAutors() {
        return autors;
    }

    public void setAutors(Set<Autor> autors) {
        this.autors = autors;
    }
}
