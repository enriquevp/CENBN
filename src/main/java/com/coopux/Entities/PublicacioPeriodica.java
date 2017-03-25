package com.coopux.Entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * Created by Enrique Villarreal on 17/03/2017.
 */

@Entity
@Table(name = "publicacio_periodica")
public class PublicacioPeriodica extends Document {

    @Column(length = 9)
    private String issn;

    @Column
    private String localitat;

    @Column
    @Temporal(TemporalType.DATE)
    private Date dataPublicacio;

    @OneToOne
    @JoinColumn(name = "periodicitat")
    private Periodicitat periodicitat;

    @Column
    private String comentari;

    public PublicacioPeriodica() {

    }

    public PublicacioPeriodica(String issn, String titol, Materia materia, Editor editor, Set<Idioma> idioma, Tipus tipus, Date dataPublicacio, Periodicitat periodicitat, String comentari) {
        this.issn = issn;
        this.setTitol(titol);
        this.setMateria(materia);
        this.setEditor(editor);
        this.setIdiomes(idioma);
        this.setTipus(tipus);
        this.dataPublicacio = dataPublicacio;
        this.periodicitat = periodicitat;
        this.setComentari(comentari);
    }


    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getLocalitat() {
        return localitat;
    }

    public void setLocalitat(String localitat) {
        this.localitat = localitat;
    }

    public Date getDataPublicacio() {
        return dataPublicacio;
    }

    public void setDataPublicacio(Date dataPublicacio) {
        this.dataPublicacio = dataPublicacio;
    }

    public Periodicitat getPeriodicitat() {
        return periodicitat;
    }

    public void setPeriodicitat(Periodicitat periodicitat) {
        this.periodicitat = periodicitat;
    }

    @Override
    public String getComentari() {
        return comentari;
    }

    @Override
    public void setComentari(String comentari) {
        this.comentari = comentari;
    }
}
