package edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.adapter;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Animal;
import edu.iit.cs.animalRace.edu.iit.cs.animalRace.src.entity.Food;

public class RequestAnimal {
	private int id;
	private Animal animal;
	private Food food;
	
	public RequestAnimal(int id, Animal animal, Food food){
		this.id = id;
		this.animal = animal;
		this.food = food;
	}
	public int getId() {
		return id;
	}
	public Animal getAnimal() {
		return animal;
	}
	public Food getFood() {
		return food;
	}
	
	public double getFinalSpeed() {
		return animal.calculateMove(food);
	}
}
