package com.coopux.Repositories;

import com.coopux.Entities.Materia;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Enrique Villarreal on 18/03/2017.
 */
public interface MateriaRepository extends CrudRepository<Materia, Long>{
    List<Materia> findByNom(String nom);
}
