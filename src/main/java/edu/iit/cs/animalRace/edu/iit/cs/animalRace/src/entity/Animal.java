package edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity;

/**
 * The Class Animal.
 */
public abstract class Animal {
	
	/**
	 * This method intension is to calculate a final speed after gave the animal food
	 *
	 * @param givenFood the given food
	 * @return final speed
	 */
	public abstract double calculateMove(Food givenFood);
}
