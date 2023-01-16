package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		double mediaPares = 0.0;
		int cont = 1;
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			if(vetor[i] % 2 == 0) {
				cont++;
				mediaPares += vetor[i] / cont;
			}
			
		}
		if(mediaPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
			System.out.println("MEDIA DOS PARES = " + mediaPares);
		}
		sc.close();

	}

}
