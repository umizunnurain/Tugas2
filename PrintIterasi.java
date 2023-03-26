//*13020210097
//*Umi Zunnurain
//*Jumat/17/03/2023

import java.util.Scanner;

/* Baca N, */
/* Print i = 1 s/d N dengan INTERATE */
public class PrintIterasi {

/**
 * @param args
 */
public static void main(String[] args) {
	// TODO Auto-generated method stub
	/* Kamus : */
	int N;
	int i;
	Scanner masukan=new Scanner(System.in);
	/* Program */
	System.out.print ("Nilai N>O = "); /* Inisialisasi*/
	N = masukan.nextInt();

	i = 1;	/* Firt Elmt */
	System.out.print ("Print i dengan ITERATE : \n");
	for (;;) {
		System.out.println(i); /* Proses */
		if (i == N)
			/* Kondisi Berhenti */ break;
		else {
		i++; /*Next Elmt */
		}
		}
		/* (i == N) */
	}
}
