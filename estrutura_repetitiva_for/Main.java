package estrutura_repetitiva_for;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma = 0;
		for(int i = 0; i<x; i=i+1) {
			int y = sc.nextInt();
			soma = soma + y;
		}
		System.out.println(soma);
		sc.close();
	}

}
