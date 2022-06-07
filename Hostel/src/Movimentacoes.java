import java.util.Scanner;

public class Movimentacoes {
	Scanner leitor = new Scanner (System.in);
	
	private float valorDiaria;
	private float valorReceber;
	private Hospede hospede;
	
	public Movimentacoes(float valorDiaria, float valorReceber, Hospede hospede) {
		super();
		this.valorDiaria = 100;
		this.valorReceber = valorReceber;
		this.hospede = hospede;
	}

	public void checkin (int qtdDias, Hospede h1) {
		System.out.println(h1.getNome());
		valorReceber = valorDiaria * qtdDias;
		System.out.println("Check-in realizado com sucesso");
	}

	
	public void checkout() {
		if(valorReceber > 0) {
			System.out.println("Hóspede possui contas em haver");
		} else {
			System.out.println("Check-out realizado com sucesso");
		}
		
	}

	public void consumir() {
		System.out.println("Digite o código do produto consumido: ");
		int opcao = leitor.nextInt();
		while (opcao != 5) {
		switch(opcao) {
			case 1:
				this.valorReceber = this.valorReceber + 20.0f;
			break;
			case 2:
				this.valorReceber = this.valorReceber + 10.0f;
			break;
			case 3:
				this.valorReceber = this.valorReceber + 7.5f;
			break;
			case 4:
				this.valorReceber = this.valorReceber + 5.0f;
			break;
			case 5:
				System.out.println("Sair");
			break;
			default:
				System.out.println("Código inválido");
		}	
		}
		
	}

	public Scanner getLeitor() {
		return leitor;
	}

	public void setLeitor(Scanner leitor) {
		this.leitor = leitor;
	}

	public float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public float getValorReceber() {
		return valorReceber;
	}

	public void setValorReceber(float valorReceber) {
		this.valorReceber = valorReceber;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

}
