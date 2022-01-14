
public abstract class Aula11Pessoa {
	private String nome;
	protected int idade; //posso usar this.idade = . em outra classe.
	private String sexo;
	
	public void fazerAniversario() {
		this.idade++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Aula11Pessoa [nome =" + nome + ", idade =" + idade + ", sexo =" + sexo + "]";
	}

	public void pagarMensalidade() {
		// TODO Auto-generated method stub
		
	}
	

}
