package praktikum4;
import lib.TextIO;

public class CumLaude {
	
	public static void main(String[] args) {
			
			System.out.print("Sinu lõputöö hind: ");
			double loputoo = TextIO.getDouble();
			System.out.print("Sinu kaalatud keskhind: ");
			double keskmine = TextIO.getDouble();
			
			double hind;
			
			if (loputoo >= 0 && loputoo <= 5 && keskmine >= 0 && keskmine <= 5) {
				hind = (loputoo + keskmine)/2;
				System.out.println("Sinu keskmine hind on " + hind);
			} else {
				System.out.println("Vigane sisustus");
				return;
			}
			
			// System.out.println(hind);
			
			if (hind >= 4.5 && hind <= 5) {
				System.out.println("Jah saad cum laude diplomile!");
			} else if (hind >= 0 && hind < 4.5) {
				System.out.println("Ei saa");
			} 
	}
}
