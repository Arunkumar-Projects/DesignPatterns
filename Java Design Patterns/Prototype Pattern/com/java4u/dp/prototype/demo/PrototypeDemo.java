package com.java4u.dp.prototype.demo;

import com.java4u.dp.prototype.interfaces.Shape;

public class PrototypeDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape cloneShape= ShapeCache.getShape("1");
		System.out.println("Shape :"+cloneShape.getType());
		
		Shape cloneShape2= ShapeCache.getShape("2");
		System.out.println("Shape :"+cloneShape2.getType());
		
		Shape cloneShape4= ShapeCache.getShape("4");
		System.out.println("Shape :"+cloneShape4.getType());

	}

}
