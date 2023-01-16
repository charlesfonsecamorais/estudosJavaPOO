package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Double[] alturas = new Double[n];
		String[] generos = new String[n];
		Double menorAltura = 0.0;
		Double maiorAltura = 0.0;
		int homens = 0;
		Double mulheres = 0.0;
		int m = 0;
		for(int i=0; i<alturas.length; i++) {
			System.out.print("Altura da " + (i+1) + "ª pessoa: ");
			alturas[i] = sc.nextDouble();
			System.out.print("Gênero da " + (i+1) + "ª pessoa: ");
			generos[i] = sc.next().toUpperCase();
			if(i == 0) {
				menorAltura = alturas[i];
				maiorAltura = alturas[i];
			} else if(alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			} else if(alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
			if(generos[i].contentEquals("M")){
				homens++;
			} else {
				mulheres += alturas[i];
				m++;
			}
		}
		System.out.printf("Menor Altura: " + "%.2f%n", menorAltura);
		System.out.printf("Maior Altura: " + "%.2f%n", maiorAltura);
		System.out.printf("Média das alturas das mulheres: " + "%.2f%n", mulheres / m);
		System.out.print("Número de Homens: " + homens);
		
		sc.close();
	}

}
