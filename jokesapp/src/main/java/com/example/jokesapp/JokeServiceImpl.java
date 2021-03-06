package com.example.jokesapp;

import com.example.jokesapp.service.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
