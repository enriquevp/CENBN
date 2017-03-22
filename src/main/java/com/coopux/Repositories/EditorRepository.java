package com.coopux.Repositories;

import com.coopux.Entities.Editor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Enrique Villarreal on 18/03/2017.
 */
public interface EditorRepository extends CrudRepository<Editor, Long> {
    List<Editor> findByNom(String nom);
    List<Editor> findByLocalitat(String nom);
}
