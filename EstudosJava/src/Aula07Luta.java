import java.util.Random;

//      System.out.println("");
public class Aula07Luta {
	
	//Consigo usar o nome da outra classe para isntanciar!!
	private Aula07Lutador desafiado;
	private  Aula07Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	public void marcarLuta(Aula07Lutador l1, Aula07Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiado(null);
		}
		
	}
	
	public void luta() {
		if(this.getAprovada()) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); //0 1 2
			System.out.println("======= RESULTADO ======");
			switch(vencedor) {
			
				case 0: //Empate
					System.out.println("Empatou!!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
					
				case 1:  //Desafiado vence
					System.out.println("Vitória do " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiado.perderLuta();
 					break;
				case 2:  //Desafiante vence
					System.out.println("Vitoria do " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiante.perderLuta();
					break;
				
			}
		} else {
			System.out.println("A luta não pode acontecer!");
		}
	
	}

	public Aula07Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Aula07Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Aula07Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Aula07Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	/*
	 * REGRAS
	 * 
	 *  -> Só pode ser marcada entre lutadores da mesma categoria.
	 *  
	 *  -> Desafiado e Desafiante devem ser lutadores diferentes.
	 *  
	 *  -> Só pode acontecer ser a luta for aprovada.
	 *  
	 *  -> Só pode ter vitoria de um lutador ou empate. 
	 */


}
