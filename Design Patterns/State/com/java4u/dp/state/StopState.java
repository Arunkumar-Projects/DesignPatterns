package com.java4u.dp.state;

public class StopState implements State {
	public void doAction(Context context) {
		System.out.println("Player is in the Stop State now!!");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Stop State ";
	}
}
