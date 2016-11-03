package praktikum7;

import java.util.Random;
//import lib.TextIO;
import praktikum6.Methods;

public class GuessTheNumber {
	
	public static int randomNum;
	
	public static void main(String[] args) {
		
		System.out.println("Start game!");
		game();
		
	}
	
	
	public static boolean isEqual(int i) {
		
		/**
		 * Method checks if the number in input is equal with the randomNum or not. 
		 * Method prints out string containing the result of checking.
		 * Method returns TRUE if input is equal with randomNum.
		 * Method returns FALSE if input is NOT equal with randomNum.
		 */
		
		if (i > randomNum) {
			System.out.println("Your number is too large! Enter again.");
			return false;
		} else if (i < randomNum) {
			System.out.println("Your number is too small! Enter again.");
			return false;
		} else {
			System.out.print("You win! Congrats!");
			return true;
		} // IF statement end
	} // method end
	
	
	public static void game() {
		
		/**
		 * Method puts a random value 0-100 in variable randomNum.
		 * While input is not equal with randomNum method is asking a new input.
		 * If input is equal with randomNum program exits method.
		 * Method returns none.
		 */
		
		Random rand = new Random();
		randomNum = rand.nextInt(100);
		System.out.println(randomNum);
		int userInput = Methods.intInRange(1, 100);
		
		while (isEqual(userInput) == false) {
			userInput = Methods.intInRange(1, 100);
			
		} // WHILE loop end
	} // method end
}

























