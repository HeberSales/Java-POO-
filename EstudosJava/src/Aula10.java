//Herança
public class Aula10 {

	public static void main(String[] args) {
		
		// Ex: classe Aluno extends Pessoa
		//Aluno é filho de Pessoa.
		// classe mae: pode ser chamada de Progenitora ou SuperClasse
		//Classe filho: Subclasse
		
		//Uma classe Abstrata não pode ser instanciada
		//só pode servir como progetora(mae)
		
		Aula10Pessoa p1 = new Aula10Pessoa();
		
		Aula10Aluno p2 = new Aula10Aluno();
		
		Aula10Professor p3 = new Aula10Professor();
		
		Aula10Funcionario p4 = new Aula10Funcionario();
		
		p1.setNome("Heber");
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		
		p1.setSexo("M");
		p2.setSexo("F");
		
		p2.setIdade(50);
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}

}
