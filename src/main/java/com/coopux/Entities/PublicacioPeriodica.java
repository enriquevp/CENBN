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

    public PublicacioPeriodica(int codiCenbn, String issn, Materia materia, Editor editor, Set<Idioma> idioma, Tipus tipus, Date dataPublicacio, Periodicitat periodicitat, String comentari) {
        this.setCodiCenbn(codiCenbn);
        this.issn = issn;
        this.setMateria(materia);
        this.setEditor(editor);
        this.setIdiomes(idioma);
        this.setTipus(tipus);
        this.dataPublicacio = dataPublicacio;
        this.periodicitat = periodicitat;
        this.setComentari(comentari);
    }



}
