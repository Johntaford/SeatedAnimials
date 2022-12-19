package satedAnimals;

public class Panda implements Animal  {

	int cal;
	public static final int REQUIRED_CALORIES =3000;
	
	
	@Override
	public void eat(FoodType food, int calories) {
		if(food == FoodType.PLANTS) {
			cal+=calories / 2;
		}
		
	}
	@Override
	public boolean isSated() {
		return cal >= REQUIRED_CALORIES;
	}

}
