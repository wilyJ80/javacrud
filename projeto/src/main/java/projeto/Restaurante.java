package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {
	private ArrayList<Alimento> listaDeAlimentos;

	public Restaurante() {
		this.listaDeAlimentos = new ArrayList<>();
	}

	public void adicionarAlimento(Alimento alimento) {
		listaDeAlimentos.add(alimento);
	}

	public void listarAlimentos() {
		for (Alimento alimento : listaDeAlimentos) {
			System.out.println("Nome: " + alimento.getNomeDoAlimento());
			System.out.println("Tipo: " + alimento.getTipo());
			System.out.println("Codigo: " + alimento.getCodigo());
			System.out.println("Preco: " + alimento.getPreco());
			System.out.println("Taxa: " + alimento.calcularImposto());
			System.out.println();
		}
	}

	public Alimento consultarAlimento(String nomeDoAlimento, String codigo) {
		for (Alimento alimento : listaDeAlimentos) {
			if (alimento.getNomeDoAlimento().equals(nomeDoAlimento)) {
				return alimento;
			}

			if (alimento.getCodigo().equals(codigo)) {
				return alimento;
			}
		}

		Solido naoEncontrado = new Solido("naoEncontrado", 1, 1, "1", 1, 1);
		System.out.println("Alimento nao encontrado.");
		return naoEncontrado;
	}

	public void excluirAlimento(String nomeDoAlimento, String codigo) {
		for (Alimento alimento : listaDeAlimentos) {

			if (alimento.getNomeDoAlimento().equals(nomeDoAlimento)) {
				listaDeAlimentos.remove(alimento);
				System.out.println("Alimento excluido com sucesso: " + alimento.getNomeDoAlimento());
				return;
			}

			if (alimento.getCodigo().equals(codigo)) {
				listaDeAlimentos.remove(alimento);
				System.out.println("Alimento excluido com sucesso: " + alimento.getNomeDoAlimento());
				System.out.println();
				return;
			}
		}

		System.out.println("Alimento nao encontrado.");
	}

	public void alterarDadosAlimento(String nomeDoAlimento, String codigo, Scanner scanner) {
		Alimento encontrado = this.consultarAlimento(nomeDoAlimento, codigo);
		if (encontrado.getNomeDoAlimento().equals("naoEncontrado")) {
			return;
		}

		System.out.println("Digite o dado a ser alterado: ");
		System.out.println("1 - preco");
		System.out.println("2 - quantidade");
		System.out.println("3 - codigo");
		System.out.println("4 - atributos especificos");

		int entrada = Integer.valueOf(scanner.nextLine());

		switch (entrada) {

			case 1:
				System.out.println("Digite o novo preco: ");
				double preco = Double.valueOf(scanner.nextLine());
				encontrado.setPreco(preco);
				break;

			case 2:
				System.out.println("Digite a nova quantidade: ");
				int quantidade = Integer.valueOf(scanner.nextLine());
				encontrado.setQuantidadeDoProduto(quantidade);
				break;

			case 3:
				System.out.println("Digite o novo codigo: ");
				String codigoDoProduto = scanner.nextLine();
				encontrado.setCodigo(codigoDoProduto);
				break;

			case 4:
				encontrado.alterarAtributosEspecificos(scanner);

			default:
				break;
		}

	}

}
