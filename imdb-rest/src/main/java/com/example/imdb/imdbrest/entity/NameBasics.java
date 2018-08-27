package com.example.imdb.imdbrest.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "namebasicstsv")
public class NameBasics {

    @Id
    private String id;

    /**
     * (string) - alphanumeric unique identifier of the name/person
     */
    private String nconst;
    /**
     * (string)– name by which the person is most often credited
     */
    private String  primaryName;

    /**
     *  in YYYY format
     */
    private String  birthYear;

    /**
     *  in YYYY format if applicable, else '\N'
     */
    private String deathYear;
    /**
     * (array of strings)– the top-3 professions of the person
     */
    private String  primaryProfession;

    /**
     * (array of tconsts) – titles the person is known for
     */
    private String knownForTitles;
}
