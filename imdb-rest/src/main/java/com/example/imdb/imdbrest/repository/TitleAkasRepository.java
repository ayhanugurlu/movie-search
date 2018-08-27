package com.example.imdb.imdbrest.repository;

import com.example.imdb.imdbrest.entity.TitleAkas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Ayhan.Ugurlu on 27/08/2018
 */
@RepositoryRestResource(collectionResourceRel = "titleakas", path = "titleakas")
public interface TitleAkasRepository  extends MongoRepository<TitleAkas,String> {

    List<TitleAkas> findByTitle(@Param("title") String title);
    TitleAkas findByTitleId(@Param("id") String id);

}
