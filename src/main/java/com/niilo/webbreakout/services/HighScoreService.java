package com.niilo.webbreakout.services;

import com.niilo.webbreakout.repositories.HighScoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HighScoreService {

    private HighScoreRepository highScoreRepository;
}
