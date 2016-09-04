package com.java4u.dp.singleton;

public class LazyLoading {

	private static LazyLoading singleton = null;

	private LazyLoading() {

	}

	public static LazyLoading getInstance() {
		singleton= new LazyLoading();
		return singleton;
	}
	
	public void display(){
		System.out.println("Lazy Loading Singleton ......");
		
	}
}
