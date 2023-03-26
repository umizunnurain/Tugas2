//*13020210097
//*Umi Zunnurain
//*Jumat/17/03/2023

import java.util.Scanner;

public class KasusSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		/* Kamus */
		char cc;
		Scanner masukan=new Scanner(System.in);
		/* Program */
		System.out.print ("Ketikkan sebuah huruf, akhiri dengan RETURN \n");
		cc=masukan.next().charAt(0);
		switch (cc) {
			case 'a':	{System.out.print ("yang anda ketik adalah a \n"); break;}
			case 'u':	{System.out.print ("yang anda ketik adalah u \n"); break;}
			case 'e':	{System.out.print ("yang anda ketik adalah e \n"); break;}
			case 'i':	{System.out.print ("yang anda ketik adalah i \n"); break;}
			case 'o':	{System.out.print ("yang anda ketik adalah o \n"); break;}
			default:
				System.out.print ("yang anda ketik adalah huruf mati \n");
		}
}
}