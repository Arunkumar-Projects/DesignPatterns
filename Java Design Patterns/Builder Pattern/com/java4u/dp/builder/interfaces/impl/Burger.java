package com.java4u.dp.builder.interfaces.impl;

import com.java4u.dp.builder.interfaces.Item;
import com.java4u.dp.builder.interfaces.Packing;

public abstract class Burger implements Item {
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
