package edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity;

public class NullFood extends Food{
	
	private static NullFood instance= null;
	
	private NullFood(){}
	
	public static NullFood getInstance(){
		if(instance == null)
			instance = new NullFood();
		return instance;
	}

	public double getPower() {
		return 0;
	}

	public boolean isNil() {
		return true;
	}

}
