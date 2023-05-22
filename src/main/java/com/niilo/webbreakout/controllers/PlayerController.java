package com.niilo.webbreakout.controllers;

import com.niilo.webbreakout.entities.Player;
import com.niilo.webbreakout.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/player")
public class PlayerController {

    private final PlayerService playerService;

    @PostMapping("/add")
    public ResponseEntity<Player> addHighScore(@RequestBody Player player) {
        return new ResponseEntity<>(playerService.updatePlayer(player), HttpStatus.OK);
    }
}
