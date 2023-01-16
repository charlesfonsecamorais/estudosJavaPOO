package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		Double[] vetor = new Double[n];
		Double mediaVetor = 0.0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			mediaVetor += vetor[i] / vetor.length;
		}
		System.out.println();
		System.out.printf("MEDIA DO VETOR = " + "%.3f", mediaVetor);
		System.out.println();
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < mediaVetor) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();

	}

}
