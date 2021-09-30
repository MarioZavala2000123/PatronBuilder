package edu.uspg.MealType;

public class MealType {
	private String Meal;
	private String VegMeal;
	private String NonVegMeal;
	
	public MealType(String Meal, String VegMeal, String NonVegMeal) {
		this.Meal = Meal;
		this.VegMeal = VegMeal;
		this.NonVegMeal = NonVegMeal;
	}
	
	public String getMeal() {
		return Meal;
	}
}
