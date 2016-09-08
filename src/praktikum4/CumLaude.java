package praktikum4;
import lib.TextIO;

public class CumLaude {
	
	public static void main(String[] args) {
		while (true) {
			
			System.out.print("Sinu keskhind: ");
			double hind = TextIO.getlnDouble();
			
			if (hind >= 4.5 && hind <= 5) {
				System.out.println("Jah saad cum laude diplomile!");
				break;
			} else if (hind >= 0 && hind < 4.5) {
				System.out.println("Ei saa");
				break;
			} else {
				System.out.println("Vale! Proovi uuesti");
			}
		}
	}
}
