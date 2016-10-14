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
		
		userInputInt(0, 30);
		
		
	}
	
	public static int cube (int ret) {
		return (int) Math.pow(ret, 3);
	}

	public static int userInputInt(int min, int max) {
		while (true) {
			System.out.print("Enter a number from " + min + " to " + max + ": ");
			int ret = TextIO.getInt();
			if (ret < min || ret > max) {
				System.out.println("Invalid value. Enter again: ");;
			} else {
				
				return ret;
			}
		} 
	}
}
