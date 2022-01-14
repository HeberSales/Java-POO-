
public class Aula07 {

	public static void main(String[] args) {
		
		//criando vetor para poder fazer os lutadores!!
		Aula07Lutador l[] = new Aula07Lutador[5];
		
		l[0] = new Aula07Lutador("Heber", "Brazil", 21,
								1.64f, 68.5f, 11, 2, 1);
		
		l[1] = new Aula07Lutador("Preatty boy", "França", 31,
				1.75f, 67.5f, 5, 7, 4);
		
		l[2] = new Aula07Lutador("Ufo", "França", 37,
				1.70f, 119.3f, 5, 4, 3);
		
		l[3] = new Aula07Lutador("Nerdaart", "EUA", 30,
				1.81f, 105.7f, 12, 2, 4);
		
		Aula07Luta LUTA1 = new Aula07Luta();
		LUTA1.marcarLuta(l[0], l[1]);
		
		LUTA1.luta();
		
	}

}
