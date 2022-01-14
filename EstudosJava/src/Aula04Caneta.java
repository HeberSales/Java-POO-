
public class Aula04Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	private boolean tampada;
	
	/*metodo contrutor(mesmo nome da classe)----> Forma 1
	public Aula04Caneta() {
		this.tampar();
		this.cor = "Azul";
	}
	*/
	
	//---> Forma 2 do construtor
	public Aula04Caneta(String m, String c, float p) {
		this.setModelo(m);
		this.setCor(c);
		this.setPonta(p);
		this.tampar();
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA --> ");
		System.out.println("Modelo: " + this.getModelo()); //mesma coisa que ("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Tampada: " + this.tampada);
	}
}
