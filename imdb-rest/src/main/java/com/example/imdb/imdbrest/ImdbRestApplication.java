package com.example.imdb.imdbrest;

import com.example.imdb.imdbrest.repository.TitleAkasRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ImdbRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImdbRestApplication.class, args);
    }
}
