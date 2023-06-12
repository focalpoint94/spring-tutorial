package com.in28minutes.learnspringframework;

import game.GameRunner;
import game.GamingConsole;
import game.PackmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new PackmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }


}
