package com.java4u.dp.state;

public class StartState  implements State{

	public void doAction(Context context) {
		System.out.println("Player is in the Start State now!!");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Start State ";
	}
	

}
