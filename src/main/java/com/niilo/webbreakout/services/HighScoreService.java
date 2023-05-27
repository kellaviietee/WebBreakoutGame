package com.niilo.webbreakout.services;

import com.niilo.webbreakout.entities.HighScore;
import com.niilo.webbreakout.entities.Player;
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

    public List<HighScore> getTop10HighScores() {
        return highScoreRepository.findTop10ByOrderByScoreDesc();
    }

    public HighScore saveHighScore(HighScore score) {
        return highScoreRepository.save(score);
    }

    public List<HighScore> saveHighScores(List<HighScore> highScores) {
        for (HighScore highScore : highScores) {
            if (playerService.findPlayerByName(highScore.getPlayer().getName()) == null) {
                Player player = new Player();
                player.setName(highScore.getPlayer().getName());
                highScore.setPlayer(playerService.updatePlayer(player));
            } else {
                highScore.setPlayer(playerService.findPlayerByName(highScore.getPlayer().getName()));
            }
        }
        return highScoreRepository.saveAll(highScores);
    }
}
