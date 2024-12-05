package loja;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteProduto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.println("\n--- SISTEMA DE GERENCIAMENTO DE PRODUTOS ---");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Reajustar Preço de Produto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = 0;
        try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Digite um número.");
                scanner.nextLine(); // Limpar buffer
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    double preco = 0;
                    while (true) {
                        try {
                            System.out.print("Digite o preço do produto (use ponto para decimais, ex: 10.50): ");
                            preco = scanner.nextDouble();

                            if (preco < 0) {
                                System.out.println("Preço não pode ser negativo. Tente novamente.");
                                scanner.nextLine(); // Limpar buffer
                                continue;
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Valor inválido. Use ponto para decimais (ex: 10.50)");
                            scanner.nextLine(); // Limpar buffer
                        }

                        Produto novoProduto = new Produto(nome, preco);
                        produtos.add(novoProduto);
                        System.out.println("Produto adicionado com sucesso!");
                        break;

                    
                    case 2:
                    // Listar Produtos
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else 
                        for (Produto p : produtos) {
                            p.exibe();
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case 3:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("Escolha o produto para reajuste:");
                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println((i + 1) + ". " + produtos.get(i).getNome());
                        }

                        int indiceProduto = 0;
                        while (true) {
                            try {
                                System.out.print("Número do produto: ");
                                indiceProduto = scanner.nextInt() - 1;

                                if (indiceProduto < 0 || indiceProduto >= produtos.size()) {
                                    System.out.println("Produto inválido. Tente novamente.");
                                    scanner.nextLine(); // Limpar buffer
                                    continue;
                                }
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Valor inválido. Digite um número.");
                                scanner.nextLine(); // Limpar buffer
                            }
                        }

                        double percentual = 0;
                        while (true) {
                            try {
                                System.out.print("Digite o percentual de reajuste: ");
                                percentual = scanner.nextDouble();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Valor inválido. Use ponto para decimais (ex: 10.50)");
                                scanner.nextLine(); // Limpar buffer
                            }
                        }

                        produtos.get(indiceProduto).reajustaPreco(percentual);
                        System.out.println("Preço reajustado com sucesso!");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
