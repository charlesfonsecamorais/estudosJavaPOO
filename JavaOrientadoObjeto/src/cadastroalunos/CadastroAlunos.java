package cadastroalunos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class CadastroAlunos {

	public static void main(String[] args) throws IOException {
		
		Path arquivo = Paths.get("D:\\Estudos\\Java\\CursoJavaAlgaWorks\\arquivosgerados\\lista.txt");
		List<String> listaAlunos = Files.readAllLines(arquivo);
		
		SortedSet<String> cadastroAlunos = new TreeSet<String>();
		
		for(int i = 0; i < listaAlunos.size(); i++) {
			cadastroAlunos.add(listaAlunos.get(i));
		}
		System.out.println(listaAlunos);
		System.out.println(cadastroAlunos);

	}

}
