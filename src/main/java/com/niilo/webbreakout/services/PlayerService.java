package com.niilo.webbreakout.services;

import com.niilo.webbreakout.entities.Player;
import com.niilo.webbreakout.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;


    public Player updatePlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player findPlayerByName(String name) {
        return playerRepository.findByName(name);
    }
}
