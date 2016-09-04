package com.java4u.dp.nullobject.interfaces;

import com.java4u.dp.nullobject.impl.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available in the Customer Database";
	}

}
