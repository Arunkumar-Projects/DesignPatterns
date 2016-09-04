package com.java4u.dp.prototype.impl;

import com.java4u.dp.prototype.interfaces.Shape;

public class Circle extends Shape {
	
	public Circle(){
		type="circle";
	}

	@Override
	public void draw() {
		System.out.println("Inside the Circle :: draw() method");

	}

}
