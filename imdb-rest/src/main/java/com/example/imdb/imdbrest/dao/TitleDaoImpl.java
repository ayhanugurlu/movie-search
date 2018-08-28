package com.example.imdb.imdbrest.dao;

import com.example.imdb.imdbrest.entity.TitleAkas;
import com.example.imdb.imdbrest.response.MovieTypeOrderResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.*;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleDaoImpl implements TitleDao {

    @Autowired
    MongoTemplate mongoTemplate;

    private Object o;

    @Override
    public List<TitleAkas> getTitleAkasOrderByRating(String type) {

        MatchOperation
                matchStage = Aggregation.match(new Criteria("types").is(type));
        LookupOperation lookupOperation = Aggregation.lookup("titleratingstsv", "titleId",
                "tconst",
                "rating");

        SortOperation sortOperation = Aggregation.sort(Sort.Direction.ASC, "rating.averageRating");
        Aggregation aggregation = Aggregation.newAggregation(matchStage, lookupOperation, sortOperation).withOptions(Aggregation.newAggregationOptions().allowDiskUse(true).build());

        Object o = mongoTemplate.aggregate(aggregation, "titleakastsv", MovieTypeOrderResp.class);
        return null;
    }
}
