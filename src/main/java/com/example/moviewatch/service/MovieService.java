package com.example.moviewatch.service;

import com.example.moviewatch.dto.MovieDTO;
import com.example.moviewatch.model.Movie;

import java.util.List;

public interface MovieService {

   List<MovieDTO> getAllMovies();
   MovieDTO getMovieById(Integer id);

   MovieDTO saveMovie(MovieDTO movieDTO);

   MovieDTO updateMovie(Integer id, MovieDTO movieDTO);

   void deleteMovie(Integer id);

}
