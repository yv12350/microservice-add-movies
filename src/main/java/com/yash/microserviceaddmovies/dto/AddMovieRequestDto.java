package com.yash.microserviceaddmovies.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddMovieRequestDto {
    private String movieName;
    private String description;
    private String genre;
}
