
public class Rec {

	public static void main(String[] args) {

		//System.out.println(factorial(2, 3));
		System.out.println(fibonacci(6));

	}

	public static int factorial(int a, int b) {
		if (b == 1) {
			return a;
		}
		return a * factorial(a, b - 1);
	} // factorial

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	} // fibonacci
	
}
