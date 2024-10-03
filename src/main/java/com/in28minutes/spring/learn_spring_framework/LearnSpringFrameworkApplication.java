package com.in28minutes.spring.learn_spring_framework;

import com.in28minutes.spring.learn_spring_framework.game.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		GameRunner gameRunner = context.getBean(GameRunner.class);

		gameRunner.run();

//		Game mario = new MarioGame();
//		Game superContra = new SuperContraGame();
//		Game pacman = new PacmanGame();
//		System.out.println();
//		GameRunner runner = new GameRunner(mario);
//		runner.run();
	}
}