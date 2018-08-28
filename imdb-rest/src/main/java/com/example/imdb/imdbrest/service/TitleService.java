package com.example.imdb.imdbrest.service;

import com.example.imdb.imdbrest.entity.TitleAkas;

import java.util.List;

/**
 * Created by Ayhan.Ugurlu on 28/08/2018
 */
public interface TitleService {


    List<TitleAkas> getTitleAkasOrderByRating(String type);
}
