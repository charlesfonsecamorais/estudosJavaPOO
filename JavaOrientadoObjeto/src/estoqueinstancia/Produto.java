package estoqueinstancia;

public class Produto {
	
	String nome;
	Integer quantidadeEstoque;
	
	void reporEstoque() {
		
		if (quantidadeEstoque < 10) {
			System.out.println("Produto: " + nome);
			System.out.println("Quantidade: " + quantidadeEstoque);
			System.out.println("Estoque: Reposição necessária!");
		} else {
			System.out.println("Produto: " + nome);
			System.out.println("Quantidade: " + quantidadeEstoque);
			System.out.println("Estoque: Disponível");
		}
		
	}
	
}

