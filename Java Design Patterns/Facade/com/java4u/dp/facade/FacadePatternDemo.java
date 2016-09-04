package com.java4u.dp.facade;

public class FacadePatternDemo {

	public static void main(String[] args) {
		ShapeMaker shapeMaker= new ShapeMaker();
		
		System.out.println("Facade pattern Demo!!!");
		System.out.println("\n\n");
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
		shapeMaker.drawTraingle();
	}

}
