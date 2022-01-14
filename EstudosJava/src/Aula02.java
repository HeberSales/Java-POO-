
public class Aula02 {

	public static void main(String[] args) {
		Aula02Caneta c1 = new Aula02Caneta();
		
		//Referência a Atributo;
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		
		c1.tampar();
		
		//Referência a Método; --> usa parenteses
		c1.status();
		c1.rabiscar();
		
		Aula02Caneta c2 = new Aula02Caneta();
		
		c2.modelo = "Bic";
		c2.cor = "Preta";
		c2.destampar();
		
		c2.status();
		c2.rabiscar();
		
		
	}

}
