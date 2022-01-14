//      System.out.println("");
public class Aula07Lutador {
	private String nome;
	private String nacionalidade;
	private	int idade;
	private float altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Aula07Lutador(String nome, String nacionalidade, int idade, float altura, double peso,
			 			int vitorias, int derrotas, int empates) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
		
	}
	
	public void apresentar() {
		System.out.println("----Informações do Lutador----");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Nacionalidade: " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Peso: " + this.getPeso() + "Kg ");
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Vitorias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
		
	}
	
	public void status() {
		System.out.println("---Status Lutador--- " );
		System.out.print(this.getNome());
		System.out.print(" é um peso " + this.getCategoria());
		System.out.print(" com " + this.getVitorias() + " Vitórias , ");
		System.out.print(this.getDerrotas() + " Derrotas e ");
		System.out.print(this.getEmpates() + " Empates! ");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria(); //categoria muda automaticamente ao mudar o peso
	}
	public String getCategoria() {
		return categoria;
	}
	// colocando categoria privada para somente eu mudar os pesos
	private void setCategoria() {
		// String leve, medio, pesado, invalido;
		
		if(this.getPeso() < 52.2) {
			this.categoria = "Inválido";
			
		} else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		} else if(this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		} else if(this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	// Metodos
	
	/*
	 * + apresentar()
	 * + status()
	 * + ganharLuta()
	 * + perderLuta()
	 * + empatarLuta()
	 * 
	 * 
	 * peso leve, medio, pesado.
	 * 
	 * se for menor que 52.2 é invalido
	 * entre 52.2 e 70.3 ou igual é leve
	 * acima de 70.3 e abaixo de 83.9 medio
	 * acima de 83.9 e abaixo incluindo 120.2 pesado
	 * se não é invalido tbm 
	 * 
	 */
	
	
}
