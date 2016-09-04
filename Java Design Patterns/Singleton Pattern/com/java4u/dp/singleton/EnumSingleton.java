package com.java4u.dp.singleton;

public enum EnumSingleton {
	INSTANCE;
	public static EnumSingleton getInstance() {
		return EnumSingleton.INSTANCE;
	}
	
	public void display(){
		System.out.println("Enum Singleton ...... ");
	}
}
