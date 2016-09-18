package edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.interactor;

import java.util.ArrayList;

import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.adapter.RequestAnimal;

public interface EventHandlerInterface {
	public String getJSONResult(ArrayList<RequestAnimal> requestAnimals);
}
