package projeto;

import java.util.Scanner;

public class Bebida extends Alimento {
	private double teorAlcoolico;

	public Bebida(String nomeDoAlimento, double preco, int quantidadeDoProduto, String codigo, double teorAlcoolico) {
		super(nomeDoAlimento, preco, quantidadeDoProduto, codigo);
		this.teorAlcoolico = teorAlcoolico;
	}

	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	@Override
	public String toString() {
		return super.toString() + ", [teorAlcoolico=" + teorAlcoolico + "], [imposto=" + this.calcularImposto();
	}

	@Override
	public String getTipo() {
		return "Bebida";
	}

	@Override
	public double calcularImposto() {
		return 0.25 * this.getPreco();
	}
	@Override
	public void alterarAtributosEspecificos(Scanner scanner) {
		System.out.println("Deseja alterar o teor alcoolico? s/n");
		String escolha = scanner.nextLine();
		if (escolha.equals("n")) {
			return;
		} else {

		System.out.println("Digite o novo teor alcoolico:");
		double novoTeorAlcoolico = Double.valueOf(scanner.nextLine());
		this.setTeorAlcoolico(novoTeorAlcoolico);
		}
	}
}
//