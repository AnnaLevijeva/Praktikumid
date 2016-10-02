package praktikum7;

import java.util.Random;
import lib.TextIO;

public class Casino {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int moneyCount = 100;
		int rate;
		
		while (moneyCount > 0) {
			
			System.out.print("You have " + moneyCount + "$. Enter your rate (0-25$): ");
			
			rate = correctRate(0, 25);
			moneyCount = moneyCount - rate;
			boolean randomBool = rand.nextBoolean(); // True = Heads, False = Tails
			
			if (randomBool) {
				moneyCount = moneyCount + rate*2;
			}		
		} // while
		
		System.out.println("Game over, you have no money to make rates.");
		
	} // main()
	
	
	public static int correctRate(int min, int max) {
		//System.out.print("Enter a number from " + min + " to " + max + ": ");
		while (true) {
			int ret = TextIO.getInt();
			if (ret < min || ret > max) {
				System.out.print("Invalid value. Enter a number from " + min + " to " + max + ": ");;
			} else {
				return ret;
			}
		}
	}
}
