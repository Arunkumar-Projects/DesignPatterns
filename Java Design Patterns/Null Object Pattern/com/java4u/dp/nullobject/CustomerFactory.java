package com.java4u.dp.nullobject;

import com.java4u.dp.nullobject.impl.AbstractCustomer;
import com.java4u.dp.nullobject.interfaces.NullCustomer;
import com.java4u.dp.nullobject.interfaces.RealCustomer;

public class CustomerFactory {
	private static final String[] names={"Rob","Joe","Sham"};
	
	public static AbstractCustomer getCustomer(String name){
		for(String item:names){
			if(item.equalsIgnoreCase(name)){
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
		
	}

}
