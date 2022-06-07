import java.util.Scanner;

import javax.swing.JOptionPane;

public class Movimentacoes {
	Scanner leitor = new Scanner (System.in);
	
	private float valorDiaria;
	private float valorReceber;
	private Hospede hospede;
	
	public Movimentacoes(float valorDiaria, Hospede hospede) {
		super();
		this.valorDiaria = 100;
		this.hospede = hospede;
	}
	
	
	
	public void informacoes () {
		System.out.println("Nome: " + hospede.getNome());
		System.out.println("Idade: " + hospede.getIdade());
		System.out.println("RG: " + hospede.getRg());
		System.out.println("CPF: " + hospede.getCpf());
		System.out.println("Hospedado: " + hospede.getHospedado());
		System.out.println("Valor a receber: " + this.getValorReceber());
	}



	public void cobrar() {
		this.valorReceber = 0;
	}

	public void checkin (int qtdDias) {
		hospede.setHospedado(true);
		valorReceber = valorDiaria * qtdDias;
		System.out.println("Check-in realizado com sucesso");
	}
	
	
	public void checkout() {
		if(valorReceber > 0) {
			System.out.println("Hóspede " + hospede.getNome() + " possui contas em haver");
			cobrar();
		} else {
			hospede.setHospedado(false);
			System.out.println("Check-out realizado com sucesso");
		}
		
	}

	public void consumir() {
		int opcao = 0;
		while (opcao != 6) {
		System.out.println("Digite o código do produto consumido: \n"
					+ "1- Pizza \n"
					+ "2 - Lasanha \n"
					+ "3 - Cerveja \n"
					+ "4 - Refrigerante \n"
					+ "5-  Água  \n"
					+ "6 - Sair ");
		opcao = leitor.nextInt();
		
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
				this.valorReceber = this.valorReceber + 3.0f;
			case 6:
				System.out.println("Sair");
			break;
			default:
				System.out.println("Código inválido");
			break;
		}	
		}
		
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
