package pedidovendas;

public class PedidoVendas {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		pedido.setCodigo(1);
		pedido.setSubtotal(100.0);
		pedido.setDesconto((pedido.getSubtotal() * 10) / 100);

		System.out.println("Cod: " + pedido.getCodigo());
		System.out.println("Valor do Pedido: " + pedido.getSubtotal());
		System.out.println("Desconto: 10%");
		System.out.println("Valor Total: " + pedido.getTotal());
	}
	
}
