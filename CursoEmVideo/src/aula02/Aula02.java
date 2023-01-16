package aula02;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta(); 
		
		// instancias
		c1.cor = "Azul";
		c1.ponta = 0.5;
		c1.tampada = false;
		
		//metodos
		c1.destampar();
		c1.rabiscar();
		
	}

}
