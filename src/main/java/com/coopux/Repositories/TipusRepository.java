package com.coopux.Repositories;

import com.coopux.Entities.Tipus;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by enrique on 25/03/17.
 */
public interface TipusRepository extends CrudRepository<Tipus, Long> {
    List<Tipus> findByNom(String nom);
}
