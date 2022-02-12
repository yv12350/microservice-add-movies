package com.yash.microserviceaddmovies.service;

import com.yash.microserviceaddmovies.dao.MovieDao;
import com.yash.microserviceaddmovies.dto.AddMovieRequestDto;
import com.yash.microserviceaddmovies.model.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieDao movieDao;

    public MovieModel addMovie(AddMovieRequestDto addMovieRequestDto) throws Exception {
        try {
            MovieModel movieModel = new MovieModel();
            movieModel.setMovieName(addMovieRequestDto.getMovieName());
            movieModel.setMovieDescription(addMovieRequestDto.getDescription());
            movieModel.setGenre(addMovieRequestDto.getGenre());
            return movieDao.save(movieModel);
        } catch (Exception e) {
            throw new Exception(e.getMessage());

        }
    }

    public List<MovieModel> listAllMovies() throws Exception {
        try {
            return movieDao.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());

        }
    }

    public List<MovieModel> getMovieById(Integer id) throws Exception {
        try {
            return movieDao.findByMovieId(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
