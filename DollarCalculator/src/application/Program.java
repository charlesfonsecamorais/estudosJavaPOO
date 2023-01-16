package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is the dollar price? US$");
		Double dollarPrice = scanner.nextDouble();
		System.out.print("How many dollars will be bought? US$");
		Double dollarBought = scanner.nextDouble();
		
		Double dollarValue = CurrencyConverter.dollarValue(dollarPrice, dollarBought);
		
		System.out.println("");
		System.out.printf("Amount to be paid in reais = R$" + "%.2f%n", dollarValue);
		
				
		scanner.close();
	}

}
