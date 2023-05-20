package com.niilo.webbreakout.services;

import com.niilo.webbreakout.entities.HighScore;
import com.niilo.webbreakout.repositories.HighScoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HighScoreService {

    private HighScoreRepository highScoreRepository;

    public List<HighScore> getAllHighScores() {
        return highScoreRepository.findAll();
    }

    public HighScore saveHighScore(HighScore score) {
        return highScoreRepository.save(score);
    }
}
