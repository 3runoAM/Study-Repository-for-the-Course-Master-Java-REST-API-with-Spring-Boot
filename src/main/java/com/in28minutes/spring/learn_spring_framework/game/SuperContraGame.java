package com.in28minutes.spring.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements Game {
    public SuperContraGame() {
        System.out.println("SuperContraGame Created");
    }

    @Override
    public void up(){
        System.out.println("Super Jump");
    }

    @Override
    public void down(){
        System.out.println("Super down");
    }

    @Override
    public void left(){
        System.out.println("Super left");
    }

    @Override
    public void right(){
        System.out.println("Super right");
    }
}