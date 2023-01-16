package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		Integer[] numeros = new Integer[n];
		int cont = 0;
		while(cont < numeros.length) {
			System.out.print("Digite um numero: ");
			numeros[cont] = sc.nextInt();
			cont++;
		}
		System.out.println();
		System.out.println("NUMEROS PARES:");
		int pares = 0;
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
				pares++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + pares);
		
		sc.close();
	}

}
