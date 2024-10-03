package com.in28minutes.spring.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements Game {
    public MarioGame() {
        System.out.println("MarioGame Created");
    }

    @Override
    public void up(){
        System.out.println("Jump");
    }

    @Override
    public void down(){
        System.out.println("Go into a hole");
    }

    @Override
    public void left(){
        System.out.println("Go left");
    }

    @Override
    public void right(){
        System.out.println("Go right");
    }
}