
//uma classe final não pode ter filhos
//ex : public final Aula11Aluno
public class Aula11Aluno extends Aula11Pessoa {
	private int matricula;
	private String curso;
	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade de " + this.getNome());
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
