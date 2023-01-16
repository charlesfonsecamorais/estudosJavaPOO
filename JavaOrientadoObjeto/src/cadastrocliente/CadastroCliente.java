package cadastrocliente;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		Cliente cliente = new Cliente();
		
		Boolean continuar = true;
		int i = 0;
		
		while (continuar) {
			
			cliente.setId(i);
			
			System.out.print("Nome: ");
			cliente.setNome(scanner.nextLine());
			lista.add(cliente.getNome());
			
			System.out.print("E-mail: ");
			cliente.setEmail(scanner.nextLine());
			lista.add(cliente.getEmail());
			
			System.out.print("Telefone: ");
			cliente.setTelefone(scanner.nextLine());
			lista.add(cliente.getTelefone());
			
			String resposta = "";
			
			System.out.println("Cliente cadastrado com sucesso!");
			System.out.println();
			System.out.print("Deseja cadastrar outro cliente? [S / N]: ");
			resposta = scanner.nextLine();
			
			if (resposta.equals("s") || resposta.equals("S")) {
				continuar = true;
				i++;
			}
			
			if (resposta.equals("n") || resposta.equals("N")) {
				continuar = false;
				for (int y = 0; y < lista.size(); y++) {
					System.out.println(lista.get(y));
				}
				
				break;
			} 
			
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("O programa será encerrado!");
		System.out.println();
		System.out.println("Até breve!");
		System.out.println("-----------------------------------------");
		
		scanner.close();

	}

}
