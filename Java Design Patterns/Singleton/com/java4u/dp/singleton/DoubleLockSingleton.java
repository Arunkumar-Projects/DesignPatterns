package com.java4u.dp.singleton;

public class DoubleLockSingleton {
	private static DoubleLockSingleton singleton = null;

	private DoubleLockSingleton() {

	}

	public static DoubleLockSingleton getInstance() {
		if (null == singleton) {
			synchronized (DoubleLockSingleton.class) {
				if (null == singleton) {
					singleton = new DoubleLockSingleton();
				}
			}
		}
		return singleton;
	}
	
	public void display(){
		System.out.println("Double Lock Singleton ......");
		
	}
}
