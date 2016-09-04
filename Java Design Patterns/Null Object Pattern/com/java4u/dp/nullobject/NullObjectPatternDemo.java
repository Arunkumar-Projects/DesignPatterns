package com.java4u.dp.nullobject;

import com.java4u.dp.nullobject.impl.AbstractCustomer;

public class NullObjectPatternDemo {

	public static void main(String[] args) {
		AbstractCustomer customer1= CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2= CustomerFactory.getCustomer("Joe");
		AbstractCustomer customer3= CustomerFactory.getCustomer("sham");
		AbstractCustomer customer4= CustomerFactory.getCustomer("Arun");
		
		System.out.println("   ::::::     Customers      ::::: \n ");
		
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}

}
