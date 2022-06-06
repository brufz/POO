
public class Ex09 {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro [3];

		p[0] = new Pessoa ("Pedro", 22, 'm');
		p[1] = new Pessoa ("Maria", 32, 'f');
		
		l[0] = new Livro ("Aprendendo Java", "José da Silva", 100, 0, false, p[0]);
		l[1] = new Livro ("Aprendendo POO", "Pedro Paulo", 500, 0, false, p[1]);
		l[2] = new Livro ("Java Avançado", "Maria Candido", 800, 0, false, p[0]);
		
		System.out.println(l[0].toString());
		System.out.println("----------------------");
		l[1].folhear(30);
		
		System.out.println(l[1].toString());
	}

}
