package praktikum9;

import lib.TextIO;

public class BigLetters {
	
	public static void main(String[] args) {
		
//		Kirjutada programm, mis küsib kasutaja käest sõna ning trükib välja selle sõna 
//		suurte tähtedega ning tähed sidekriipsudega eraldatud.
//		Näiteks, kui kasutaja sisestab "Teretore", trükib programm "T-E-R-E-T-O-R-E".
		
		System.out.print("Enter a word: ");
		String word = TextIO.getlnWord();
		word = word.toUpperCase();
		for (int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i));
			if (i+1 != word.length()) {
				System.out.print("-");
			}
		}
	}

}
