package com.java4u.dp.singleton;
public class EagerLoading {
	private static EagerLoading singleton = new EagerLoading();

	private EagerLoading() {

	}

	public static EagerLoading getInstance() {
		return singleton;
	}
	
	public void display(){
		System.out.println("Eager Loading Singleton ......");
		
	}
}
