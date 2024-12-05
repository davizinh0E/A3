package loja;

import java.text.NumberFormat;
import java.util.*;

class Main {

    public static double pedePreco(Scanner scanner) {
        System.out.print("Preço: ");

        String input = scanner.nextLine();

        double preco;

        try {
            preco = NumberFormat.getNumberInstance(new Locale("pt", "BR")).parse(input).doubleValue();

        } catch (Exception e) {

            System.out.print("O preço deve ser um número. ");
            preco = pedePreco(scanner);
        }
        return preco;
    }

    public static double pedePercentual(Scanner scanner) {
        System.out.print("Percentual de reajuste: ");

        String percentual = scanner.nextLine();

        double porcentagem;

        try {
            porcentagem = NumberFormat.getNumberInstance().parse(percentual).doubleValue();

        } catch (Exception e) {

            System.out.print("O percentual deve ser um número. ");
            porcentagem = pedePercentual(scanner);
        }
        return porcentagem;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro Produto");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();

        double preco = pedePreco(scanner);

        Produto produto1 = new Produto(nome1, preco);

        System.out.println("\nSegundo Produto");
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();
        double preco2 = pedePreco(scanner);

        Produto produto2 = new Produto(nome2, preco2);
        System.out.println("\nInformações do Primeiro Produto:");
        produto1.exibe();

        System.out.println("\nInformações do Segundo Produto:");
        produto2.exibe();

        System.out.println("\nNovo preço produto 1: ");
        produto1.reajustaPreco(pedePercentual(scanner));
        System.out.println("\nNovo preço produto 2: ");
        produto2.reajustaPreco(pedePercentual(scanner));

        System.out.println("\nInformações do Primeiro Produto (Reajuste):");
        produto1.exibe();

        System.out.println("\nInformações do Segundo Produto (Reajuste):");
        produto2.exibe();
    }
}