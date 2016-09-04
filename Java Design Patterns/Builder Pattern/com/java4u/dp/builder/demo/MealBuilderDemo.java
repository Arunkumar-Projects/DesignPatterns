package com.java4u.dp.builder.demo;

import com.java4u.dp.builder.Meal;
import com.java4u.dp.builder.MealBuilder;

public class MealBuilderDemo {
	public static void main(String[] args) {
		
		MealBuilder builder= new MealBuilder();
		Meal vegMeal= builder.prepareVegMeal();
		
		System.out.println("Veg Meal ");
		vegMeal.showItems();
		System.out.println("Total Cost :"+vegMeal.getCost());
		
		Meal nonvegMeal= builder.prepareNonVegMeal();
		
		System.out.println("Non Veg Meal ");
		nonvegMeal.showItems();
		System.out.println("Total Cost :"+nonvegMeal.getCost());
	}

}
