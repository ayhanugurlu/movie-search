package com.example.imdb.imdbrest.dao;

import com.example.imdb.imdbrest.entity.TitleAkas;

import java.util.List;

public interface TitleDao {
    List<TitleAkas>  getTitleAkasOrderByRating(String type);
}
