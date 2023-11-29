package com.example.moviewatch.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CreateMovieDTO {
    private String title;
    private String description;
    private String imageUrl;
    private String youtubeUrl;
}
