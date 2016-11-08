package praktikum9;

//<<<<<<< HEAD
//=======
import lib.TextIO;

//>>>>>>> b7e6606be0da054c76db0eeb8f8ba7e97e150ce2
public class BigLetters {
	
	public static void main(String[] args) {
		
//<<<<<<< HEAD
//		Kirjutada programm, mis küsib kasutaja käest sõna ning trükib välja selle sõna suurte tähtedega ning tähed sidekriipsudega eraldatud.
//		Näiteks, kui kasutaja sisestab "Teretore", trükib programm "T-E-R-E-T-O-R-E".
		
		
	
//=======
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
	} }
//>>>>>>> b7e6606be0da054c76db0eeb8f8ba7e97e150ce2

