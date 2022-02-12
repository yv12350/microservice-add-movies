package com.yash.microserviceaddmovies.dao;

import com.yash.microserviceaddmovies.model.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDao extends JpaRepository<MovieModel, Integer> {


}
