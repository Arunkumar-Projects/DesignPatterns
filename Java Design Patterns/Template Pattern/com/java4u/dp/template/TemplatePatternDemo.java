package com.java4u.dp.template;

public class TemplatePatternDemo {
 public static void main(String[] args) {
	Game game= new Cricket();
	game.play();
	System.out.println();
	Game game1= new FootBall();
	game1.play();
}
}
