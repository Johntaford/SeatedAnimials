package satedAnimals;

public class Chimp implements Animal  {

	int meatCal = 0;
	int totalCal = 0;
	public static final int REQUIRED_CALORIES =1000;
	public static final int REQUIRED_MEAT_CALORIES =200;
	
	
	
	@Override
	public void eat(FoodType food, int calories) {
		totalCal += calories;
		if(food == FoodType.MEAT) {
			meatCal+=calories;
		} 
		
		
	}
	@Override
	public boolean isSated() {
		return totalCal >= REQUIRED_CALORIES &&  meatCal >= REQUIRED_MEAT_CALORIES ;
	}
}
