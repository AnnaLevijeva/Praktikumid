package praktikum2;

import lib.TextIO;

public class GruppideArv {
	public static void main(String[] args) {

//		int inimArv;
//		int gruppiSuurus;
//
//		System.out.println("Sisesta inimeste arv: ");
//		inimArv = TextIO.getlnInt();
//
//		System.out.println("Sisesta gruppi suurus: ");
//		gruppiSuurus = TextIO.getlnInt();
//
//		int gruppideArv = inimArv / gruppiSuurus;
//		int jaabUle = inimArv % gruppiSuurus;
//
//		System.out.println("Saab moodustada " + gruppideArv + " gruppi");
//		System.out.println(jaabUle + " inimest jääb üle.");
		
//		int inimArv;
//		int gruppiSuurus;

		System.out.println("Sisesta inimeste arv: ");
		int inimArv = TextIO.getlnInt();

		System.out.println("Sisesta gruppi suurus: ");
		int gruppiSuurus = TextIO.getlnInt();

		System.out.println("Saab moodustada " + inimArv / gruppiSuurus + " gruppi");
		System.out.println(inimArv % gruppiSuurus + " inimest jääb üle.");
	}

}
