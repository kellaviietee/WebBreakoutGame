package com.niilo.webbreakout.repositories;

import com.niilo.webbreakout.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
