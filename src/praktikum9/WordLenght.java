package praktikum9;

import lib.TextIO;

public class WordLenght {

	public static void main(String[] args) {

		// Kirjutada programm, mis küsib kasutaja käest kümme sõna ja trükib
		// välja sõna pikkuse ja sõna enda.
		// Näiteks:
		//
		// 4 kala
		// 13 koerakoonlane
		// 6 lammas
		// 8 Voldemar
		// ....

		System.out.print("Enter count of words: ");
		int size = TextIO.getlnInt();
		String[] words = new String[size];
		System.out.println("Enter " + size + " words: ");
		
		for (int i = 0; i < words.length; i++) {
			System.out.print("\t" + (i + 1) + ". ");
			words[i] = TextIO.getlnWord();
		} // for
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i].length() + " " + words[i]);
		} // for

	}

}
