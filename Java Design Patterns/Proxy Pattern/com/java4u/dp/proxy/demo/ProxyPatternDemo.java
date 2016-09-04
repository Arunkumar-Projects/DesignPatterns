package com.java4u.dp.proxy.demo;

import com.java4u.dp.proxy.interfaces.Image;
import com.java4u.dp.proxy.interfaces.impl.ProxyImage;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image= new ProxyImage("test_image.png");
		image.display();
		System.out.println("");
		
		image.display();

	}

}
