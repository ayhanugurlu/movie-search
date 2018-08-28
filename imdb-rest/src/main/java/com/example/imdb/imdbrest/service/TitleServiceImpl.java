package com.example.imdb.imdbrest.service;

import com.example.imdb.imdbrest.dao.TitleDao;
import com.example.imdb.imdbrest.entity.TitleAkas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ayhan.Ugurlu on 28/08/2018
 */
@Service
public class TitleServiceImpl implements TitleService {

    @Autowired
    TitleDao titleDao;

    @Override
    public List<TitleAkas> getTitleAkasOrderByRating(String type) {
        return titleDao.getTitleAkasOrderByRating(type);
    }
}
