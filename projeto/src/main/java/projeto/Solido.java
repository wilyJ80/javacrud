package projeto;

import java.util.Scanner;

public class Solido extends Alimento {
	private double porcao;
	private double temperatura;

	public Solido(String nomeDoAlimento, double preco, int quantidadeDoProduto, String codigo, double porcao,
			double temperatura) {
		super(nomeDoAlimento, preco, quantidadeDoProduto, codigo);
		this.porcao = porcao;
		this.temperatura = temperatura;
	}

	public double getPorcao() {
		return porcao;
	}

	public void setPorcao(double porcao) {
		this.porcao = porcao;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return super.toString() + ", [porcao=" + porcao + ", temperatura=" + temperatura + "], [Imposto="
				+ this.calcularImposto() + "]";
	}

	@Override
	public String getTipo() {
		return "Solido";
	}

	@Override
	public double calcularImposto() {
		return this.getPreco() + (0.3 * this.getPreco());
	}

	@Override
	public void alterarAtributosEspecificos(Scanner scanner) {
		System.out.println("Deseja alterar a porcao, temperatura, ou nada? p/t/n");
		String escolha = scanner.nextLine();
		if (escolha.equals("n")) {
			return;
		} else if (escolha.equals("p")) {

			System.out.println("Digite a nova porcao: ");
			double novaPorcao = Double.valueOf(scanner.nextLine());
			this.setPorcao(novaPorcao);
		} else if (escolha.equals("t")) {

			System.out.println("Digite a nova temperatura: ");
			double novaTemperatura = Double.valueOf(scanner.nextLine());
			this.setTemperatura(novaTemperatura);
		}
	}
}
