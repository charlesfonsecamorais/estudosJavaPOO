package reporestoque;

public class ReporEstoque {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Leite Integral";
		produto.quantidadeEstoque = 9;
		
		reporEstoque(produto);
	}
	
	static void reporEstoque(Produto produto) {
		
		if (produto.quantidadeEstoque < 10) {
			System.out.println("Produto: " + produto.nome);
			System.out.println("Quantidade: " + produto.quantidadeEstoque);
			System.out.println("Estoque: Reposição necessária");
		} else {
			System.out.println("Produto: " + produto.nome);
			System.out.println("Quantidade: " + produto.quantidadeEstoque);
			System.out.println("Estoque: Disponível");
		}
	}

}
