package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		Double[] vect = new Double[n];
		Double soma = 0.0, media = 0.0;
		for(int i = 0; i < vect.length; i++ ) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		System.out.println();
		System.out.print("VALORES = ");
		for(int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		System.out.println();
		System.out.printf("SOMA = " + "%.2f%n", soma);
		media = soma / vect.length;
		System.out.printf("MEDIA = " + "%.2f%n", media);
		sc.close();
	}
}
