package praktikum6;

import lib.TextIO;

//import lib.TextIO;

public class Methods {
	public static void main(String[] args) {
		
//		System.out.print("Sisesta arv: ");
//		int var = TextIO.getInt();
//		var = cube(var);
//		System.out.println("Selle arvu kuup on " + var);
//		System.out.println();
		
		//int kasArv = userInputInt(0, 30);
		
		//System.out.println(valiVahemik(10));
		
		//System.out.println(allaKeskmise(new double[]{0., 1., 10.}));
		
//		int a = 9;
//
//		int b = a++ / 5;
//
//		System.out.println(a);
//		System.out.println(b);
		
//		System.out.println(kuupideSumma(3., 4.));
		
//		System.out.println(negPaaris(0));
		
//		System.out.println(absvdeSumma(-2.5, -3.5));
		
		System.out.println(ruutudeSumma(new int[]{0,1,2,3,4,5}));
		
	}
	
	public static int cube (int ret) {
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
	}//intinrange
	
	public static int valiVahemik(int m) {
		if (m < 10) {
			return 0;
		} else if (m >= 10 && m <= 35) {
			return 1;
		} else {
			return 2;
		}
	} //valiVahemik
	
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
	} //allakeskmise

	public static double kuupideSumma (double a, double b) {
	      return Math.abs(a) + Math.abs(b); 
	      }

	public static boolean negPaaris (int n) {
		if (n < 0 && n%2 == 0) {
			return true;
		} else {
			return false;
		} // if
	} // negPaaris

	public static boolean posPaaritu (int n) {
		if (n > 0 && n%2 == 1) {
			return true;
		} else {
			return false;
		} // if
	} // posPaaritu
	
	public static int ruutudeSumma (int[] m) {
		int ret = 0;
		
		for (int j = 0; j < m.length; j++) {
			ret += Math.pow(m[j], 2);
		}
		return ret;
   }
	
	public static int posElArv (int[] m) {
		
		int ret = 0;
		
		for (int i = 0; i < m.length; i++) {
			if (m[i] > 0) {
			ret++;
			} //if
		} //for
		return ret;  // YOUR PROGRAM HERE
	}

	public static double absvdeSumma (double a, double b) {
		      return Math.abs(a) + Math.abs(b);
		   }
}

