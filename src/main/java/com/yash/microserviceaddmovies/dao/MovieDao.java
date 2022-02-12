package com.yash.microserviceaddmovies.dao;

import com.yash.microserviceaddmovies.model.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Repository
public interface MovieDao extends JpaRepository<MovieModel, Integer> {
    @Transactional
    public List<MovieModel> findByMovieId(Integer movieId);


}
