package com.example.imdb.imdbrest.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "titlebasicstsv")
public class TitleBasics {
    @Id
    private String id;

    /**
     *  (string) - alphanumeric unique identifier of the title
     */
    private String tconst;

    /**
     * (string) – the type/format of the title (e.g. movie, short, tvseries, tvepisode, video, etc)
     */
    private String titleType ;

    /**
     *  (string) – the more popular title / the title used by the filmmakers on promotional materials at the point of release
     */
    private String primaryTitle;

    /**
     * (string) - original title, in the original language
     */
    private String originalTitle;

    /**
     * (boolean) - 0: non-adult title; 1: adult title
     */
    private int isAdult ;

    /**
     *  (YYYY) – represents the release year of a title. In the case of TV Series, it is the series start year
     */
    private String startYear;


    /**
     * (YYYY) – TV Series end year. ‘\N’ for all other title types
     */
    private String endYear ;
    /**
     * primary runtime of the title, in minutes
     */
    private String runtimeMinutes;

    /**
     *(string array) – includes up to three genres associated with the title
     */
    private String genres ;
}
