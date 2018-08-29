package com.example.imdb.imdbrest.repository;


import com.example.imdb.imdbrest.entity.NameBasics;
import com.example.imdb.imdbrest.entity.TitleAkas;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


public interface NameBasicsRepository extends MongoRepository<NameBasics, String> {

    List<NameBasics> findByPrimaryName(String name);


}
