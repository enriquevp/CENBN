package com.coopux.Repositories;

import com.coopux.Entities.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Enrique Villarreal on 18/03/2017.
 */
public interface LlibreRepository extends CrudRepository<Llibre, Long> {
    List<Llibre> findByTitol(String titol);

    @Query("select l from Llibre l where l.materia.nom = ?1")
    List<Llibre> findByMateria(String materia);

    @Query("select l from Llibre l where l.editor.nom = ?1")
    List<Llibre> findByEditor(String editor);

    @Query("select l from Llibre l where l.tipus.nom = ?1")
    List<Llibre> findByTipus(Tipus tipus);
    List<Llibre> findByIsbn(String isbn);
    List<Llibre> findByAnyPublicacio(int anyPublicacio);
}
