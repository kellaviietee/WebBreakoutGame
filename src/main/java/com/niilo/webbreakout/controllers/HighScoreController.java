package com.niilo.webbreakout.controllers;

import com.niilo.webbreakout.entities.HighScore;
import com.niilo.webbreakout.services.HighScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/highscore")
public class HighScoreController {

    private HighScoreService highScoreService;

    @GetMapping("/all")
    public ResponseEntity<List<HighScore>> getAllHighScores() {
        return new ResponseEntity<>(highScoreService.getAllHighScores(), HttpStatus.OK);
    }

}
