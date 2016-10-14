package praktikum7;

public class test {

	public static void main(String[] args) {
		

	      System.out.println (allaKeskmise (new double[]{0., 5., -5., -2.,}));
//
//		System.out.println(absvSumma(new int[] { -2, 1 }));
//
//		System.out.println(pos2k(0));
//
//		System.out.println(kuupideSumma(5., -5.));
//
//		int a = 4;
//		int b = a++ / 5;
//
//		System.out.println(a);
//		System.out.println(b);
//
//		System.out.println(Math.abs(0. + 0.));
//		System.out.println();
//
//		double[] d = { 1.1, 2.2, 3.3 };
//		double var1 = 345;
//		double var2 = 1 + d[0];
//		var2 += d[0];
//		var1 = var1 / d.length;
//		System.out.println(var1);
//		System.out.println(var2);

	}

	public static double kuupideSumma(double a, double b) {
		double result = 0;
		return result = ((a * a * a) + (b * b * b));
	}

	public static boolean pos2k(int n) {

		if (n < 10 || n > 99) {
			return false;
		} else {
			return true;
		} // TODO!!! YOUR PROGRAM HERE

	}

	public static int absvSumma(int[] m) {
		// int var1 = 0;
		int var2 = 0;
		for (int i = 0; i < m.length; i++) {
			var2 = var2 + Math.abs(m[i]);
		}

		return var2; // YOUR PROGRAM HERE

	}

	public static int allaKeskmise(double[] d) {
		double keskmine = 0;
		int result = 0;
		for (int i = 0; i < d.length; i++) {
			keskmine += d[i];
		}
		keskmine = keskmine / d.length;

		for (int i = 0; i < d.length; i++) {
			if (d[i] < keskmine) {
				result++;
			} // if
		} // for
		return result;
	}
}
