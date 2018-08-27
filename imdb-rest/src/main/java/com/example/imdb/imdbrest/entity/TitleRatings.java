package com.example.imdb.imdbrest.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "titleratingstsv")
public class TitleRatings {

    @Id
    private String id;

    /**
     * (string) - alphanumeric unique identifier of the title
     */
    private String  tconst;
    /**
     *  – weighted average of all the individual user ratings
     */
    private Double averageRating;
    /**
     * - number of votes the title has received
     */
    private int  numVotes;

}
