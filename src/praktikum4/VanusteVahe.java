package praktikum4;

import lib.TextIO;

public class VanusteVahe {
	
	public static void main(String[] args) {
		
		System.out.print("Sisesta kaks vanust: ");
		int age1 = TextIO.getInt();
		//System.out.print("Sisesta teine vanus: ");
		int age2 = TextIO.getInt();
		int vahe = Math.abs(age1 - age2);
		
		if (vahe > 5 && vahe < 10) {
			System.out.println("Siin on midagi krõbedat");
		} else if (vahe > 10) {
			System.out.println("Siin on midagi veel krõbedamat");
		} else {
			System.out.println("Sobib.");
		}
	}

}
