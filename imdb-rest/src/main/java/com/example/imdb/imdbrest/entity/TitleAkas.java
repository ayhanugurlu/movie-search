package com.example.imdb.imdbrest.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Ayhan.Ugurlu on 27/08/2018
 */
@Document(collection = "titleakastsv")
public class TitleAkas {


    @Id
    private String id;
    /**
     *  (string) - a tconst, an alphanumeric unique identifier of the title
     */

    private String titleId;
    /**
     *  (integer) – a number to uniquely identify rows for a given titleId
     */
    private int ordering;
    /**
     *  (string) – the localized title
     */
    private String title;
    /**
     *  (string) - the region for this version of the title
     */
    private String region;
    /**
     *  (string) - the language of the title
     */
    private String language;
    private Types  types;
    /**
     * (array) - Additional terms to describe this alternative title, not enumerated
     */
    private String attributes;
    /**
     *  (boolean) – 0: not original title; 1: original title
     */
    private int isOriginalTitle;
}
