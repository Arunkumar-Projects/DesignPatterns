package com.java4u.dp.nullobject.interfaces;

import com.java4u.dp.nullobject.impl.AbstractCustomer;

public class RealCustomer extends AbstractCustomer{

	public RealCustomer(String name) {
		this.name=name;
	}
	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

}
