package com.example.imdb.imdbrest.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "titleprincipalstsv")
public class TitlePrincipals {

    @Id
    private String id;

    /**
     * (string) - alphanumeric unique identifier of the title
     */
    private String tconst ;
    /**
     * (integer) – a number to uniquely identify rows for a given titleId
     */
    private String  ordering ;
    /**
     *  (string) - alphanumeric unique identifier of the name/person
     */
    private String nconst;
    /*
    (string) - the category of job that person was in
     */
    private String category ;
    /**
     * (string) - the specific job title if applicable, else '\N'
     */
    private String job ;

    /**
     * (string) - the name of the character played if applicable, else '\N'
     */
    private String characters ;
}
