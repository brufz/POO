
public class Hospede {
	private String nome;
	private int idade;
	private int rg;
	private int cpf;
	private char sexo;
	private boolean hospedado;
	
	
	
	public Hospede(String nome, int idade, int rg, int cpf, char sexo, boolean hospedado) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
		this.hospedado = false;
	}
	
	//getter e setter
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
	public int getRg() {
		return rg;
	}
	public void setRG(int rG) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCPF(int cPF) {
		this.cpf = cpf;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean getHospedado() {
		return hospedado;
	}
	public void setHospedado(boolean hospedado) {
		this.hospedado = hospedado;
	}


	
}

