package praktikum8;

import lib.TextIO;

public class ListOfNumbers {
	
	public static void main(String[] args) {
		
		System.out.println("How long will be your list?");
		int count = TextIO.getlnInt();
		int[] numList = new int[count];
		System.out.println("Enter " + count + " numbers: ");
		
		for (int i = 0; i < numList.length; i++) {
			System.out.print("\t" + (i + 1) + ". ");
			int number = TextIO.getlnInt();
			numList[i] = number;
		} // for
		
		revertList(numList);
	}
	
	public static void revertList (int[] m) {
		for (int i = 1; i <= m.length; i++) {
			System.out.print(m[m.length - i] + " ");
		}
	}

}
