package edu.iit.cs.animalRace.unitTest;


import org.junit.Test;

import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Apple;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Banana;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Grass;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Meat;
import junit.framework.TestCase;

public class FoodTest extends TestCase{
	private static final double DELTA = 1e-15;

	Banana banana = new Banana();
	Apple apple = new Apple();
	Grass grass = new Grass();
	Meat meat = new Meat();

	@Test
	public void testBananaGetPower() {
		assertEquals(1.2, banana.getPower(),DELTA);
	}
	
	@Test
	public void testAppleGetPower() {
		assertEquals(1.4,apple.getPower(),DELTA);
	}
	
	@Test
	public void testGrassGetPower() {
		assertEquals(1.3,grass.getPower(),DELTA);
	}
	
	@Test
	public void testMeatGetPower() {
		assertEquals(1.1,meat.getPower(),DELTA);
	}

}
