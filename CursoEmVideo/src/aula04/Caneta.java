package aula04;

public class Caneta {
	private String modelo;
	private Double ponta;
	
	// construtor (todas as chamadas para new Caneta trazem os valores)
//	public Caneta(){
//		setModelo("BIC");
//		setPonta(1.0);
//	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Double getPonta() {
		return this.ponta;
	}
	
	public void setPonta(Double ponta) {
		this.ponta = ponta;
	}
	
	public void status() {
		System.out.println("---------- CANETA ----------");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
	}
}

