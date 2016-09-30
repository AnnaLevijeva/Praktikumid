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
	} // method end -- dropCoin()
	
	public static String userInput() {
		return "";
	} //method end -- userInput()


	public static boolean correctInput(String param) {
		System.out.println("Heads or Tails?");
		while ( (param.equals("Tails") || param.equals("Heads")) == false) {
			param = TextIO.getln();
			continue;
		} // While loop end
		return true;

	} // method end -- correctInput()
}
