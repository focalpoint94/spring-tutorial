package com.in28minutes.learnspringframework;

import game.GameRunner;
import game.PackmanGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {

//        var game = new MarioGame();

//        var game = new SuperContraGame();

        var game = new PackmanGame();

        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }

}
