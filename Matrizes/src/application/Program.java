package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		System.out.print("Informe o numero de linhas da Matriz: ");
		int lines = input.nextInt();
		System.out.print("Informe o numero de colunas da Matriz: ");
		int collums = input.nextInt();
		System.out.println();
		int[][] matriz = new int[lines][collums];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = input.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Digite um valor para conhecer sua posicao: ");
		int value = input.nextInt();
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] == value) {
					System.out.println("Posicao: " + i + "," + j);
					if(i>=0 && i<matriz.length && j-1>=0 && j-1<matriz[i].length) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if(i-1>=0 && i-1<matriz.length && j>=0 && j<matriz[i].length) {
						System.out.println("Acima: " + matriz[i-1][j]);
					}
					if(i>=0 && i<matriz.length && j+1>=0 && j+1<matriz[i].length) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if(i+1>=0 && i+1<matriz.length && j>=0 && j<matriz[i].length) {
						System.out.println("Abaixo: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		input.close();
	}

}
