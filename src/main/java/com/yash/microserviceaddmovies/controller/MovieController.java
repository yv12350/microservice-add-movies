package com.yash.microserviceaddmovies.controller;

import com.yash.microserviceaddmovies.dto.AddMovieRequestDto;
import com.yash.microserviceaddmovies.model.MovieModel;
import com.yash.microserviceaddmovies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("add-movie")
    public ResponseEntity<MovieModel> addMovie(@RequestBody AddMovieRequestDto addMovieRequestDto) {
        try {
            return new ResponseEntity(movieService.addMovie(addMovieRequestDto), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("list-all-movie")
    public ResponseEntity<List<MovieModel>> listAllMovies() {
        try {
            return new ResponseEntity(movieService.listAllMovies(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
