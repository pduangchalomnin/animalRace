package edu.iit.cs.animalRace.unitTest;

import org.junit.Test;

import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Animal;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Banana;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Elephant;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Food;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Horse;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Lion;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.NullFood;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Tiger;
import junit.framework.TestCase;

public class AnimalTest extends TestCase {
	private static final double DELTA = 1e-15;
	
	Animal tiger = new Tiger();
	Animal lion = new Lion();
	Animal elephant = new Elephant();
	Animal horse = new Horse();
	Food nilFood = NullFood.getInstance();
	Food banana = new Banana();
	
	@Test
	public void testTigerCalculateMoveWithoutFood() {
		assertEquals(10.0, tiger.calculateMove(nilFood),DELTA);
	}
	
	@Test
	public void testTigerCalculateMoveWithFood() {
		assertEquals(10.0*banana.getPower(), tiger.calculateMove(banana),DELTA);
	}
	
	@Test
	public void testLionCalculateMoveWithoutFood() {
		assertEquals(8.0, lion.calculateMove(nilFood),DELTA);
	}
	
	@Test
	public void testLionCalculateMoveWithFood() {
		assertEquals(8.0*banana.getPower(), lion.calculateMove(banana),DELTA);
	}
	
	@Test
	public void testHorseCalculateMoveWithoutFood() {
		assertEquals(11.0, horse.calculateMove(nilFood),DELTA);
	}
	
	@Test
	public void testHorseCalculateMoveWithFood() {
		assertEquals(11.0*banana.getPower(), horse.calculateMove(banana),DELTA);
	}
	
	@Test
	public void testElephantCalculateMoveWithoutFood() {
		assertEquals(5.0, elephant.calculateMove(nilFood),DELTA);
	}
	
	@Test
	public void testElephantCalculateMoveWithFood() {
		assertEquals(5.0*banana.getPower(), elephant.calculateMove(banana),DELTA);
	}
}
