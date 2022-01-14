
public class Aula06ControleRemoto {

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public Aula06ControleRemoto() {
		this.setVolume(50);
		this.setLigado(true);
		this.setTocando(false);
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int v) {
		this.volume = v;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean l) {
		this.ligado = l;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean t) {
		this.tocando = t;
	}
	
	//@Override
	public void ligar() {
		this.setLigado(true);
	}
	
	//@Override
	public void desligar() {
		this.setLigado(false);
	}
	
	//@Override
	public void abrirMenu() {
		System.out.println("-----MENU-----");
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando?" + this.getTocando());
		System.out.print("Volume: " + this.getVolume()); //somente print para colocar o for :)
		for(int i = 1; i <= this.getVolume(); i+=10) {
			System.out.print("|");
		}
	}
	
	//@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
	}
	
	//@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		}
		else {
			System.out.println("ERRO! Tv desligada!");
		}
	}
	
	//@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}
		else {
			System.out.println("ERRO! Tv desligada!");
		}
	}
	
	//@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		else {
			System.out.println("ERRO! Tv desligada!");
		}
	}
	
	//@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}	
	}
	
	//@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando()) ) {
			this.setTocando(true);
		}
	}
	
	//@Override
	public void pause() {
		
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
		
	}
}
