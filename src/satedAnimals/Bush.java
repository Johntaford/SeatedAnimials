package satedAnimals;

public class Bush implements Animal {

	int cal = 0;
	public static final int REQUIRED_CALORIES =50;
	
	
	@Override
	public void eat(FoodType food, int calories) {
		if(food == FoodType.LIGHT) {
			cal+=calories;
		}
		
	}
	@Override
	public boolean isSated() {
		return cal >= REQUIRED_CALORIES;
	}
}
