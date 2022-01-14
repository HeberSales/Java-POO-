//System.out.println();

public class Aula04 {

	public static void main(String[] args) {
		
		/*
		Aula04Caneta c1 = new Aula04Caneta();
		 Forma 1 
		//conseguiria das duas formas se modelo fosse public
		c1.setModelo("Bic");
		//c1.modelo = "Bic";
		
		c1.setPonta(0.5f);
		
		c1.status();
		
		//System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta()); //se fosse c1.modelo ia dar erro pq modelo é private
		
		*/
		
		//--> Forma 2
		
		Aula04Caneta c1 = new Aula04Caneta("Biczada", "Amarela", 0.4f);
		c1.status();
		
		Aula04Caneta c2 = new Aula04Caneta("Bic", "Vermelha", 0.5f);
		c2.status();
		
		
		
	}

}
