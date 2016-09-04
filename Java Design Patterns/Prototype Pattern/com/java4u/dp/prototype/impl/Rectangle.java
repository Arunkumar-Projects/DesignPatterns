package com.java4u.dp.prototype.impl;

import com.java4u.dp.prototype.interfaces.Shape;

public class Rectangle extends Shape{
	public Rectangle(){
		type="rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside the Rectangle :: draw() method");

	}

}
