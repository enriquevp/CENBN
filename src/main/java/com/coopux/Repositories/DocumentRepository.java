package com.coopux.Repositories;

import com.coopux.Entities.*;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by enrique on 22/03/17.
 */
public interface DocumentRepository extends CrudRepository<Document, Long> {
    List<Document> findByTitol(String titol);
    List<Document> findByMateria(Materia materia);
    List<Document> findByEditor(Editor editor);
    List<Document> findByIdiomes(Idioma idioma);
    List<Document> findByTipus(Tipus tipus);
}
