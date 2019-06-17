package oopAssignment;

public class Lemur extends Mammal {

	public void lemLocate() {
		System.out.println("Lemurs commonly live in Madagascar!");
	}

	public void lemFur() {
		System.out.println("Lemurs have fur!");
	}

	public void lemClass() {
		System.out.println("Lemurs are classified as Prosimians.");
	}

	public void lemRole() {
		System.out.println("Female Lemurs play a dominant role in their society.");
	}

	public void lemGroup() {

	}

	public void lemFood() {

	}

	public void lemMane() {

	}
	
	
	public void printInfo() {
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
		System.out.println("Gender: " + gender);
		lemLocate();
		lemGroup();
		lemFood();
		lemMane();
		lemFur();
		lemClass();
		lemRole();
	}

}
