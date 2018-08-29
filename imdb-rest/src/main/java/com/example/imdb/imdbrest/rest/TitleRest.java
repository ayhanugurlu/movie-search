package com.example.imdb.imdbrest.rest;

import com.example.imdb.imdbrest.entity.TitleAkas;
import com.example.imdb.imdbrest.service.NameService;
import com.example.imdb.imdbrest.service.TitleService;
import com.sun.corba.se.impl.orbutil.fsm.NameBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * Created by Ayhan.Ugurlu on 28/08/2018
 */
@RestController
public class TitleRest {
    @Autowired
    TitleService titleService;

    @Autowired
    NameService nameService;

    /**
     * Returns available service names and urls.
     *
     * @return List of string
     */
    @GetMapping("/getTitleAkasOrderByRating/{type}")
    public final List<TitleAkas> getTitleAkasOrderByRating(@PathVariable String type) {

        return titleService.getTitleAkasOrderByRating(type);
    }


    @GetMapping("/findActTypeCasting/{name}")
    public final String findActTypeCasting(@PathVariable String name) {
        return nameService.findActTypeCasting(name);
    }


}
