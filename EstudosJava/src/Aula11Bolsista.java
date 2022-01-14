
public class Aula11Bolsista extends Aula11Pessoa {
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	@Override //fun��o para sobrepor uma fun��o j� existente
	public void pagarMensalidade() {
		System.out.println(this.getNome() + "� bolsista! Pagamento facilitado.");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

}
