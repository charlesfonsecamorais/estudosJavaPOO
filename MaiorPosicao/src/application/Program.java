package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		Double[] numeros = new Double[n];
		Double maior = 0.0;
		int posicaoMaior = 0;
		for(int i = 0;i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			if(numeros[i] > maior) {
				maior = numeros[i];
				posicaoMaior = i;
			}
		}
		System.out.println();
		System.out.println("MAIOR VAOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);
		sc.close();
	}

}
