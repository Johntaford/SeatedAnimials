package satedAnimals;

public class Pig implements Animal  {

	
	int meatCal = 0;
	int plantCal = 0;
	int totalCal =0;
	public static final int REQUIRED_CALORIES =3000;
	public static final int REQUIRED_MEAT_CALORIES =1000;
	public static final int REQUIRED_PLANT_CALORIES =1000;
	
	
	@Override
	public void eat(FoodType food, int calories) {
		totalCal += calories;
		if(food == FoodType.MEAT) {
			meatCal+=calories;
		} else if (food == FoodType.PLANTS) {
			plantCal += calories;
		}
		
		
	}
	@Override
	public boolean isSated() {
		return totalCal >= REQUIRED_CALORIES && meatCal >= REQUIRED_MEAT_CALORIES && plantCal >= REQUIRED_PLANT_CALORIES;
	}
}
