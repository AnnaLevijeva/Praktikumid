package praktikum5;

public class Tabel {

	public static void main(String[] args) {

		int tabeliSuurus = 7;

		for (int j = 0; j < tabeliSuurus; j++) {

			System.out.print("| ");
			for (int i = 0; i < tabeliSuurus; i++) {
				if (i == j) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
				System.out.print("0 ");
			}
			System.out.print("|");
			System.out.println("");

		}
	}
}
