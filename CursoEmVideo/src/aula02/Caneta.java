package aula02;

public class Caneta {
	String modelo;
	String cor;
	Double ponta;
	Integer carga;
	Boolean tampada;
	
	void status() {
		System.out.println("A caneta " + this.cor + " está tampada? " + this.tampada);
	}
	
	void rabiscar() {
		if (this.tampada == true) {
			System.err.println("Caneta está tampada! Impossível utilizar.");
		} else {
			System.out.println("Rabisco feito com sucesso!");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
	
}

