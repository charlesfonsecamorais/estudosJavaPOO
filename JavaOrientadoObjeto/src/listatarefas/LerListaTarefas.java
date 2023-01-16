package listatarefas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LerListaTarefas {

	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("D:\\Estudos\\Java\\CursoJavaAlgaWorks\\arquivosgerados\\tarefas.txt");

		List<String> lista = Files.readAllLines(arquivo);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
