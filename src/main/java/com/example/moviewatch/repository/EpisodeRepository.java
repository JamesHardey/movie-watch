package com.example.moviewatch.repository;

import com.example.moviewatch.model.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EpisodeRepository extends JpaRepository<Episode, Integer> {

}
