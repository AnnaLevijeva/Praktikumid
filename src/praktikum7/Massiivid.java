package praktikum7;

import java.util.ArrayList;
import java.util.Random;
import lib.TextIO;

public class Massiivid {

	public static void main(String[] args) {
		
		listFromLast(5);
		
	} // main

	public static int sum(int[] list) {
		int ret = 0;
		for (int i = 0; i < list.length; i++) {
			ret += list[i];
		}
		return ret;
	}

	public static void listFromLast(int listSize) {

		int[] numbers = new int[listSize];

		System.out.println("Enter " + numbers.length + " numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("\t" + (i + 1) + ". ");
			int number = TextIO.getlnInt();
			numbers[i] = number;
		}

		System.out.print("You entered (from last to first): \n\t");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[numbers.length - i - 1] + ", ");
		}
	}

	public static String randomName() {
		Random rand = new Random();

		System.out.print("Count of people: ");
		int listSize = TextIO.getlnInt();
		ArrayList<String> nameList = new ArrayList<String>();

		System.out.println("Enter " + listSize + " names.");
		for (int i = 0; i < listSize; i++) {
			System.out.print("\t" + (i + 1) + ". ");
			String name = TextIO.getlnWord();
			nameList.add(name);
		} // for -- adding names in nameList array
		
		System.out.print("Names: " + nameList);

		int randomInt = rand.nextInt(6) + 1;
		// System.out.println(randomInt);
		System.out.println();
		System.out.println("Random computer's choose: " + nameList.get(randomInt));
		return nameList.get(randomInt);
	} // randomName()
}
