package com.java4u.dp.prototype.impl;

import com.java4u.dp.prototype.interfaces.Shape;

public class Traingle extends Shape{
	public Traingle(){
		type="traingle";
	}

	@Override
	public void draw() {
		System.out.println("Inside the Traingle :: draw() method");

	}
}
