package kt2;

public class Answer {

	public static void main(String[] args) {
		// System.out.println(score(new int[] { 4, 1, 2, 3, 0 })); // 9
		// int[] res = veeruMaxid(new int[][] { { 1, 2, 6 }, { 4, 5, 3 } });
		System.out.println(liitmisTabel(3));
	}

	public static int[][] liitmisTabel(int n) {
		/**
		 * Koostage Java meetod, mis genereerib parameetrina etteantud n järgi
		 * niisuguse n korda n täisarvumaatriksi, mille iga elemendi väärtuseks
		 * on selle elemendi reaindeksi ja veeruindeksi summa (indeksid algavad
		 * nullist).
		 */

		int[][] tab = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				tab[i][j] = i + j;
			} // for
		} // for
		return tab;
	} // table

	public static int score(int[] points) {
		/**
		 * Sportlase punktisumma arvutatakse üksikkatsetest saadud punktide
		 * summana, millest on maha võetud kahe halvima katse tulemused
		 * (üksikkatseid on rohkem kui kaks). Kirjutada Java meetod, mis arvutab
		 * punktisumma üksikkatsete tulemuste massiivi põhjal. Parameetriks
		 * olevat massiivi muuta ei tohi.
		 */
		int ret = 0;
		
		for (int i = 0; i < points.length; i++) {
			continue;
		} // for
		return ret;
	}

	public static int[] veeruMaxid(int[][] m) {
		/**
		 * Koostage Java meetod etteantud täisarvumaatriksi m veerumaksimumide
		 * massiivi leidmiseks (massiivi j-ndaks elemendiks on maatriksi j-nda
		 * veeru suurima elemendi väärtus). Arvestage, et m read võivad olla
		 * erineva pikkusega.
		 */
		return null;
	}

}

// Õpikeskkonna avalehele / ► Eesti Infotehnoloogia Kolledž / ► I200 / ► Teema
// 14 / ► Kontrolltöö nr. 2 (kohustuslik) - rühm 14

// Küsimus 1
//
// Millist tüüpi väärtuse tagastab meetod m?
// What is the return type of method m?
//
// public static String m (double d, int i)
//
// Vali üks:
// a. String
// b. double
// c. int
// d. void

// Küsimus 2
//
// Meetodi nimi koos piiritlejate, parameetrite tüüpide ning tagastusväärtuse
// tüübiga on tuntud kui meetodi:
//
//
// Method name together with modifiers, parameter types and return value type is
// known as method:
//
// a. signatuur; signature
// b. tagastusväärtus; return value
// c. formaalsed parameetrid; formal parameters
// d. tegelikud parameetrid; actual parameters

// Küsimus 3
//
// Mille saab kirjutada for-tsükli viimasesse (kolmandasse) lahtrisse? Koht on
// selgitavas koodi märgitud sõnaga "here".
//
// What can be written into the last gap (third gap) of a for loop? In the
// following explaining code the place is marked with "here".
//
// for (;; here )
//
// Vali üks:
// a. tegevused enne tsükli läbimist; commands to execute before every cycle
// b. tegevused peale tsükli läbimist; commands to execute after every cycle
// c. jätkamistingimus; the condition of the loop
// d. muutujate väärtustamine; setting the values for variables
// Küsimus 4
// Vastus on salvestatud
// Võimalik punktisumma 1,00'st
// Märgista küsimus
// Küsimuse tekst
// Mida väljendab alljärgnev programmilõik?
//
//
// What is the meaning of the following Java code?
//
//
//
// String s = String.valueOf(1234);
//
//
//
// Vali üks:
// a. klassi String konstruktori poole pöördumist; a construktor of class String
// is invoked
// b. klassi String klassimeetodi poole pöördumist; a class method of class
// String is invoked
// c. objekti s isendimeetodi poole pöördumist; an instance method is invoked
// for the object s
// d. jooksva klassi isendimeetodi poole pöördumist; an instance method of
// current class is invoked
// Küsimus 5
// Vastus on salvestatud
// Võimalik punktisumma 1,00'st
// Märgista küsimus
// Küsimuse tekst
// Konstruktor on:
//
//
// Constructor is
// Vali üks:
// a. meetod isendi hävitamiseks (mälu vabastamiseks); a method to destroy an
// instance (to free memory)
// b. dünaamilise pikkusega andmestruktuur; data structure with dynamic length
// c. keeles Java mitte toetatud; not supported in Java
// d. meetod isendi loomiseks; a method to create an instance
// Küsimus 6
// Vastus on salvestatud
// Võimalik punktisumma 1,00'st
// Märgista küsimus
// Küsimuse tekst
// Javadoc @return
//
// abil dokumenteeritakse:
//
// is used to document:
// Vali üks:
// a. meetodi poolt tekitatavaid erindeid; exceptions thrown by the method
// b. versiooniinfot; version information
// c. meetodi parameetrit; a method parameter
// d. meetodi tagastusväärtust; a method return value
// Küsimus 7
// Vastus on salvestatud
// Võimalik punktisumma 1,00'st
// Märgista küsimus
// Küsimuse tekst
// Java koodistiil nõuab konstantide nimede kirjutamist:
//
//
// Constant names in Java are written:
// Vali üks:
// a. ainult suurtähtedega; with all capital letters
// b. väikese algustähega; starting with lowercase letter
// c. kreeka keeles; in Greek
// d. suure algustähega; starting with capital letter
// Jäta vahele Testi navigatsioon
// Testi navigatsioon
// Küsimus 1 See leht
// Küsimus 2 See leht
// Küsimus 3 See leht
// Küsimus 4 See leht
// Küsimus 5 See leht
// Küsimus 6 See leht
// Küsimus 7 See leht
// Küsimus 8
// Küsimus 9
// Küsimus 10
// Küsimus 11
// Lõpeta katse...
// Aega jäänud 0:47:13
