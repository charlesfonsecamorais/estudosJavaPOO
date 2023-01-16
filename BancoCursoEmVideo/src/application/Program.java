package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Account> account = new ArrayList<>();
		
		Account.options();
		System.out.print("Digite a operacao desejada: ");
		int operation = input.nextInt();
		while(operation != 6) {
			while(operation < 1 || operation > 6) {
				System.out.print("Operacao invalida! Digite novamente a operacao desejada: ");
				operation = input.nextInt();
			}
			switch(operation){
			
			case 1: 
				System.out.println();
				System.out.println("---------------------");
				System.out.println("  ABERTURA DE CONTA  ");
				System.out.println("---------------------");
				System.out.println();
				System.out.println("Conta Corrente - Digite 'CC'");
				System.out.println("Conta Poupanca - Digite 'CP'");
				System.out.println();
				System.out.print("Digite o tipo de conta que deseja abrir: ");
				char type = input.next().toUpperCase().trim().charAt(1);
				while(type != 'C' && type != 'P') {
					System.out.print("Opcao Invalida! Digite novamente o tipo de conta que deseja abrir: ");
					type = input.next().toUpperCase().trim().charAt(1);
				}
				System.out.println();
				System.out.print("Numero da Conta: ");
				Integer number = input.nextInt();
				input.nextLine();
				System.out.print("Nome do Titular: ");
				String owner = input.nextLine();
				Account newAccount = new Account(number, type, owner);
				newAccount.openAccount(type);
				account.add(newAccount);
				System.out.println();
				if(type == 'C') {
					System.out.println("Conta Corrente criada com sucesso!");
				} else {
					System.out.println("Conta Poupanca criada com sucesso!");
				}
				System.out.print("Deseja continuar? [S / N]: ");
				char response = input.next().toUpperCase().trim().charAt(0);
				while(response != 'S' && response != 'N') {
					System.out.print("Opcao invalida! Digite novamente a opcao desejada: ");
					response = input.next().toUpperCase().trim().charAt(0);
				}
				if(response == 'N') {
					operation = 6;
					break;
				} else {
					System.out.println();
					Account.options();
					System.out.print("Digite a operacao desejada: ");
					operation = input.nextInt();
				}
				
				break;
				
			case 2:
				System.out.println();
				System.out.println("---------------------");
				System.out.println(" CONSULTA DE SALDO ");
				System.out.println("---------------------");
				System.out.println();
				System.out.print("Digite o numero da conta: ");
				int accountNumber = input.nextInt();
				System.out.println();
				Account acc = account.stream().filter(x -> x.getNumber() == accountNumber).findFirst().orElse(null);
				if(acc == null || acc.getStatus() == false) {
					System.out.println("Conta Invalida!");
				} else {
					if(acc.getType() == 'C') {
						System.out.println("Conta Corrente: " + acc.getNumber());
					} else {
						System.out.println("Conta Poupanca: " + acc.getNumber());
					}
					System.out.println("Titular: " + acc.getOwner());
					System.out.printf("Saldo: R$ %.2f", Account.checkBalance(acc.getNumber(), acc.getBalance()));
					System.out.println();
					System.out.println();
					System.out.print("Deseja continuar? [S / N]: ");
					response = input.next().toUpperCase().trim().charAt(0);
					while(response != 'S' && response != 'N') {
						System.out.print("Opcao invalida! Digite novamente a opcao desejada: ");
						response = input.next().toUpperCase().trim().charAt(0);
					}
					if(response == 'N') {
						operation = 6;
						break;
					} else {
						System.out.println();
						Account.options();
						System.out.print("Digite a operacao desejada: ");
						operation = input.nextInt();
					}
				}
				
				break;
				
			case 3:
				System.out.println();
				System.out.println("---------------------");
				System.out.println("       DEPOSITO      ");
				System.out.println("---------------------");
				System.out.println();
				System.out.print("Digite o numero da conta: ");
				accountNumber = input.nextInt();
				acc = account.stream().filter(x -> x.getNumber() == accountNumber).findFirst().orElse(null);
				if(acc == null) {
					System.out.println("Conta Invalida!");
				} else {
					System.out.print("Digite o valor que deseja depositar: ");
					Double value = input.nextDouble();
					acc.setBalance(Account.deposit(acc.getBalance(), value));
					System.out.println();
					System.out.println("Deposito efetuado com sucesso!");
					System.out.println();
					System.out.print("Deseja continuar? [S / N]: ");
					response = input.next().toUpperCase().trim().charAt(0);
					while(response != 'S' && response != 'N') {
						System.out.print("Opcao invalida! Digite novamente a opcao desejada: ");
						response = input.next().toUpperCase().trim().charAt(0);
					}
					if(response == 'N') {
						operation = 6;
						break;
					} else {
						System.out.println();
						Account.options();
						System.out.print("Digite a operacao desejada: ");
						operation = input.nextInt();
					}
					
				}	
					
				break;
					
			case 4:
				System.out.println();
				System.out.println("---------------------");
				System.out.println("         SAQUE       ");
				System.out.println("---------------------");
				System.out.println();
				System.out.print("Digite o numero da conta: ");
				accountNumber = input.nextInt();
				acc = account.stream().filter(x -> x.getNumber() == accountNumber).findFirst().orElse(null);
				if(acc == null) {
					System.out.println("Conta Invalida!");
				} else if(acc.getBalance() <= 0){
					System.out.println("Saldo indisponivel para saque! Consulte o gerente de sua conta.");
					System.out.println();
					System.out.print("Deseja continuar? [S / N]: ");
					response = input.next().toUpperCase().trim().charAt(0);
					while(response != 'S' && response != 'N') {
						System.out.print("Opcao invalida! Digite novamente a opcao desejada: ");
						response = input.next().toUpperCase().trim().charAt(0);
					}
					if(response == 'N') {
						operation = 6;
						break;
					} else {
						System.out.println();
						Account.options();
						System.out.print("Digite a operacao desejada: ");
						operation = input.nextInt();
					}
				} else {
					System.out.print("Digite o valor que deseja sacar: ");
					Double value = input.nextDouble();
					acc.setBalance(Account.withDraw(acc.getBalance(), value));
					System.out.println();
					System.out.println("Saque efetuado com sucesso!");
					System.out.println();
					System.out.print("Deseja continuar? [S / N]: ");
					response = input.next().toUpperCase().trim().charAt(0);
					while(response != 'S' && response != 'N') {
						System.out.print("Opcao invalida! Digite novamente a opcao desejada: ");
						response = input.next().toUpperCase().trim().charAt(0);
					}
					if(response == 'N') {
						operation = 6;
						break;
					} else {
						System.out.println();
						Account.options();
						System.out.print("Digite a operacao desejada: ");
						operation = input.nextInt();
					}
					
				}
					
				break;	
					
				case 5:
					System.out.println();
					System.out.println("-------------------------------");
					System.out.println("     ENCERRAMENTO DE CONTA     ");
					System.out.println("-------------------------------");
					System.out.println();
					System.out.print("Digite o numero da conta: ");
					accountNumber = input.nextInt();
					acc = account.stream().filter(x -> x.getNumber() == accountNumber).findFirst().orElse(null);
					if(acc == null) {
						System.out.println("Conta Invalida!");
					} else {
						acc.closeAccount(acc.getBalance());
						System.out.println();
						System.out.print("Deseja continuar? [S / N]: ");
						response = input.next().toUpperCase().trim().charAt(0);
						while(response != 'S' && response != 'N') {
							System.out.print("Opcao invalida! Digite novamente a opcao desejada: ");
							response = input.next().toUpperCase().trim().charAt(0);
						}
						if(response == 'N') {
							operation = 6;
							break;
						} else {
							System.out.println();
							Account.options();
							System.out.print("Digite a operacao desejada: ");
							operation = input.nextInt();
						}
						
						break;
				}
			}
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println(" Obrigado por utilizar os nossos servicos. Volte sempre! ");
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		input.close();
		
	}

}
