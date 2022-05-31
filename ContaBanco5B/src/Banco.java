
public class Banco {

	public static void main(String[] args) {
		
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Jubileu dos Santos");
		p1.abrirConta("CC");
		p1.depositar(100);
		p1.sacar(150);
		p1.fecharConta();
		p1.estadoAtual();
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Creuza Maria");
		p2.abrirConta("CP");
		p2.depositar(500);
		p2.sacar(100);
		p2.estadoAtual();
		

	}

}
