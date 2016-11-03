package praktikum6;

import lib.TextIO;

//import lib.TextIO;

public class Methods {
	public static void main(String[] args) {
		//System.out.println(result(new double[] { 1., 2., 3., 4., 5. })); // 3.0
	      int[] res = veeruMinid (new int[][] { {1,2,6}, {4,5,3} }); // {1, 2, 3}
			for (int j = 0; j < res.length; j++) {
				System.out.println(res[j]);
			}
	      }

	public static int cube(int ret) {
		return (int) Math.pow(ret, 3);
	}

	public static int intInRange(int min, int max) {
		System.out.print("Enter a number from " + min + " to " + max + ": ");
		while (true) {

			int ret = TextIO.getInt();
			if (ret < min || ret > max) {
				System.out.println("Invalid value. Enter again: ");
			} else {

				return ret;
			}
		}
	}// intinrange

	public static int valiVahemik(int m) {
		if (m < 10) {
			return 0;
		} else if (m >= 10 && m <= 35) {
			return 1;
		} else {
			return 2;
		}
	} // valiVahemik

	public static int allaKeskmise(double[] d) {

		double keskmine = 0.;
		int ret = 0;

		for (int i = 0; i < d.length; i++) {
			keskmine = keskmine + d[i];
		}

		keskmine = keskmine / d.length;

		for (int i = 0; i < d.length; i++) {
			if (d[i] < keskmine) {
				ret++;
			}
		}
		return ret;
	} // allakeskmise

	public static double kuupideSumma(double a, double b) {
		return Math.abs(a) + Math.abs(b);
	}

	public static boolean negPaaris(int n) {
		if (n < 0 && n % 2 == 0) {
			return true;
		} else {
			return false;
		} // if
	} // negPaaris

	public static boolean posPaaritu(int n) {
		if (n > 0 && n % 2 == 1) {
			return true;
		} else {
			return false;
		} // if
	} // posPaaritu

	public static int ruutudeSumma(int[] m) {
		int ret = 0;

		for (int j = 0; j < m.length; j++) {
			ret += Math.pow(m[j], 2);
		}
		return ret;
	}

	public static int posElArv(int[] m) {

		int ret = 0;

		for (int i = 0; i < m.length; i++) {
			if (m[i] > 0) {
				ret++;
			} // if
		} // for
		return ret; // YOUR PROGRAM HERE
	}

	public static double absvdeSumma(double a, double b) {
		return Math.abs(a) + Math.abs(b);
	}

	public static int keskmisestParemaid(double[] d) {

		double keskmine = 0.;
		int ret = 0;

		for (int i = 0; i < d.length; i++) {
			keskmine = keskmine + d[i];
		}

		keskmine = keskmine / d.length;

		for (int i = 0; i < d.length; i++) {
			if (d[i] > keskmine) {
				ret++;
			}
		}
		return ret;
	}

	public static int[][] liitmisTabel(int n) {

		int[][] tab = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				tab[i][j] = i + j;
			}
		}
		return tab;
	}

	public static double result(double[] marks) {
		/**
		 * Sportlase esinemist hindab n>2 kohtunikku. Hinnete hulgast
		 * eemaldatakse kõige madalam ja kõige kõrgem ning leitakse ülejäänud
		 * n-2 hinde aritmeetiline keskmine. Kirjutada Java-meetod hinde
		 * arvutamiseks. Parameetriks olevat massiivi muuta ei tohi. There are
		 * n>2 judges and each gives a mark to sportsmans performance. Two
		 * extreme marks (one highest and one lowest) are removed and
		 * artithmetical mean of remaining n-2 marks is calculated. Write a Java
		 * method to determine the sportsmans result. Do not change the array
		 * given as argument.
		 */

		double ret = 0;
		double min = marks[0];
		double max = marks[0];

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < min) {
				min = marks[i];
			}
		} // for -- min

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > max) {
				max = marks[i];
			}
		} // for -- max

		for (int i = 0; i < marks.length; i++) {
			ret += marks[i];
		}

		ret = (ret - (min + max)) / (marks.length - 2);

		return ret;
	}

	public static int[] veeruMinid(int[][] m) {
		/**
		 * Koostage Java meetod etteantud täisarvumaatriksi m veerumiinimumide
		 * massiivi leidmiseks (massiivi j-ndaks elemendiks on maatriksi j-nda
		 * veeru vähima elemendi väärtus). Arvestage, et m read võivad olla
		 * erineva pikkusega.
		 * 
		 * Write a method in Java to find the array of minimums of columns of a
		 * given matrix of integers m (j-th element of the answer is the minimum
		 * of elements of the j-th column in the matrix). Rows of m might be of
		 * different length.
		 */

		// int[] res = veeruMinid (new int[][] { {1,2,6}, {4,5,3} });
		// return: {1, 2, 3}
		int columns = 0;
		for (int i = 0; i < m.length; i++) {
			if (columns < m[i].length) {
				columns = m[i].length;
			}
		} // maximum length
		
		int[] ret = new int[columns];
		int min = m[0][0];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < columns; j++) {
				min = m[0][j];
				System.out.println(min);
				System.out.println(m[i][j]);
				if (min >= m[i][j]) {
					ret[j] = min;
				}
			}
		} // for
		
		return ret;

	}

}
