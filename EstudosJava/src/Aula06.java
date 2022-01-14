//encapsulamento
public class Aula06 {

	public static void main(String[] args) {
		
		Aula06ControleRemoto c = new Aula06ControleRemoto();
		
		c.ligar();
		c.play();
		c.maisVolume();
		c.maisVolume();
		c.ligarMudo();
		c.desligarMudo();
		
		c.desligar();
		c.menosVolume();
		
		
		
		c.abrirMenu();
		
		//por estar incapsulado não consigo dar setVolume por exemplo nem mudar nada diretamente
		//incapsulado / privado
		//c.setVolume(60);
		//c.volume = 80;
	}

}
