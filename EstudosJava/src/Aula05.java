//   System.out.println();
public class Aula05 {

	public static void main(String[] args) {
		
		Aula05ContaBanco c1 = new Aula05ContaBanco();
		c1.setNumConta(1111);
		c1.setDono("Heber");
		c1.abrirConta("CC");
		c1.depositar(100);
		
		Aula05ContaBanco c2 = new Aula05ContaBanco();
		c2.setNumConta(22222);
		c2.setDono("Hellem");
		c2.abrirConta("CP");
		c2.depositar(500);
		c2.sacar(1000);
		
		c1.sacar(150);
		c1.fecharConta();
		
		c1.estadoConta();
		c2.estadoConta();

		
	}

}
