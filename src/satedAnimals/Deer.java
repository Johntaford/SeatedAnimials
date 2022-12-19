package satedAnimals;

public class Deer implements Animal {
//will only eat plants, needs 1200 calories
	int cal = 0;
	public static final int REQUIRED_CALORIES = 1200;
	
	
	@Override
	public void eat(FoodType food, int calories) {
		if(food == FoodType.PLANTS) {
			cal+=calories;
		}
		
	}
	@Override
	public boolean isSated() {
		return cal >= REQUIRED_CALORIES;
	}
}
