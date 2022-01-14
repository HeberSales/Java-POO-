
public class Aula03 {

	public static void main(String[] args) {
		Aula03Caneta c1 = new Aula03Caneta();
		
		c1.modelo = "Bic";
		c1.cor = "Azul";
		//c1.ponta = 0.5f;
		c1.carga = 80; //permite mudar pq ele esta dentro da classe Aula03Caneta
		//c1.tampada = true; Só funciona na classe dele. ai fiz tampar e destampar publico para poder usar
		c1.destampar();
		
		c1.status();
		
		c1.rabiscar();
		 
	}

}
