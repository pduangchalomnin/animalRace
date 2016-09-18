package edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity;

public class Elephant extends Animal {

	private double initialSpeed = 5;
	public double calculateMove(Food givenFood) {
		
		if(!givenFood.isNil())
			return initialSpeed*givenFood.getPower();
		else
			return initialSpeed;
	}
}
