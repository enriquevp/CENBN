package com.coopux.Repositories;

import com.coopux.Entities.Idioma;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by enrique on 25/03/17.
 */
public interface IdiomaRepository extends CrudRepository<Idioma, Long> {
    List<Idioma> findByNom(String nom);
}
