package edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.interactor;

import java.util.ArrayList;

import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.adapter.RequestAnimal;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Animal;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Banana;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Food;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Tiger;

public class TestMain {

	public static void main(String[] args) {
		Animal tiger = new Tiger();
		Food banana = new Banana();
		RequestAnimal test = new RequestAnimal(1,tiger,banana);
		ArrayList<RequestAnimal> tests = new ArrayList<RequestAnimal>();
		tests.add(test);
		EventHandlerInterface eh = EventHandler.getInstance();
		String testss = eh.getJSONResult(tests);
		System.out.println(testss);
		
	}

}
