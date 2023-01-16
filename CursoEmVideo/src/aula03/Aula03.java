package aula03;

public class Aula03 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta(); 
		
		// instancias
		c1.modelo = "BIC Cristal";
		c1.cor = "Azul";
		c1.carga = 80;
		c1.tampada = true;
		
		//metodos
		c1.status();
		c1.tampar();
		c1.rabiscar();
		
	}

}
