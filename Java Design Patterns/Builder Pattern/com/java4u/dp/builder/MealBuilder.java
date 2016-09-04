package com.java4u.dp.builder;

import com.java4u.dp.builder.interfaces.impl.Coke;
import com.java4u.dp.builder.interfaces.impl.NonVegBurger;
import com.java4u.dp.builder.interfaces.impl.Pepsi;
import com.java4u.dp.builder.interfaces.impl.VegBurger;

public class MealBuilder {
	
	public Meal prepareVegMeal(){
		Meal meal=new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal(){
		Meal meal=new Meal();
		meal.addItem(new NonVegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
