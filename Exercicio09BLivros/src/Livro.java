
public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	

	
	@Override
	public String toString() {
		return "Livro: \n Titulo = " + titulo + " Autor = " + autor + 
				"\n Total de páginas = " + totalPaginas + " Página atual = "
				+ pagAtual + "\n Aberto = " + aberto + "\n Leitor = " + leitor.getNome() + 
				" Idade: " + leitor.getIdade() + " Sexo: " + leitor.getSexo();
	}

	public Livro(String titulo, String autor, int totalPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	// implements
	
	@Override
	public void abrir() {
		this.aberto = true;
		
	}

	@Override
	public void fechar() {
		this.aberto = false;
		
	}

	@Override
	public void folhear (int p) {
		abrir();
		if(this.pagAtual > this.totalPaginas) {
			this.pagAtual = 0;
		} else {
		this.pagAtual = p;
		}
	}

	@Override
	public void avancarPag() {
		abrir();
		this.pagAtual++;
		
	}

	@Override
	public void voltarPag() {
		abrir();
		this.pagAtual--;
		
	}

}
