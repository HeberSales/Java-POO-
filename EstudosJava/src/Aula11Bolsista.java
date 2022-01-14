
public class Aula11Bolsista extends Aula11Pessoa {
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	@Override //função para sobrepor uma função já existente
	public void pagarMensalidade() {
		System.out.println(this.getNome() + "é bolsista! Pagamento facilitado.");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

}
