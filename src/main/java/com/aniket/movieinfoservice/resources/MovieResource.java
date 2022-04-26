package com.aniket.movieinfoservice.resources;

import com.aniket.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movies")
public class MovieResource {

    @GetMapping(path = "/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){

        return new Movie(movieId, "KGF Chapter 1");
    }
}
