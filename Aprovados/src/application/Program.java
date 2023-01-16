package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int alunos = sc.nextInt();
		String[] nomeAlunos = new String[alunos];
		
		for(int i=0; i<nomeAlunos.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "º aluno:");
			sc.nextLine();
			String nome = sc.nextLine();
			Double nota1 = sc.nextDouble();
			Double nota2 = sc.nextDouble();
			Aluno aluno = new Aluno(nome, nota1, nota2);
			if(aluno.media(nota1, nota2) >= 6.0) {
				nomeAlunos[i] = nome;
			}
		}
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < nomeAlunos.length; i++) {
			if(nomeAlunos[i] != null) {
				System.out.println(nomeAlunos[i]);
			}
		}
		
		sc.close();

	}

}
