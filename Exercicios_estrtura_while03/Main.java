package Exercicios_estrtura_while03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int a = 0;
		int g = 0;
		int d = 0;
		int tipo = sc.nextInt();
		while(tipo != 4) {
			if(tipo == 1) {
				a = a + 1;
			}
			else if (tipo == 2) {
				g = g + 1;
			}
			else if (tipo == 3) {
				d = d + 1;
			}
			tipo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("alcool: " + a);
		System.out.println("gasolina: " + g);
		System.out.println("disel: " + d);
		sc.close();
		

	}

}
