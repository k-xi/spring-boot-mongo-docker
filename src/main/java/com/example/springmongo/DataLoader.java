package com.example.springmongo;

import com.example.springmongo.model.Movie;
import com.example.springmongo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public void run(String... args) throws Exception {
        // Delete all existing data
        movieRepository.deleteAll();

        // Add sample movies
        Movie movie1 = new Movie();
        movie1.setTitle("The Shawshank Redemption");
        movie1.setDirector("Frank Darabont");

        Movie movie2 = new Movie();
        movie2.setTitle("The Godfather");
        movie2.setDirector("Francis Ford Coppola");

        Movie movie3 = new Movie();
        movie3.setTitle("The Dark Knight");
        movie3.setDirector("Christopher Nolan");

        // Save all the movies
        movieRepository.saveAll(Arrays.asList(movie1, movie2, movie3));

        System.out.println("Movies loaded into the database.");
    }
}
