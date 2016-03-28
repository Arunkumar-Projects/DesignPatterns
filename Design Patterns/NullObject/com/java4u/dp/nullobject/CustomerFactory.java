package com.java4u.dp.nullobject;

public class CustomerFactory {
	
	private static final String[] customers = { "Arun", "Shyam", "Mano", "Srinath" };

	public static AbstractCustomer getCustomer(String name) {
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
