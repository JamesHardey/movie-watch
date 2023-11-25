package com.example.moviewatch.service;

import com.example.moviewatch.dto.EpisodeDTO;

import java.util.List;

public interface EpisodeService {

    List<EpisodeDTO> getAllEpisodes();

    EpisodeDTO getEpisodeById(Integer id);

    EpisodeDTO saveEpisode(EpisodeDTO episodeDTO);

    EpisodeDTO updateEpisode(Integer id, EpisodeDTO episodeDTO);

    void deleteEpisode(Integer id);
}
