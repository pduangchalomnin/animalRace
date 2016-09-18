package edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.interactor;
import java.util.ArrayList;
import java.util.Iterator;

import com.google.gson.Gson;

import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.adapter.RequestAnimal;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.adapter.Response;

public class EventHandler implements EventHandlerInterface{
	
	private static EventHandler instance= null;
	
	private EventHandler(){}
	
	public static EventHandler getInstance(){
		if(instance == null)
			instance = new EventHandler();
		return instance;
	}
	
	public String getJSONResult(ArrayList<RequestAnimal> requestAnimals){
		String output ="";
		ArrayList<Response> result = calculateResult(requestAnimals);
		Gson gson = new Gson();
		output = gson.toJson(result);
		return output;
	}
		private ArrayList<Response> calculateResult(ArrayList<RequestAnimal> requestAnimals) {
			ArrayList<Response> result = new ArrayList<Response>();
			Iterator<RequestAnimal> iterator = requestAnimals.iterator();
			while(iterator.hasNext()) {
				RequestAnimal requestAnimal = iterator.next();
				Response response = new Response();
				response.setId(requestAnimal.getId());
				response.setSpeed(requestAnimal.getFinalSpeed());
				result.add(response);
			}
			return result;
		}
	

}
