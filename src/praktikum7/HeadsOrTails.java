package praktikum7;

import java.util.Random;
import lib.TextIO;

public class HeadsOrTails {
	
	public static void main(String[] args) {
		
<<<<<<< HEAD
		dropCoin();
=======
		//guessHT();
>>>>>>> b7e6606be0da054c76db0eeb8f8ba7e97e150ce2
		
	} // MAIN method end
	
	public static String dropCoin() {
		/**
		 * Method returns a computer's random choose between "Heads" and "Tails"
		 */
		 Random rand = new Random();
		 boolean randomBool = rand.nextBoolean();
		 if (randomBool == true) {
			 return "Heads";
		 } else {
			 return "Tails";
		 }
	} // method end -- dropCoin()
	
	public static boolean correctInput(String param) {
		/**
		 * Method checks if user's input is correct.
		 * Method returns true ONLY if input equals EXACTLY "Heads" or "Tails".
		 */
		if ( (param.equals("Tails") || param.equals("Heads")) == false) {
			System.out.println("Incorrect input. Enter \"Heads\" or \"Tails\".");
			return false;
		} else {
		return true; 
		} // IF statement end
	} // method end -- correctInput()
	
	public static boolean guessHT() {
		String randHT = dropCoin();
		System.out.println("Heads or Tails?");
		String userInput = TextIO.getln();
		
		if (userInput.equals(randHT)) {
			System.out.println("You win!");
			return true;
		} else {
			System.out.println("You lost.");
			return false;
		}
	}

}

