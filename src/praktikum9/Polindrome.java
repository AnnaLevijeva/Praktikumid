package praktikum9;

import lib.TextIO;

public class Polindrome {

	public static void main(String[] args) {
		
//		Kirjutada programm, mis küsib kasutajalt sõna ja kontrollib, kas 
//		see on edaspidi ja tagurpidi lugedes sama (palindroom).
//		Näited sellistest sõnadest:
//
//		udu
//		kook
//		meem
//		kuulilennuteetunneliluuk
//
//		NB! Stringide kontrollimiseks kasuta süntaksit: if(string1.equals(string2))
//		Taibudele: Kõige efektiivsem algoritm ei võrdle Stringe vaid tähti.
		
		String str1 = "lolstring";
		System.out.println(str1.charAt(str1.length() - 1));
		
		
		System.out.println("Enter a word: ");
		String word = TextIO.getlnWord();
		for (int i = 0; i < word.length(); i++) {
			if ((word.charAt(i)) == (word.charAt(word.length() - 1 - i))) {
				System.out.println("wow");
			} //if
		} //for
	} // main
}
