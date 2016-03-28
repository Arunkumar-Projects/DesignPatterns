package com.java4u.dp.facade;

public class ShapeMaker {
	private Shape square;
	private Shape rectangle;
	private Shape traingle;
	
	public ShapeMaker(){
		square= new Square();
		traingle= new Traingle();
		rectangle= new Rectangle();
	}
	
	public void drawSquare(){
		square.draw();
	}
	
	public void drawTraingle(){
		traingle.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
}
