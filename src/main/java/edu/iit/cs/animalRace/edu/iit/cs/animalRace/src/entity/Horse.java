package edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity;

public class Horse extends Animal {

	private double initialSpeed = 11;
	public double calculateMove(Food givenFood) {
		
		if(!givenFood.isNil())
			return initialSpeed*givenFood.getPower();
		else
			return initialSpeed;
	}

}
