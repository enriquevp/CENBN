package com.coopux.Repositories;

import com.coopux.Entities.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.print.Doc;
import java.util.List;

/**
 * Created by enrique on 22/03/17.
 */
public interface DocumentBaseRepository<T extends Document> extends CrudRepository<T, Long> {
    List<T> findByTitol(String titol);

    @Query("select e from #{#entityName} as e where e.materia.nom = ?1 ")
    List<T> findByMateria(String materia);

    @Query("select e from #{#entityName} as e where e.editor.nom = ?1")
    List<T> findByEditor(String editor);

    @Query("select e from #{#entityName} e left join e.idiomes idioma where idioma.nom = ?1")
    List<T> findByIdioma(String idioma);

    @Query("select e from #{#entityName} e where e.tipus.nom = ?1")
    List<T> findByTipus(Tipus tipus);
}
