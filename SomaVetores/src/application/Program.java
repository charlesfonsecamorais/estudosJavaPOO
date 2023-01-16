package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		Integer[] vetorA = new Integer[n];
		Integer[] vetorB = new Integer[n];
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorA[i] + vetorB[i]);
		}
		sc.close();
	}

}
