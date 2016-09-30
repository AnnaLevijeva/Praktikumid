package praktikum7;

import java.util.Random;

import lib.TextIO;

public class HeadsOrTails {
	
	public static void main(String[] args) {
		
		String randHT = dropCoin();
	}
	
	public static String dropCoin() {
		/**
		 * Method returns a random choose between "Heads" and "Tails"
		 */
		 Random rand = new Random();
		 boolean randomBool = rand.nextBoolean();
		 if (randomBool == true) {
			 return "Heads";
		 } else {
			 return "Tails";
		 }
	} // method end
	
	public static String userInput() {
		String inp = TextIO.getlnString();
		while (inp)
	}

}
