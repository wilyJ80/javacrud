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
			System.out.println("0 - finalizar");
			System.out.println();

			int opcao = Integer.valueOf(scanner.nextLine());

			switch (opcao) {
				case 1:

					System.out.println("Digite o tipo de alimento: ");
					String tipo = scanner.nextLine();
					// metodo para reconhecer o tipo de produto
					System.out.println("Insira o alimento a adicionar: ");
					String entrada = scanner.nextLine();
					Alimento alimento = new Alimento(entrada);
					restaurante.adicionarAlimento(alimento);

					break;

				case 2:

					System.out.println("Alimentos:");
					restaurante.listarAlimentos();
					break;

				case 0:
					return;

				default:
					break;
			}

		}
	}
}
