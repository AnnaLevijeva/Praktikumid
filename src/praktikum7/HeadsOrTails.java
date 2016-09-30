package praktikum7;

import java.util.Random;

public class HeadsOrTails {
	
	public static void main(String[] args) {
		//System.out.println(dropCoin());
	}
	
	public static String dropCoin() {
		/*
		 * Method returns a random choose between "Heads" and "Tails"
		 */
		 Random rand = new Random();
		 boolean randomBool = rand.nextBoolean();
		 if (randomBool == true) {
			 return "Heads";
		 } else {
			 return "Tails";
		 }
	}

}
