package kt2;

import lib.TextIO;

public class CUMlaude {
	public static void main(String[] args) {
		// see on õige cum laude ülesadne versioon
		int loputoo = TextIO.getlnInt();
		if (loputoo == 5) {
			System.out.print("Saab cum laude!");
		} else if (loputoo == 4) {
			System.out.print("Hea tulemus aga lõpuhinnet ei saa");
		} else {
			System.out.print("Ei saa cum laudet!");
		}

	}
}

// Koostage Java meetod, mis leiab etteantud reaalarvude massiivi d põhjal
// niisuguste elementide arvu,
// mis on rangelt suuremad kõigi elementide aritmeetilisest keskmisest
// (aritmeetiline keskmine = summa / elementide_arv).
// public static int keskmisestParemaid (double[] d)
