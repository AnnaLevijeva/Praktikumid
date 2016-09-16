package praktikum5;

public class Loops {
	
	public static void main(String[] args) {
		
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		for (int i = 0; i < 10; i++) {
			if (i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		
//		num = 30;
//		System.out.println("");
//		while (num > 0) {
//			System.out.print(num + " ");
//			num = num - 3;
//		}
		
		System.out.println("");
		for (int i = 30; i > 0; i--) {
			if (i%3 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
