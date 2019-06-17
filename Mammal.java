package oopAssignment;

public class Mammal {
	public int age, randomizer;
	public double weight;
	public String name, food, coat, location, colour, gender;

	
	public void printInfo() {
	
	}
	
	public Mammal() {
		age = (int) (Math.random() * 10 + 1);
		weight = (double) (Math.random() * 6 + 1);
		randomizer = (int) (Math.random() * 2 + 1);

		if (randomizer == 1) {
			gender = "female";
		} else {
			gender = "male";
		}
	}
}
