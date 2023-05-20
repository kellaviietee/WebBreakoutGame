package com.niilo.webbreakout.repositories;

import com.niilo.webbreakout.entities.HighScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HighScoreRepository extends JpaRepository<HighScore, Long> {
}
