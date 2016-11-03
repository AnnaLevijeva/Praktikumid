package praktikum7;

import java.util.Random;
import lib.TextIO;

public class CubeRate {
	
	public static void main(String[] args) {
		
		/**
		 * Kasutajale antakse 100 raha.
		 * Küsitakse panuse suurust, maksimaalne panus on 25 raha.
		 * Visatakse münt.
		 * Kui tuli kiri, saab kasutaja panuse topelt tagasi.
		 * Kui tuli kull, ei saa ta midagi.
		 * Mäng kestab seni, kuni kasutajal raha otsa saab.
		 * NB! Mõistlik on kasutajale raha jääki vahel näidata ka.
		 * 
		 * Kopeeri teine ülesanne uude faili ning kirjuta sellele täiendus:
		 * Kirjutada panustega täringumäng.
		 * Kasutajalt küsitakse, millise täringu numbri peale ta panuse paneb (1..6), 
		 * peale seda küsitakse panuse suurus (vahemikus 0 kuni palju kasutajal raha on).
		 * Veeretatakse täring. Kui kasutaja valis õige numbri, saab ta panuse 6-kordselt tagasi.
		 */
		
		Random rand = new Random();
		int moneyCount = 100;
		int rate;
		
		while (moneyCount > 0) {
			
			System.out.print("You have " + moneyCount + "$. Enter your rate: ");
			rate = correctRate(0, moneyCount);
			
			System.out.print("Choose random value (1-6): ");
			int userNumber = correctRate(1, 6);
			
			
//			rate = correctRate(0, 25);
//			moneyCount = moneyCount - rate;
			
			if (rate <= moneyCount) {
				
				moneyCount = moneyCount - rate;
				int randomInt = rand.nextInt(6) + 1;
				System.out.println("Computer's choose: " + randomInt);
				
				if (randomInt == userNumber) {
					moneyCount = moneyCount + rate * 6;
					System.out.println("You win " + rate*6 + "$!");
				} else {
					System.out.println("You lost " + rate + "$!");
				}
			} else {
				System.out.println("Not enough money to make this rate!");
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
