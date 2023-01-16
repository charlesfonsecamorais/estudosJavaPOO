package application;

import java.util.Locale;
import java.util.Scanner;
import entites.Pessoas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int nPessoas = sc.nextInt();
		String[] nomes = new String[nPessoas];
		Integer[] idades = new Integer[nPessoas];
		Double[] alturas = new Double[nPessoas];
		Double somaAltura = 0.0, mediaAltura = 0.0;
		Integer menorIdade = 0, porcentIdade = 0;
		for(int i = 0; i < nPessoas; i++) {
			System.out.println("Dados da " + (i+1) + "ª pessoa:");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			Integer idade = sc.nextInt();
			if(idade < 16) {
				menorIdade++;
			}
			System.out.print("Altura: ");
			Double altura = sc.nextDouble();
			Pessoas pessoa = new Pessoas(nome, idade, altura);
			nomes[i] = pessoa.getNome();
			idades[i] = pessoa.getIdade();
			alturas[i] = pessoa.getAltura();
			somaAltura += alturas[i];
			mediaAltura = somaAltura / nPessoas;
			porcentIdade = menorIdade * 100 / nPessoas;
		}
		System.out.printf("Altura média = " + "%.2f%n", mediaAltura);
		System.out.println("Pessoas com menos de 16 anos: " +  porcentIdade + "%");
		for(int i = 0; i < idades.length; i++) {
			if(idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}

}
