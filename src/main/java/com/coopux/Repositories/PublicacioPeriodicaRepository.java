package com.coopux.Repositories;

import com.coopux.Entities.*;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Enrique Villarreal on 18/03/2017.
 */
public interface PublicacioPeriodicaRepository extends DocumentBaseRepository<PublicacioPeriodica> {

    List<PublicacioPeriodica> findByIssn(String issn);
    List<PublicacioPeriodica> findByLocalitat(String localitat);
    List<PublicacioPeriodica> findByDataPublicacio(LocalDate dataPublicacio);
    List<PublicacioPeriodica> findByPeriodicitat(Periodicitat periodicitat);
}
