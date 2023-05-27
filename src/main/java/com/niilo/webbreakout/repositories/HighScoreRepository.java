package com.niilo.webbreakout.repositories;

import com.niilo.webbreakout.entities.HighScore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HighScoreRepository extends JpaRepository<HighScore, Long> {

    List<HighScore> findTop10ByOrderByScoreDesc();
}
