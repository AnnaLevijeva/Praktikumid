package praktikum7;

import java.util.ArrayList;
import java.util.Random;
import lib.TextIO;


public class Massiivid {
	
//	Kirjutada liisu heitmise programm. Programm kysib 10 nime, valib neist suvalise nime 
//	(randomiga) ja trükib välja. 
//	Täiendus: Küsida esimese asjana inimeste arv.
//
//	Kirjutada programm, mis küsib kasutajalt 10 arvu ning trükib nad seejärel 
//	vastupidises järjekorras ekraanile.
	
		public static void main(String[] args) {
			
		Random rand = new Random();
		
		System.out.print("Count of people: ");
		int listSize = TextIO.getInt();
		ArrayList<String> nameList = new ArrayList<String>();
		
		System.out.println("Enter " + listSize + " names.");
		for (int i = 0; i < listSize; i++) {
			System.out.print("\t" + (i + 1) + ". ");
			String name = TextIO.getlnWord();
			nameList.add(name);
		} // for -- declaring nameList array
		
		System.out.println("Name list: " + nameList);
		
		int randomInt = rand.nextInt(6) + 1;
		//System.out.println(randomInt);
		System.out.println("Random computer's choose: " + nameList.get(randomInt));
	} // main
}
