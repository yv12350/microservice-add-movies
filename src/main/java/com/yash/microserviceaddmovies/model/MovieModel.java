package com.yash.microserviceaddmovies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "add_movie_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private Integer movieId;
    @Column(name = "movie_name")
    private String movieName;
    @Column(name = "movie_description")
    private String movieDescription;
    @Column(name = "genre")
    private String genre;
}
