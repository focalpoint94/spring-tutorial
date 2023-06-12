package com.in28minutes.learnspringframework.game;


import org.springframework.stereotype.Component;


@Component
public class PackmanGame implements GamingConsole{

    public void up() {
        System.out.println("UUU");
    }

    public void down() {
        System.out.println("DDD");
    }

    public void left() {
        System.out.println("LLL");
    }

    public void right() {
        System.out.println("RRR");
    }

}
