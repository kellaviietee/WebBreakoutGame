package com.niilo.webbreakout.controllers;

import com.niilo.webbreakout.entities.HighScore;
import com.niilo.webbreakout.services.HighScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/highscore")
public class HighScoreController {

    private final HighScoreService highScoreService;

    @GetMapping("/all")
    public ResponseEntity<List<HighScore>> getAllHighScores() {
        return new ResponseEntity<>(highScoreService.getAllHighScores(), HttpStatus.OK);
    }

    @GetMapping("/top10")
    public ResponseEntity<List<HighScore>> getTop10HighScores() {
        return new ResponseEntity<>(highScoreService.getTop10HighScores(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<HighScore> addHighScore(@RequestBody HighScore highScore) {
        return new ResponseEntity<>(highScoreService.saveHighScore(highScore), HttpStatus.OK);
    }

    @PutMapping("/addall")
    public ResponseEntity<List<HighScore>> addHighScore(@RequestBody List<HighScore> highScores) {
        return new ResponseEntity<>(highScoreService.saveHighScores(highScores), HttpStatus.OK);
    }

}
