package com.java4u.dp.nullobject;

public class NullCustomer extends AbstractCustomer{


	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available in the Customer Database";
	}

}
