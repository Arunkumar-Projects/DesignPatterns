package com.java4u.dp.nullobject;

public class NullPatternDemo {

	public static void main(String[] args) {
		AbstractCustomer customer1= CustomerFactory.getCustomer("Arun");
		AbstractCustomer customer2= CustomerFactory.getCustomer("Santosh");
		AbstractCustomer customer3= CustomerFactory.getCustomer("Shyam");
		AbstractCustomer customer4= CustomerFactory.getCustomer("Mano");
		
		System.out.println("Customer Details!!!!!");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}

}
