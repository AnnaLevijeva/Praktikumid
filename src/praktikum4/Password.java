package praktikum4;

import lib.TextIO;

public class Password {
	// new String("test").equals("test") --> true 
	
	public static void main(String[] args) {
		
		String password = "543u2y1";
		System.out.println("sisesta parooli: ");
		String trypass = TextIO.getln();
		
		if (password.equals(trypass)) {
			System.out.println("oige");
		} else {
			System.out.println("vale");
		}
	}

}
