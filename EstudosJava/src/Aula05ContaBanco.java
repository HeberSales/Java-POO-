
public class Aula05ContaBanco {
	public int numConta;
 	protected String tipo; 
 	private String dono;
 	private float saldo;
 	private boolean status;
 	
	public void estadoConta() {
		
		System.out.println("-----INFORMAÇÔES-----");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo:" + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
 	
 	public Aula05ContaBanco() {
 		this.saldo = 0;
 		this.status = false;
 	}
 	
 	public void abrirConta(String t) {
 		this.setTipo(t);
 		this.setStatus(true);
 		
 		if (t == "CC") {
 			this.setSaldo(50);
 		}
 		else if (t == "CP") {
 			this.setSaldo(150);
 		}
 		System.out.println("Conta Aberta com sucesso! :) ");
 	}
 	
 	public void fecharConta() {
 		if(this.getSaldo() > 0) {
 			System.out.println("Conta com dinheiro!");
 		}
 		else if (this.getSaldo() < 0) {
 			System.out.println("Conta em débito");
 		}
 		else {
 			this.setStatus(false);
 			System.out.println("Conta fechada com sucesso! :)");
 		}
 	}
 	
 	public void depositar(float v) {
 		if(this.getStatus()) {
 			this.setSaldo(this.getSaldo() + v);
 			System.out.println("Deposito efetuado com sucesso na conta de " + this.getDono());
 		}
 		else {
 			System.out.println("Impossivel depositar!");
 		}
 	}
 	
 	public void sacar(float v) {
 		if(this.getStatus()) {
 			if(this.getSaldo() >= v) {
 				this.setSaldo(this.getSaldo() - v);
 				System.out.println("Saque realizado na conta de " + this.getDono());
 			}
 			else {
 	 			System.out.println("Saldo insuficiente para saque!! :( ");
 			}
 		}
 		else {
 			System.out.println("ERRO!! voce não tem uma conta :( ");
 		}
 	}
 	public void pagarMensalidade() {
 		
 		int v = 0;
 		
 		if(this.getTipo() == "CC") {
 			v = 12;
 		}
 		else if (this.getTipo() == "CP") {
 			v = 20;
 		}
 		if(this.getStatus()) {
 			this.setSaldo(this.getSaldo() - v);
 			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
 			}
 			else {
 				System.out.println("Impossivel pagar com uma conta fechada!");
 			}
 	}
 	
 	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int n) {
		this.numConta = n;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float s) {
		this.saldo = s;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean st) {
		this.status = st;
	}
}
/*
 	
 	----metodos-----
 	

 	+ depositar()
 	+ sacar()
 	+ pagarMensalidade()
 	
 	fazer getters and setters de todos os atributos
 	
 	construtor 
 	sempre que uma conta for criada o status vai ser definido como falso 
 	e o saldo vai ser 00,00
 
 */

//para poder depositar e sacar precisa ter uma conta aberta
//se quiser sacar tem que ter saldo e no maximo o valor total que tiver

//cada vez que pagarMensalidade for chamado, desconta do valor que tem na conta
//12,00 para cc e 20,00 cp

// tem que abrir conta, antes disso status é false

//Se abrir conta corrente(cc) ganha 50,00 e se for poupança(cp) 150,00



