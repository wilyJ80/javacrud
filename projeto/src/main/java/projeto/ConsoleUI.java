package projeto;

import java.util.Scanner;

public class ConsoleUI {

	public void iniciar() {

		Restaurante restaurante = new Restaurante();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Digite a opcao: ");
			System.out.println("1 - adicionar alimento");
			System.out.println("2 - listar alimentos");
			System.out.println("3 - consultar alimento");
			System.out.println("4 - excluir alimento");
			System.out.println("5 - alterar dados do alimento");
			System.out.println("0 - finalizar");
			System.out.println();

			int opcao = Integer.valueOf(scanner.nextLine());
			System.out.println();

			switch (opcao) {
				case 1:

					System.out.println("Digite o tipo de alimento a adicionar:");
					System.out.println("1 - Bebida");
					System.out.println("2 - Sobremesa");
					System.out.println("3 - Solido");

					int tipoDeAlimento = Integer.valueOf(scanner.nextLine());
					System.out.println();

					System.out.println("Insira o nome do alimento a adicionar: ");
					String nomeDoAlimento = scanner.nextLine();

					System.out.println("Insira o preco do alimento: ");

					double precoDoAlimento = Double.valueOf(scanner.nextLine());

					System.out.println("Digite a quantidade do alimento: ");
					int quantidadeDoAlimento = Integer.valueOf(scanner.nextLine());

					System.out.println("Digite o codigo do alimento: ");
					String codigoDoAlimento = scanner.nextLine();

					Alimento alimento = null;

					if (tipoDeAlimento == 1) {

						System.out.println("Digite o teor alcoolico:");
						double teorAlcoolico = Double.valueOf(scanner.nextLine());

						alimento = new Bebida(nomeDoAlimento, precoDoAlimento, quantidadeDoAlimento,
								codigoDoAlimento, teorAlcoolico);
						restaurante.adicionarAlimento(alimento);
						System.out.println();
					}

					else if (tipoDeAlimento == 2) {

						System.out.println("Digite o teor de acucar:");
						double teorDeAcucar = Double.valueOf(scanner.nextLine());

						alimento = new Sobremesa(nomeDoAlimento, precoDoAlimento, quantidadeDoAlimento,
								codigoDoAlimento, teorDeAcucar);
						restaurante.adicionarAlimento(alimento);
						System.out.println();
					}

					else if (tipoDeAlimento == 3) {

						System.out.println("Digite a porcao: ");
						double porcao = Double.valueOf(scanner.nextLine());
						System.out.println("Digite a temperatura: ");
						double temperatura = Double.valueOf(scanner.nextLine());

						alimento = new Solido(nomeDoAlimento, precoDoAlimento, quantidadeDoAlimento,
								codigoDoAlimento, porcao, temperatura);
						restaurante.adicionarAlimento(alimento);
						System.out.println();
					}

					break;

				case 2:

					System.out.println("Alimentos:");
					restaurante.listarAlimentos();
					System.out.println();
					break;

				case 3:

					System.out.println("Digite a opcao de consulta: ");
					System.out.println("1 - nome");
					System.out.println("2 - codigo");
					int entrada = Integer.valueOf(scanner.nextLine());

					if (entrada == 1) {
						System.out.println("Digite o nome do alimento: ");
						String nome = scanner.nextLine();
						Alimento encontrado = restaurante.consultarAlimento(nome, null);

						if (!encontrado.getNomeDoAlimento().equals("naoEncontrado")) {
							System.out.println(encontrado);
						}
						System.out.println();
						break;
					}

					if (entrada == 2) {
						System.out.println("Digite o codigo do alimento: ");
						String codigo = scanner.nextLine();
						Alimento encontrado = restaurante.consultarAlimento(null, codigo);

						if (!encontrado.getNomeDoAlimento().equals("naoEncontrado")) {
							System.out.println(encontrado);
						}

						System.out.println();
						break;
					}

					else {
						System.out.println("Opcao Invalida.");
						System.out.println();
						break;
					}

				case 4:
					System.out.println("Digite a opcao para excluir: ");
					System.out.println("1 - nome");
					System.out.println("2 - codigo");
					int paraExcluir = Integer.valueOf(scanner.nextLine());

					if (paraExcluir == 1) {
						System.out.println("Digite o nome do alimento: ");
						String nome = scanner.nextLine();
						restaurante.excluirAlimento(nome, null);
						break;
					}

					if (paraExcluir == 2) {
						System.out.println("Digite o codigo do alimento: ");
						String codigo = scanner.nextLine();
						restaurante.excluirAlimento(null, codigo);
						break;
					}

					else {
						System.out.println("Opcao Invalida.");
						break;
					}

				case 5:
					System.out.println("Digite a opcao de consulta: ");
					System.out.println("1 - nome");
					System.out.println("2 - codigo");
					int consulta = Integer.valueOf(scanner.nextLine());

					if (consulta == 1) {
						System.out.println("Digite o nome do alimento: ");
						String nome = scanner.nextLine();
						restaurante.alterarDadosAlimento(nome, null, scanner);
						break;
					}

					if (consulta == 2) {
						System.out.println("Digite o codigo do alimento: ");
						String codigo = scanner.nextLine();
						restaurante.alterarDadosAlimento(null, codigo, scanner);
						break;
					}

					else {
						System.out.println("Opcao Invalida.");
						break;
					}

				case 0:
					return;

				default:
					break;
			}

		}
	}
}
