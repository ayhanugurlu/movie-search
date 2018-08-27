package com.example.imdb.imdbrest.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "titleepisodetsv")
public class TitleEpisode {

    @Id
    private String id;

    /**
     * (string) - alphanumeric identifier of episode
     */
    private String tconst ;
    /**
     * (string) - alphanumeric identifier of the parent TV Series
     */
    private String parentTconst;
    /**
     * (integer) – season number the episode belongs to
     */
    private int seasonNumber ;

    /**
     *  (integer) – episode number of the tconst in the TV series
     */
    private int episodeNumber;
}
