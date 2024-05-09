package com.gfg.writereview.service;

import com.gfg.writereview.domain.Movie;
import com.gfg.writereview.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private MovieRepository movieRepository;

    //constructor injection
    public AdminService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }
}
