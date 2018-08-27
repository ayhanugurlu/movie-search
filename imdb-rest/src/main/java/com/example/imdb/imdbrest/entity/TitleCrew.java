package com.example.imdb.imdbrest.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "titlecrewtsv")
public class TitleCrew {


    @Id
    private String id;

    /**
     * (string) - alphanumeric unique identifier of the title
     */
    private String tconst;

    /**
     *  (array of nconsts) - director(s) of the given title
     */
    private String directors;
    /**
     * (array of nconsts) – writer(s) of the given title
     */
    private String writers;
}
