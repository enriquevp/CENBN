package com.coopux.Repositories;

import com.coopux.Entities.Periodicitat;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by enrique on 22/03/17.
 */
public interface PeriodicitatRepository extends CrudRepository<Periodicitat, Long> {
    List<Periodicitat> findByTipus(String tipus);
}
