package listatarefas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CriarListaTarefas {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		
		int i = 0;
		Boolean continuar = true;
		
		while (continuar) {
				i++;
				System.out.print("Digite a tarefa: ");
				lista.add("Tarefa " + (i) + ": " + scanner.nextLine());
				
				Path tarefas = Paths.get("D:\\Estudos\\Java\\CursoJavaAlgaWorks\\arquivosgerados\\tarefas.txt");
				Files.write(tarefas, lista);
				
				System.out.print("Deseja continuar [S / N]: ");
				String resposta = scanner.nextLine();
				
				if(resposta.equals("n") || resposta.equals("N")) {
					continuar = false;
				}

		}
		
		System.out.println("-----------------------------");
		System.out.println("O programa será encerrado...");
		System.out.println("-----------------------------");
		
		scanner.close();
	}
	
}
