package exercicios_estrutura_for03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;
			System.out.println(media);
		}
		sc.close();

	}

}
