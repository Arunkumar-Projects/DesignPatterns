package com.java4u.dp.prototype.demo;

import java.util.HashMap;

import com.java4u.dp.prototype.impl.Circle;
import com.java4u.dp.prototype.impl.Rectangle;
import com.java4u.dp.prototype.impl.Traingle;
import com.java4u.dp.prototype.interfaces.Shape;

public class ShapeCache {
	private static HashMap<String, Shape> shapeMap = new HashMap<>(10);

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}
	
	public static void loadCache(){
		Circle circle= new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Traingle traingle= new Traingle();
		traingle.setId("2");
		shapeMap.put(traingle.getId(), traingle);
		
		Rectangle rectangle= new Rectangle();
		rectangle.setId("4");
		shapeMap.put(rectangle.getId(), circle);
	}

}
