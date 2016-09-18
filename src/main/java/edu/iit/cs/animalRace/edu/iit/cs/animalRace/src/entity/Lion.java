package edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity;

public class Lion extends Animal {

	private double initialSpeed = 8;
	public double calculateMove(Food givenFood) {
		
		if(!givenFood.isNil())
			return initialSpeed*givenFood.getPower();
		else
			return initialSpeed;
	}

}
