package com.niilo.webbreakout.controllers;

import com.niilo.webbreakout.services.HighScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/highscore")
public class HighScoreController {

    private HighScoreService highScoreService;

}
