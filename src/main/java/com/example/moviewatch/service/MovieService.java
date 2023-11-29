package com.example.moviewatch.service;

import com.example.moviewatch.dto.CreateEpisodeDTO;
import com.example.moviewatch.dto.CreateMovieDTO;
import com.example.moviewatch.dto.MovieDTO;
import com.example.moviewatch.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface MovieService {

   List<MovieDTO> getAllMovies();
   MovieDTO getMovieById(Integer id);

   MovieDTO saveMovie(CreateMovieDTO movieDTO);

   MovieDTO updateMovie(Integer id, MovieDTO movieDTO);

    MovieDTO addEpisodeToMovie(Integer movieId,List<CreateEpisodeDTO> episodesDTO);

   void deleteMovie(Integer id);

}
