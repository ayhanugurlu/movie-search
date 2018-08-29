package com.example.imdb.imdbrest.service;

import com.example.imdb.imdbrest.entity.NameBasics;
import com.example.imdb.imdbrest.entity.TitleAkas;
import com.example.imdb.imdbrest.repository.NameBasicsRepository;
import com.example.imdb.imdbrest.repository.TitleAkasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Ayhan.Ugurlu on 28/08/2018
 */
@Service
public class NameServiceImpl implements NameService{

    @Autowired
    NameBasicsRepository nameBasicsRepository;


    @Autowired
    TitleAkasRepository titleAkasRepository;


    @Override
    public String findActTypeCasting(String name) {

        List<NameBasics>  nameBasics=  nameBasicsRepository.findByPrimaryName(name);
        final StringBuilder typeCasting = new StringBuilder();
        nameBasics.forEach(nb -> {
            String[] titleArray =  nb.getKnownForTitles().split(",");
            Map<String,Long> typeOfTitle =  Arrays.stream(titleArray).map(s -> {
                TitleAkas titleAkas = titleAkasRepository.findByTitleId(s);
                return titleAkas.getTypes();
            }).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            long maxValue = 0;
            String maxValueKey = null;
            for(String key : typeOfTitle.keySet()){
                long value  =  typeOfTitle.get(key);
                if(value > maxValue){
                    maxValueKey = key;
                    maxValue =value;
                }
            }

            if(maxValueKey != null && maxValue > (titleArray.length/2)){
                typeCasting.append(nb.getPrimaryName());
                typeCasting.append(" ");
                typeCasting.append(maxValueKey);
            }
        });

        return typeCasting.toString();
    }
}
