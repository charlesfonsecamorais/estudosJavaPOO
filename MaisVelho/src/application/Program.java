package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		int maiorIdade = 0;
		String maisVelho = "";
		for(int i = 0; i < nomes.length; i++) {
			System.out.println("Dados da " + (i+1) + "ª pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			if(idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				maisVelho = nomes[i];
			}
		}
		System.out.print("PESSOA MAIS VELHA: " + maisVelho);
		
		sc.close();

	}

}
