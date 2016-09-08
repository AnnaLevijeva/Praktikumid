package praktikum2;

import lib.TextIO;

public class Replace {
	
	public static void main(String[] args) {
		/**
		 * programm, mis küsib kasutaja käest tekstisisestuse, 
		 * asendab selles kõik 'a'-tähed altkriipsudega ('_') ning 
		 * trükib tulemuse konsooli. 
		 */
		
		System.out.println("Sisesta tekst.");
		System.out.println(TextIO.getlnString().replace('a', '_'));
		// System.out.println((TextIO.getlnString().replace('a', '_').replace('A', '_')));

	}
	

}
