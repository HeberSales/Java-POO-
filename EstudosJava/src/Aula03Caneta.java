
public class Aula03Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada; //private então só funciona aqui na classe.
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
		
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar!");
		}
		else {
			System.out.println("Estou rabiscando!");
		}
		
	}
	
	//criando tampar e destampar para podr usar o metodo Tampada que esta private
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}

}
