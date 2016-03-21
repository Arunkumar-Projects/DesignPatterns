package com.java4u.dp.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		DoubleLockSingleton.getInstance().display();
		EagerLoading.getInstance().display();
		LazyLoading.getInstance().display();
		EnumSingleton.getInstance().display();
	}

}
