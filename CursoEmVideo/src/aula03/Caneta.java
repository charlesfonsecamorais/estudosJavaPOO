package aula03;

public class Caneta {
	public String modelo;
	public String cor;
	private Double ponta;
	protected Integer carga;
	protected Boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga + "%");
		System.out.println("Tampada: " + this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.err.println("Caneta está tampada! Impossível utilizar.");
		} else {
			System.out.println("Rabisco feito com sucesso!");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
}

