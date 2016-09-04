package com.java4u.dp.template;

public abstract class Game {

	abstract void endPlay();
	abstract void startPlay();
	abstract void initialize();
	
	public final void play(){
		//initialize the game
		initialize();
		//start game
		startPlay();
		//end game
		endPlay();
	}
}
