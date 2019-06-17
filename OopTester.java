package oopAssignment;

import java.util.Scanner;

public class OopTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lemNum = new Scanner(System.in);
		Scanner lemType = new Scanner(System.in);

		System.out.println("Please put how many lemurs you would like.");
		int numLem = lemNum.nextInt();

		Mammal lemUr[] = new Mammal[numLem];

		System.out.println("Please enter what Lemur you would like to see.");
		System.out.println("1 - Tree Lemur");
		System.out.println("2 - Desert Lemur");
		System.out.println("3 - Jungle Lemur");
		
		int lemTy;
		for (int i = 0; i < lemUr.length; i++) {
			lemTy = lemType.nextInt();
			if (lemTy == 1) {
				lemUr[i] = new TreeLemur();
			} else if (lemTy == 2) {
				lemUr[i] = new DesertLemur();
			} else if (lemTy == 3) {
				lemUr[i] = new JungleLemur();
			} else {
				System.out.println("That is invalid.");
				i--;
			}
		}

		for (int i = 0; i < lemUr.length; i++) {
			lemUr[i].printInfo();

		}
	}

}
