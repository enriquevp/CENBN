package com.coopux;

import com.coopux.Entities.Document;
import com.coopux.Entities.Llibre;
import com.coopux.Entities.Tipus;
import com.coopux.Repositories.DocumentRepository;
import com.coopux.Repositories.LlibreRepository;
import com.coopux.Repositories.TipusRepository;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * Created by Enrique Villarreal on 17/03/2017.
 */

@SpringUI
public class VaadinUI extends UI {
    @Autowired
    LlibreRepository llibreRepository;

    @Autowired
    TipusRepository tipusRepository;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout rootLayout = new VerticalLayout();

        Grid<Llibre> gridM = new Grid<>(Llibre.class);

        ArrayList<Llibre> llibres = new ArrayList<Llibre>();
        llibreRepository.findByMateria("Botànica")
                .forEach(llibres::add);

        gridM.setItems(llibres);

        // Si dejamos el set como columna en cualquier sitio, petará.
        gridM.setColumns("codiCenbn", "isbn", "tipus", "titol", "materia", "editor", "comentari");

        rootLayout.addComponent(gridM);

        Tipus ejemplo = new Tipus("Fighting");
        tipusRepository.save(ejemplo);

        setContent(rootLayout);

    }
}
