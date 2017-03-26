package com.coopux.Repositories;

import com.coopux.Entities.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Enrique Villarreal on 18/03/2017.
 */
public interface LlibreRepository extends DocumentBaseRepository<Llibre> {
    List<Llibre> findByIsbn(String isbn);
    List<Llibre> findByAnyPublicacio(int anyPublicacio);
}
