package satedAnimals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class satedAnimalsTests {
	//need one test per animal testing isSated()
	@Test
	public void DeerTest() {
	//Arrange
	Deer deer = new Deer();
	//Act
	deer.eat(FoodType.PLANTS, 800);
	deer.eat(FoodType.PLANTS, 600);
	deer.eat(FoodType.MEAT, 800);
	
	//Assert
	assertEquals(true, deer.isSated());

	}
	
	@Test
	public void BushTest() {
	//Arrange
	Bush bush = new Bush();
	//Act
	bush.eat(FoodType.PLANTS, 800);
	bush.eat(FoodType.LIGHT, 40);
	bush.eat(FoodType.MEAT, 800);
	
	//Assert
	assertEquals(false, bush.isSated());
	}
	
	@Test
	public void PigTest() {
	//Arrange
	Pig pig = new Pig();
	//Act
	pig.eat(FoodType.PLANTS, 2000);
	pig.eat(FoodType.MEAT, 2000);
	
	//Assert
	assertEquals(true, pig.isSated());
	}
	
	@Test
	void ChimpTest() {
		Chimp chimp = new Chimp();
		chimp.eat(FoodType.MEAT, 1100);
		assertEquals(true, chimp.isSated());
	}
	
	@Test
	void PandaTest() {
		Panda panda = new Panda();
		
		panda.eat(FoodType.PLANTS, 3000);
		assertNotEquals(true, panda.isSated());
		
		panda.eat(FoodType.PLANTS, 6000);
		assertEquals(true, panda.isSated());
	}
	
	@Test 
	void WolfTest() {
		Wolf wolf = new Wolf();
		wolf.eat(FoodType.MEAT, 200);
		wolf.eat(FoodType.MEAT, 200);
		wolf.eat(FoodType.MEAT, 200);
		wolf.eat(FoodType.MEAT, 200);
		assertEquals(true, wolf.isSated());
	}


}
