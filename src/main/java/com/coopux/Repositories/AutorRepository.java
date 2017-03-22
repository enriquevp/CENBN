package com.coopux.Repositories;

import com.coopux.Entities.Autor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by enrique on 22/03/17.
 */
public interface AutorRepository extends CrudRepository<Autor, Long> {
    List<Autor> findByNom(String nom);
}
