package com.java4u.dp.builder.interfaces.impl;

import com.java4u.dp.builder.interfaces.Item;
import com.java4u.dp.builder.interfaces.Packing;

public abstract class CoolDrink implements Item {
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
