package com.niilo.webbreakout.services;

import com.niilo.webbreakout.entities.HighScore;
import com.niilo.webbreakout.repositories.HighScoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HighScoreService {

    private final HighScoreRepository highScoreRepository;
    private final PlayerService playerService;

    public List<HighScore> getAllHighScores() {
        return highScoreRepository.findAll();
    }

    public HighScore saveHighScore(HighScore score) {
        return highScoreRepository.save(score);
    }

    public List<HighScore> saveHighScores(List<HighScore> highScores) {
        for (HighScore highScore : highScores) {
            if (playerService.findPlayerByName(highScore.getPlayer().getName()) == null) {
                highScore.setPlayer(playerService.updatePlayer(highScore.getPlayer()));
            } else {
                highScore.setPlayer(playerService.findPlayerByName(highScore.getPlayer().getName()));
            }
        }
        return highScoreRepository.saveAll(highScores);
    }
}
