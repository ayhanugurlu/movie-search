package com.example.imdb.imdbrest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Ayhan.Ugurlu on 28/08/2018
 */
@Service
public class NameDaoImpl implements NameDao{

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public Object findAct(String name) {

        return null;
    }
}
