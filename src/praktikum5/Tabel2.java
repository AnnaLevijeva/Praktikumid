package praktikum5;

public class Tabel2 {

	public static void main(String[] args) {

		int tabeliSuurus = 7;
		
		for (int n = 0; n < tabeliSuurus; n++) {
			System.out.print("--");
		}
		System.out.println("");
		
		for (int j = 0; j < tabeliSuurus; j++) {

			System.out.print("| ");
			for (int i = 0; i < tabeliSuurus; i++) {
				if (i == j || i+j == tabeliSuurus-1) {
					System.out.print("X ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.print("|");
			System.out.println("");

		}
	}
}
