package com.example.moviewatch.controller;

import com.example.moviewatch.dto.MovieDTO;
import com.example.moviewatch.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieService movieService;

    public MovieController(
            MovieService movieService
    ){
        this.movieService = movieService;
    }
    // Method to get all movies
    @GetMapping
    public ResponseEntity<List<MovieDTO>> getAllMovies() {
        List<MovieDTO> movies = movieService.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    // Method to get a movie by id
    @GetMapping("/{id}")
    public ResponseEntity<MovieDTO> getMovieById(@PathVariable Integer id) {
        MovieDTO movie = movieService.getMovieById(id);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

    // Method to save a movie
    @PostMapping
    public ResponseEntity<MovieDTO> saveMovie(@RequestBody MovieDTO movieDTO) {
        MovieDTO movie = movieService.saveMovie(movieDTO);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }

    // Method to update a movie
    @PutMapping("/{id}")
    public ResponseEntity<MovieDTO> updateMovie(@PathVariable Integer id, @RequestBody MovieDTO movieDTO) {
        MovieDTO movie = movieService.updateMovie(id, movieDTO);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

    // Method to delete a movie
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Integer id) {
        movieService.deleteMovie(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

