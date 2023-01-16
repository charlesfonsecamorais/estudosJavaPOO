package estoqueinstancia;

public class ReporEstoque {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.nome = "Farinha de Trigo";
		produto.quantidadeEstoque = 10;
		
		produto.reporEstoque();

	}

}
