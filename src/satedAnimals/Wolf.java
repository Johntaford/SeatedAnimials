package satedAnimals;

public class Wolf implements Animal {

	int cal;
	int numberOfMeals;
	public static final int REQUIRED_CALORIES =800;
	
	
	@Override
	public void eat(FoodType food, int calories) {
		if(food == FoodType.MEAT) {
			cal+=calories;
			numberOfMeals++;
			
		}
		
	}
	@Override
	public boolean isSated() {
		return cal >= REQUIRED_CALORIES && numberOfMeals >= 4;
	}
}
