package projeto;

import java.util.Scanner;

public class Sobremesa extends Alimento {
	private double teorDeAcucar;

	public Sobremesa(String nomeDoAlimento, double preco, int quantidadeDoProduto, String codigo, double teorDeAcucar) {
		super(nomeDoAlimento, preco, quantidadeDoProduto, codigo);
		this.teorDeAcucar = teorDeAcucar;
	}

	public double getTeorDeAcucar() {
		return teorDeAcucar;
	}

	public void setTeorDeAcucar(double teorDeAcucar) {
		this.teorDeAcucar = teorDeAcucar;
	}

	@Override
	public String toString() {
		return super.toString() + ", [teorDeAcucar=" + teorDeAcucar + "], [Imposto=" + this.calcularImposto() + "]";
	}

	@Override
	public String getTipo() {
		return "Sobremesa";
	}

	@Override
	public double calcularImposto() {
		return 0.6 * this.getPreco();
	}

	@Override
	public void alterarAtributosEspecificos(Scanner scanner) {
		System.out.println("Deseja alterar o teor de acucar? s/n");
		String escolha = scanner.nextLine();
		if (escolha.equals("n")) {
			return;
		}

		System.out.println("Digite o novo teor de acucar:");
		double novoTeorDeAcucar = Double.valueOf(scanner.nextLine());
		this.setTeorDeAcucar(novoTeorDeAcucar);
	}
}
