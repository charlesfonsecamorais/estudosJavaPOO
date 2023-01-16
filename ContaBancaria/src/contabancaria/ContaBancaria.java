package contabancaria;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Correntista cliente = new Correntista();
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		Services metodos = new Services();
		
		System.out.println("---------------------------");
		System.out.println("BEM VINDO AO CAIXA 24 HORAS");
		System.out.println("---------------------------");
		System.out.println();
		System.out.println("1 - CONTA CORRENTE");
		System.out.println("2 - CONTA POUPANÇA");
		System.out.println("3 - OUTROS SERVIÇOS");
		System.out.println();
		System.out.print("Digite a opção desejada: ");
		
		int opcao = scanner.nextInt();
		switch(opcao) {
		case 1: 
			System.out.println();
			System.out.println("1 - ABRIR CONTA CORRENTE");
			System.out.println("2 - CONSULTAR SALDO");
			System.out.println("3 - ENCERRAR CONTA");
			System.out.println("4 - VOLTAR");
			System.out.println();
			System.out.print("Digite a opção desejada: ");
			
			int opcao1 = scanner.nextInt();
			switch(opcao1) {
			case 1:
				System.out.println("---------------------------");
				System.out.println("       CONTA CORRENTE      ");
				System.out.println("---------------------------");
			}
			break;
		case 2:
			System.out.println();
			System.out.println("1 - ABRIR CONTA");
			System.out.println("2 - CONSULTAR SALDO");
			System.out.println("3 - ENCERRAR CONTA");
			System.out.println("4 - VOLTAR");
			break;
		case 3:
			System.out.println();
			System.out.println("1 - EMPRÉSTIMO");
			System.out.println("2 - CARTÃO");
			System.out.println("3 - VOLTAR");
			break;
		default:
			System.out.println("Opção Inválida!");
		}
		
		scanner.close();

	}

}
