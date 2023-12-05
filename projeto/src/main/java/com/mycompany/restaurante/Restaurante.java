/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {
    private static ArrayList<Menu> listaProdutos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    incluirItemMenu();
                    break;
                case 2:
                    consultarItemMenu();
                    break;
                case 3:
                    alterarItemMenu();
                    break;
                case 4:
                    excluirItemMenu();
                    break;
                case 5:
                    exibirListaItensMenu();
                    break;
                case 0:
                    System.out.println("Até logo! Volte sempre ao M&V Restaurantes.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        } while (opcao != 0);
    }

        private static void exibirMenu() {
            System.out.println("=== Menu do Restaurante ===");
            System.out.println("1 - Incluir novo item no menu");
            System.out.println("2 - Consultar item no menu");
            System.out.println("3 - Alterar dados de um item no menu");
            System.out.println("4 - Excluir item do menu");
            System.out.println("5 - Exibir lista de itens do menu");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
        }

    //TESTE
       private static void incluirItemMenu() {
    System.out.println("Qual tipo de item deseja incluir no menu?");
    System.out.println("1 - Prato");
    System.out.println("2 - Bebida");
    System.out.println("3 - Sobremesa");
    int tipo = scanner.nextInt();
    scanner.nextLine(); 

    switch (tipo) {
        case 1:
            criarEAdicionarPrato();
            break;
        case 2:
            criarEAdicionarBebida();
            break;
        case 3:
            criarEAdicionarSobremesa();
            break;
        default:
            System.out.println("Opção inválida.");
            break;
    }
}

private static void criarEAdicionarPrato() {
    Prato novoPrato = criarPrato();

    if (verificarExistenciaItem(novoPrato)) {
        System.out.println("Código ou nome já cadastrado! Insira outro código ou nome para o prato:");
        return;
    }

    listaProdutos.add(novoPrato);
    System.out.println("Prato adicionado com sucesso ao menu!");
}

private static void criarEAdicionarBebida() {
    Bebida novaBebida = criarBebida();

    if (verificarExistenciaItem(novaBebida)) {
        System.out.println("Código ou nome já cadastrado! Insira outro código ou nome para a bebida:");
        return;
    }

    listaProdutos.add(novaBebida);
    System.out.println("Bebida adicionada com sucesso ao menu!");
}

private static void criarEAdicionarSobremesa() {
    Sobremesa novaSobremesa = criarSobremesa();

    if (verificarExistenciaItem(novaSobremesa)) {
        System.out.println("Código ou nome já cadastrado! Insira outro código ou nome para a sobremesa:");
        return;
    }

    listaProdutos.add(novaSobremesa);
    System.out.println("Sobremesa adicionada com sucesso ao menu!");
}

private static boolean verificarExistenciaItem(Menu novoItem) {
    for (Menu item : listaProdutos) {
        if (item.getCodigo() == novoItem.getCodigo() || item.getNome().equalsIgnoreCase(novoItem.getNome())) {
            return true;
        }
    }
    return false;
}

    
        
    //TESTE

private static boolean verificarCodigoRepetido(int codigo, ArrayList<Menu> lista) {
    for (Menu item : lista) {
        if (item.getCodigo() == codigo) {
            return true;
        }
    }
    return false;
}

private static boolean verificarNomeRepetido(String nome, ArrayList<Menu> lista) {
    for (Menu item : lista) {
        if (item.getNome().equalsIgnoreCase(nome)) {
            return true;
        }
    }
    return false;
}
    


        private static void consultarItemMenu() {
        System.out.print("Digite o código do item do menu a ser consultado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        boolean encontrado = false;
        for (Menu item : listaProdutos) {
            if (item.getCodigo() == codigo) {
                item.exibirDetalhes();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Item do menu não encontrado.");
        }
    }

        private static void alterarItemMenu() {
        System.out.print("Digite o código do item do menu a ser alterado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        boolean encontrado = false;
        for (Menu item : listaProdutos) {
            if (item.getCodigo() == codigo) {
                encontrado = true;

                System.out.println("Digite o que deseja alterar:");
                System.out.println("1 - Nome");
                System.out.println("2 - Descrição");
                System.out.println("3 - Preço");
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o novo nome: ");
                        String novoNome = scanner.nextLine();
                        item.setNome(novoNome);
                        break;
                    case 2:
                        System.out.print("Digite a nova descrição: ");
                        String novaDescricao = scanner.nextLine();
                        item.setDescricao(novaDescricao);
                        break;
                    case 3:
                        System.out.print("Digite o novo preço: ");
                        double novoPreco = scanner.nextDouble();
                        scanner.nextLine(); // Limpar o buffer
                        item.setPreco(novoPreco);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Item do menu não encontrado.");
        } else {
            System.out.println("Item do menu alterado com sucesso.");
        }
    }

        private static void excluirItemMenu() {
        System.out.print("Digite o código do item do menu a ser excluído: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        boolean removido = false;
        for (Menu item : listaProdutos) {
            if (item.getCodigo() == codigo) {
                listaProdutos.remove(item);
                removido = true;
                break;
            }
        }

        if (removido) {
            System.out.println("Item do menu excluído com sucesso.");
        } else {
            System.out.println("Item do menu não encontrado.");
        }
    }

        private static void exibirListaItensMenu() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Não há itens do menu cadastrados.");
        } else {
            System.out.println("Lista de Itens do Menu:");
            for (Menu item : listaProdutos) {
                item.exibirDetalhes();
                System.out.println("-----------------------");
            }
        }
    }


private static Prato criarPrato() {
    System.out.println("--- Criação de novo Prato ---");

    System.out.print("Digite o código do prato: ");
    int codigo = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer

    System.out.print("Digite o nome do prato: ");
    String nome = scanner.nextLine();

    System.out.print("Digite a descrição do prato: ");
    String descricao = scanner.nextLine();

    System.out.print("Digite o preço do prato: ");
    double preco = scanner.nextDouble();
    scanner.nextLine(); // Limpar o buffer

    System.out.println("Selecione o tipo de cozinha:");
    System.out.println("1 - Brasileira");
    System.out.println("2 - Outros");
    int tipoCozinhaOpcao = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer

    String tipoCozinha;

    if (tipoCozinhaOpcao == 2) {
        tipoCozinha = "Outros";
    } else {
        tipoCozinha = "Brasileira";
    }

    Prato novoPrato = new Prato(codigo, nome, descricao, preco, tipoCozinha);

    return novoPrato;
}


private static Bebida criarBebida() {
    System.out.println("--- Criação de nova Bebida ---");

    System.out.print("Digite o código da bebida: ");
    int codigo = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer

    System.out.print("Digite o nome da bebida: ");
    String nome = scanner.nextLine();

    System.out.print("Digite a descrição da bebida: ");
    String descricao = scanner.nextLine();

    System.out.print("Digite o preço da bebida: ");
    double preco = scanner.nextDouble();
    scanner.nextLine(); // Limpar o buffer

    System.out.println("Bebida alcoólica?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    int alcoolica = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer

    Bebida novaBebida;

    if (alcoolica == 1) {
        novaBebida = new Bebida(codigo, nome, descricao, preco, true);
    } else {
        novaBebida = new Bebida(codigo, nome, descricao, preco, false);
    }

    return novaBebida;
}



private static Sobremesa criarSobremesa() {
    System.out.println("--- Criação de nova Sobremesa ---");

    int codigo;
    do {
        System.out.print("Digite o código da sobremesa: ");
        codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        if (verificarCodigoRepetido(codigo, listaProdutos)) {
            System.out.println("Alimento já cadastrado com esse código!");
        }
    } while (verificarCodigoRepetido(codigo, listaProdutos));

    String nome;
    do {
        System.out.print("Digite o nome da sobremesa: ");
        nome = scanner.nextLine();

        if (verificarNomeRepetido(nome, listaProdutos)) {
            System.out.println("Alimento já cadastrado com esse nome!");
        }
    } while (verificarNomeRepetido(nome, listaProdutos));

    System.out.print("Digite a descrição da sobremesa: ");
    String descricao = scanner.nextLine();

    System.out.print("Digite o preço da sobremesa: ");
    double preco = scanner.nextDouble();
    scanner.nextLine(); // Limpar o buffer

    System.out.print("Sobremesa Gourmet?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    int gourmet = scanner.nextInt();
    scanner.nextLine(); // Limpar o buffer

    boolean isGourmet = gourmet == 1;

    Sobremesa novaSobremesa = new Sobremesa(codigo, nome, descricao, preco, isGourmet);

    return novaSobremesa;
}


}
